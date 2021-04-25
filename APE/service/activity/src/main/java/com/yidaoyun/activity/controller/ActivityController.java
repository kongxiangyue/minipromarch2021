package com.yidaoyun.activity.controller;

import cn.hutool.core.collection.CollUtil;
import com.yidaoyun.activity.bean.dto.MyAttentionDTO;
import com.yidaoyun.activity.bean.vo.ActivityVO;
import com.yidaoyun.activity.config.ActivityJob4ChangeStatusManage;
import com.yidaoyun.activity.config.ActivityJob4EventIsAboutToStartManage;
import com.yidaoyun.activity.domain.*;
import com.yidaoyun.activity.util.ThisController;
import com.yidaoyun.administrator.annotation.HasPermissions;
import com.yidaoyun.base.condition.ScheduleCondition;
import com.yidaoyun.base.util.BaseException;
import com.yidaoyun.base.util.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.models.auth.In;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Example;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.*;
import java.util.stream.Collectors;

/**
 * 活动 提供者
 */
@RestController
@RequestMapping("activity")
@Api(value = "活动 提供者", tags = "活动 提供者")
@Slf4j
public class ActivityController extends ThisController {

}
