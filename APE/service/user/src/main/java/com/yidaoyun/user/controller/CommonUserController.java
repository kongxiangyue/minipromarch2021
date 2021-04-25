package com.yidaoyun.user.controller;

import cn.hutool.core.util.IdUtil;
import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.StrUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.yidaoyun.activity.domain.Activity;
import com.yidaoyun.activity.domain.SignUpTable;
import com.yidaoyun.administrator.annotation.HasPermissions;
import com.yidaoyun.base.util.*;
import com.yidaoyun.user.domain.CommonUser;
import com.yidaoyun.user.util.ThisController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;
import org.weixin4j.WeixinException;
import org.weixin4j.model.message.template.Miniprogram;
import org.weixin4j.model.message.template.TemplateData;
import org.weixin4j.model.message.template.TemplateMessage;
import org.weixin4j.model.qrcode.QrcodeType;
import org.weixin4j.spring.WeixinTemplate;
import tk.mybatis.mapper.entity.Example;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

/**
 * 普通用户 提供者
 */
@RestController
@RequestMapping("commonUser")
@Api(value = "普通用户 提供者", tags = "普通用户 提供者")
@Slf4j
public class CommonUserController extends ThisController {



}
