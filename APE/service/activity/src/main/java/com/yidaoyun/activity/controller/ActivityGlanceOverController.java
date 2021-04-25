package com.yidaoyun.activity.controller;

import com.yidaoyun.activity.bean.vo.ActivitySignUpTotalVO;
import com.yidaoyun.activity.domain.ActivityGlanceOver;
import com.yidaoyun.activity.util.ThisController;
import com.yidaoyun.base.util.R;
import com.yidaoyun.base.util.ResponsePagingVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.time.DateUtils;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


/**
 * 活动浏览记录表(ActivityGlanceOver)表控制层
 */


@RestController
@RequestMapping("activityGlanceOver")
@Api(value = "活动浏览", tags = "活动浏览")
@Slf4j
public class ActivityGlanceOverController extends ThisController {




}