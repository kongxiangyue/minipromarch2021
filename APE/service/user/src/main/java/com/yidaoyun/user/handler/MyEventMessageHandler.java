package com.yidaoyun.user.handler;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.StrUtil;
import com.yidaoyun.base.util.BaseException;
import com.yidaoyun.base.util.Constants;
import com.yidaoyun.redis.util.RedisUtils;
import com.yidaoyun.user.domain.CommonUser;
import com.yidaoyun.user.domain.EnterCompany;
import com.yidaoyun.user.mapper.CommonUserMapper;
import com.yidaoyun.user.mapper.EnterCompanyMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.weixin4j.WeixinException;
import org.weixin4j.model.message.OutputMessage;
import org.weixin4j.model.message.event.*;
import org.weixin4j.model.message.output.TextOutputMessage;
import org.weixin4j.model.user.User;
import org.weixin4j.spi.IEventMessageHandler;
import org.weixin4j.spring.WeixinTemplate;

import java.util.Date;
import java.util.List;

/**
 * 微信事件推送处理
 */
@Slf4j
@Component
public class MyEventMessageHandler implements IEventMessageHandler {

    @Autowired
    private WeixinTemplate weixinTemplate;
    @Autowired
    private CommonUserMapper commonUserMapper;
    @Autowired
    private RedisUtils redis;
    @Autowired
    private EnterCompanyMapper enterCompanyMapper;

    @Value("${wx.welcome}")
    private String welcome;

    @Override
    public OutputMessage subscribe(SubscribeEventMessage msg) {
        String openid = msg.getFromUserName();
        TextOutputMessage outputMessage = getSubscribeMessage(openid, null);
        if (ObjectUtil.isNull(outputMessage)) {
            outputMessage = new TextOutputMessage();
            //设置关注欢迎语
            String content = welcome.replaceAll("<br>", "\n");
            outputMessage.setContent(content);
        }
        return outputMessage;
    }

    @Override
    public OutputMessage unSubscribe(UnSubscribeEventMessage msg) {
        //todo 取消关注，是否要删除用户数据等等。。
        return null;
    }

    @Override
    public OutputMessage qrsceneSubscribe(QrsceneSubscribeEventMessage msg) {
        //未关注用户，扫描二维码关注事件
        String openid = msg.getFromUserName();
        String eventKey = msg.getEventKey();
        if ("bind".equals(StrUtil.subPre(eventKey, 4))) {
            return getBindOutputMessage(openid, eventKey);
        }
        TextOutputMessage outputMessage = getSubscribeMessage(openid, eventKey);
        if (ObjectUtil.isNull(outputMessage)) {
            outputMessage = new TextOutputMessage();
            //设置关注欢迎语
            String content = welcome.replaceAll("<br>", "\n");
            outputMessage.setContent(content);
        }
        return outputMessage;
    }

    @Override
    public OutputMessage qrsceneScan(QrsceneScanEventMessage msg) {
        String openid = msg.getFromUserName();
        String eventKey = msg.getEventKey();
        if ("bind".equals(StrUtil.subPre(eventKey, 4))) {
            return getBindOutputMessage(openid, eventKey);
        }
        return getSubscribeMessage(openid, eventKey);
    }

    private TextOutputMessage getSubscribeMessage(String openid, String eventKey) {
        try {
            User user = weixinTemplate.user().info(openid);
            String unionid = user.getUnionid();
            if (StrUtil.isBlank(unionid)) {
                throw new BaseException("用户unionid获取失败！");
            }
            //判断用户是否已经存在
            List<CommonUser> users = commonUserMapper.select(new CommonUser().setUnionid(unionid));
            if (CollUtil.isEmpty(users)) {
                CommonUser commonUser = new CommonUser()
                        .setUnionid(unionid)
                        .setHeadImage(user.getHeadimgurl().replace("http:", "https:"))
                        .setNickname(user.getNickname())
                        .setRegistrationTime(new Date())
                        .setAccountStatus(Constants.ACCOUNT_NORMAL)
                        .setOpenid(openid);
                //添加新用户
                commonUserMapper.insertSelective(commonUser);
            }else {
                //更新前期已关注用户openid未保存的问题
                if (StrUtil.isBlank(users.get(0).getOpenid())) {
                    CommonUser commonUser = new CommonUser().setOpenid(openid).setId(users.get(0).getId());
                    commonUserMapper.updateByPrimaryKeySelective(commonUser);
                }
            }
            //将扫描信息缓存
            if (StrUtil.isNotBlank(eventKey)) {
                String scene = StrUtil.subSufByLength(eventKey,32);
                sceneCache(scene, unionid);
            }
        } catch (WeixinException e) {
            TextOutputMessage message = new TextOutputMessage();
            message.setContent("登陆/注册失败，请稍后重试");
            e.printStackTrace();
            return message;
        }
        return null;
    }

    /**
     * 主办方绑定微信账号
     * @param openid openid
     * @param eventKey eventKey="bind"+enterCompanyId
     * @return message
     */
    private OutputMessage getBindOutputMessage(String openid, String eventKey) {
        TextOutputMessage message = new TextOutputMessage();
        try {
            User user = weixinTemplate.user().info(openid);
            Integer enterCompanyId = Integer.parseInt(StrUtil.subSuf(eventKey,4));
            EnterCompany enterCompany = new EnterCompany();
            enterCompany.setOpenid(openid);
            enterCompany.setHeadImage(user.getHeadimgurl().replace("http:","https:"));
            enterCompany.setNickname(user.getNickname());
            enterCompany.setId(enterCompanyId);
            enterCompanyMapper.updateByPrimaryKeySelective(enterCompany);
        } catch (WeixinException e) {
            message.setContent("绑定失败，请稍后重试");
            e.printStackTrace();
        }
        message.setContent("绑定成功");
        return message;
    }

    /**
     * 缓存scene，unionid到redis，10s过期
     */
    private void sceneCache(String scene, String unionid) {
        String wxScenePrefix = redis.generateRedisKey(Constants.WX_PREFIX, Constants.WX_SCENE, scene);
        redis.set(wxScenePrefix, unionid, 10);
    }

    @Override
    public OutputMessage location(LocationEventMessage msg) {
        return null;
    }

    @Override
    public OutputMessage click(ClickEventMessage msg) {
        return null;
    }

    @Override
    public OutputMessage view(ViewEventMessage msg) {
        return null;
    }

    @Override
    public OutputMessage scanCodePush(ScanCodePushEventMessage msg) {
        return null;
    }

    @Override
    public OutputMessage scanCodeWaitMsg(ScanCodeWaitMsgEventMessage msg) {
        return null;
    }

    @Override
    public OutputMessage picSysPhoto(PicSysPhotoEventMessage msg) {
        return null;
    }

    @Override
    public OutputMessage picPhotoOrAlbum(PicPhotoOrAlbumEventMessage msg) {
        return null;
    }

    @Override
    public OutputMessage picWeixin(PicWeixinEventMessage msg) {
        return null;
    }

    @Override
    public OutputMessage locationSelect(LocationSelectEventMessage msg) {
        return null;
    }

}
