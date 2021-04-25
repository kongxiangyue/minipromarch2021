package com.yidaoyun.user.controller;

import com.yidaoyun.base.util.R;
import com.yidaoyun.user.domain.CommonProblem;
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
 * 常见问题 提供者
 */
@RestController
@RequestMapping("commonProblem")
@Api(value = "常见问题 提供者", tags = "常见问题 提供者")
public class CommonProblemController extends ThisController {



}