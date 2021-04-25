package com.yidaoyun.user.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.weixin4j.spring.web.WeixinJieruController;

import javax.servlet.http.HttpServletRequest;

/**
 * 微信接入验证控制器
 */
@RestController
@RequestMapping("/weChat")
public class WeChatController extends WeixinJieruController {

    @Override
    public String getToken(HttpServletRequest httpServletRequest) {
        return "yidaoyun";
    }

}
