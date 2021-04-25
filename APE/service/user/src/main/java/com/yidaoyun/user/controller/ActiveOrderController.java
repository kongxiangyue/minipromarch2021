package com.yidaoyun.user.controller;

import com.yidaoyun.base.util.R;
import com.yidaoyun.user.domain.ActiveOrder;
import com.yidaoyun.user.util.ThisController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Example;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * 活动订单 提供者
 */
@RestController
@RequestMapping("activeOrder")
@Api(value = "活动订单 提供者", tags = "活动订单 提供者")
public class ActiveOrderController extends ThisController {



}