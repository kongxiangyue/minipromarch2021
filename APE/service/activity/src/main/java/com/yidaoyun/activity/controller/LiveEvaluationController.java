package com.yidaoyun.activity.controller;

import com.alibaba.fastjson.JSON;
import com.yidaoyun.activity.domain.LiveEvaluation;
import com.yidaoyun.activity.mapper.LiveEvaluationMapper;
import com.yidaoyun.activity.util.ThisController;
import com.yidaoyun.base.util.R;
import com.yidaoyun.user.domain.CommonUser;
import com.yidaoyun.user.feign.RemoteUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Example;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * 直播评价 提供者
 */
@RestController
@RequestMapping("liveEvaluation")
@Api(value = "直播评价 提供者", tags = "直播评价 提供者")
public class LiveEvaluationController extends ThisController {



}