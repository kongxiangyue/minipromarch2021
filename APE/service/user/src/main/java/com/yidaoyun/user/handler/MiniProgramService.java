package com.yidaoyun.user.handler;

import cn.hutool.core.codec.Base64;
import cn.hutool.core.util.StrUtil;
import com.alibaba.fastjson.JSONObject;
import com.yidaoyun.base.util.Constants;
import com.yidaoyun.base.util.FileUploadUtils;
import com.yidaoyun.redis.util.RedisUtils;
import com.yidaoyun.user.config.dfs.DfsConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.weixin4j.Configuration;
import org.weixin4j.WeixinException;
import org.weixin4j.http.HttpsClient;
import org.weixin4j.http.Response;
import org.weixin4j.model.base.Token;
import org.weixin4j.spring.WeixinTemplate;

import java.io.*;

/**
 * 小程序接口类
 */
@Slf4j
@Component
public class MiniProgramService {

    @Autowired
    private RedisUtils redis;
    @Autowired
    private WeixinTemplate weixinTemplate;
    @Autowired
    private DfsConfig dfsConfig;


    /**
     * 获取小程序access_token
     * @param appId appId
     * @param secret secret
     * @return access_token
     */
    public String getAccessToken(String appId, String secret) {
        try {
            String wxAccessPrefix = redis.generateRedisKey(Constants.WX_PREFIX, Constants.APPLET_WX_ACCESS);
            String accessToken = redis.get(wxAccessPrefix);
            if (StrUtil.isNotBlank(accessToken)) {
                return accessToken;
            }
            String param = "?grant_type=client_credential&appid=" + appId + "&secret=" + secret;
            HttpsClient http = new HttpsClient();
            Response res = http.get("https://api.weixin.qq.com/cgi-bin/token" + param);
            JSONObject jsonObj = res.asJSONObject();
            if (jsonObj == null) {
                throw new WeixinException(weixinTemplate.base().getCause(-1));
            } else {
                if (Configuration.isDebug()) {
                    System.out.println("getAccessToken返回json：" + jsonObj.toString());
                }
                Object errcode = jsonObj.get("errcode");
                if (errcode != null) {
                    throw new WeixinException(weixinTemplate.base().getCause(jsonObj.getIntValue("errcode")));
                } else {
                    Token token = JSONObject.toJavaObject(jsonObj, Token.class);
                    String access = token.getAccess_token();
                    //ticket.getExpires_in() - 600L，是为了提前10分钟过期
                    redis.set(wxAccessPrefix, access, 6600L);
                    return access;
                }
            }
        } catch (WeixinException e) {
            e.printStackTrace();
        }
        return null;
    }


    /**
     * 获取小程序码
     *
     * 适用于需要的码数量极多的业务场景。通过该接口生成的小程序码，永久有效，数量暂无限制。</p>
     *
     * @param scene 场景值，最大32个可见字符，只支持数字，大小写英文以及部分特殊字符
     * @param accessToken accessToken
     * @return 小程序码
     */
    public String getWxCodeBase64Unlimited(String scene, String accessToken) {
        JSONObject postData = new JSONObject();
        postData.put("scene", scene);
//        //跳转的页面,如果不填写这个字段，默认跳主页面
//        postData.put("page", null);
//        //width 二维码的宽度，单位 px，最小 280px，最大 1280px
//        postData.put("width", 430);
//        //auto_color 是否自动配置线条颜色
//        postData.put("auto_color", false);
//        //rgb RGB颜色值数组，auto_color 为 false 时生效，使用 rgb 设置颜色
//        JSONObject rgbJson = new JSONObject();
//        rgbJson.put("r", 0);
//        rgbJson.put("g", 0);
//        rgbJson.put("b", 0);
//        postData.put("rgb", rgbJson);
//        //is_hyaline 是否需要透明底色，为 true 时，生成透明底色的小程序
//        postData.put("is_hyaline", false);
        //创建请求对象
        HttpsClient http = new HttpsClient();
        //调用创建Tick的access_token接口
        try {
            Response res = http.post("https://api.weixin.qq.com/wxa/getwxacodeunlimit?access_token=" + accessToken, postData);
            InputStream is = res.asStream();
            return Base64.encode(is);
        } catch (WeixinException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 获取小程序二维码的地址
     *
     * 适用于需要的码数量极多的业务场景。通过该接口生成的小程序码，永久有效，数量暂无限制。</p>
     *
     * @param scene 场景值，最大32个可见字符，只支持数字，大小写英文以及部分特殊字符
     * @param accessToken accessToken
     * @return 小程序码
     */
    public String getWxCodeUrl(String scene, String accessToken) {
        JSONObject postData = new JSONObject();
        postData.put("scene", scene);
        //创建请求对象
        HttpsClient http = new HttpsClient();
        //调用创建Tick的access_token接口
        try {
            Response res = http.post("https://api.weixin.qq.com/wxa/getwxacodeunlimit?access_token=" + accessToken, postData);
            InputStream is = res.asStream();
            // 上传文件路径
            String filePath = dfsConfig.getPath();
            String fileName = FileUploadUtils.uploadInputStream(filePath, is);
            return dfsConfig.getDomain() + fileName;
        } catch (WeixinException | IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * is to file
     * @param ins is
     * @param file file
     */
    public void inputStreamToFile(InputStream ins,File file){
        try {
            OutputStream os = new FileOutputStream(file);
            int bytesRead;
            byte[] buffer = new byte[8192];
            while ((bytesRead = ins.read(buffer, 0, 8192)) != -1) {
                os.write(buffer, 0, bytesRead);
            }
            os.close();
            ins.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
