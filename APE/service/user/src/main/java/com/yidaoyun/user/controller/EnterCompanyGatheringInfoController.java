package com.yidaoyun.user.controller;

import com.yidaoyun.base.util.R;
import com.yidaoyun.user.domain.EnterCompanyGatheringInfo;
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
 * 入驻单位收款信息 提供者
 */
@RestController
@RequestMapping("enterCompanyGatheringInfo")
@Api(value = "入驻单位收款信息 提供者", tags = "入驻单位收款信息 提供者")
public class EnterCompanyGatheringInfoController extends ThisController {



}