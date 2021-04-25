package com.yidaoyun.user.controller;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.StrUtil;
import com.yidaoyun.base.util.R;
import com.yidaoyun.user.domain.ActivityQrcode;
import com.yidaoyun.user.handler.MiniProgramService;
import com.yidaoyun.user.util.ThisController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;


/**
 * 活动二维码 提供者
 */
@RestController
@RequestMapping("activityQrcode")
@Api(value = "活动二维码 提供者", tags = "活动二维码 提供者")
public class ActivityQrcodeController extends ThisController {



}