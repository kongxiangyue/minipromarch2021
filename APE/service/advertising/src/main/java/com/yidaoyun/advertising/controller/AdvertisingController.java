package com.yidaoyun.advertising.controller;

import com.alibaba.fastjson.JSON;
import com.yidaoyun.activity.domain.Activity;
import com.yidaoyun.administrator.domain.AdministratorUser;
import com.yidaoyun.advertising.domain.Advertising;
import com.yidaoyun.advertising.util.ThisController;
import com.yidaoyun.base.util.R;
import com.yidaoyun.base.util.ServletUtils;
import com.yidaoyun.user.domain.EnterCompany;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Example;

import javax.servlet.http.HttpServletRequest;
import java.util.*;
import java.util.stream.Collectors;

/**
 * 广告 提供者
 */
@RestController
@RequestMapping("advertising")
@Api(value = "广告 提供者", tags = "广告 提供者")
public class AdvertisingController extends ThisController {



}