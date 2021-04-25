package com.yidaoyun.activity.controller;

import com.yidaoyun.activity.domain.ActivityFile;
import com.yidaoyun.activity.util.ThisController;
import com.yidaoyun.base.util.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Example;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * 活动文件 提供者
 */
@RestController
@RequestMapping("activityFile")
@Api(value = "活动文件 提供者", tags = "活动文件 提供者")
public class ActivityFileController extends ThisController {


}