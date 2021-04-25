package com.yidaoyun.user.controller;

import cn.hutool.core.lang.Validator;
import com.yidaoyun.base.util.Constants;
import com.yidaoyun.base.util.R;
import com.yidaoyun.base.util.RandomUtil;
import com.yidaoyun.redis.util.RedisUtils;
import com.yidaoyun.user.config.sms.SmsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 *
 */
@RestController
@RequestMapping("/sms")
@Api(value = "短信服务 提供者", tags = "短信服务 提供者")
public class SmsController {

    /**
     * 短信验证码有效期
     */
    @Value("${sms.intervals}")
    private int intervals;

    private final SmsService smsService;
    private final RedisUtils redisUtils;

    @Autowired
    public SmsController(SmsService smsService, RedisUtils redisUtils) {
        this.smsService = smsService;
        this.redisUtils = redisUtils;
    }

    @PostMapping("/send")
    @ApiOperation(value = "发送验证短信", notes = "发送验证短信")
    @ApiImplicitParams({
            @ApiImplicitParam(value = "手机号码", name = "tel", dataType = "String", required = true),
            @ApiImplicitParam(value = "短信类型（注册 0 修改密码 1）", name = "type", dataType = "Integer", required = true)
    })
    public R send(String tel, Integer type) {
        if (!Validator.isMobile(tel)) {
            return R.error("非法手机号码");
        }
        String code = RandomUtil.randomInt(6);
        String phoneKey = redisUtils.generateRedisKey(Constants.SMS_PREFIX, tel);
        boolean result = false;
        if (Constants.SMS_TYPE_REGISTERED == type) {
            result = smsService.sendRegisterSms(tel, code);
        } else if (Constants.SMS_TYPE_CHANGE_PASSWORD == type) {
            result = smsService.sendChangePasswordSms(tel, code);
        }
        if (result) {
            redisUtils.set(phoneKey, code, intervals * 60);
            Map<String, Object> map = new HashMap<>(16);
            map.put("interval", intervals * 60);
            return R.ok(map);
        }
        return R.error("短信发送失败，请与管理员联系");
    }

    @GetMapping("/info")
    @ApiOperation(value = "获取短信账户信息", notes = "获取短信账户信息")
    public R info() {
        Map<String, Object> result = smsService.queryAccountInfo();
        if ("000000".equals(result.get("statusCode"))) {
            return R.ok(result);
        }
        return R.error(result.get("statusMsg").toString());
    }

}
