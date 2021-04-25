package com.yidaoyun.activity.util;

import com.yidaoyun.activity.mapper.*;
import com.yidaoyun.base.feign.RemoteScheduleService;
import com.yidaoyun.base.util.BaseController;
import com.yidaoyun.redis.util.RedisUtils;
import com.yidaoyun.user.feign.RemoteUserService;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;

public class ThisController extends BaseController {

    @Autowired
    protected ActivityAgendaMapper activityAgendaMapper;

    @Autowired
    protected ActivityMapper activityMapper;

    @Autowired
    protected ActivityDetailMapper activityDetailMapper;

    @Autowired
    protected ActivityFileMapper activityFileMapper;

    @Autowired
    protected ActivityNoticeMapper activityNoticeMapper;

    @Autowired
    protected ActivityTypeMapper activityTypeMapper;

    @Autowired
    protected LiveEvaluationMapper liveEvaluationMapper;

    @Autowired
    protected SignUpTableMapper signUpTableMapper;

    @Autowired
    protected RemoteScheduleService scheduleService;

    @Autowired
    protected RemoteUserService remoteUserService;

    @Autowired
    protected RedisUtils redis;

    @Autowired
    protected RedissonClient redissonClient;

    @Autowired
    protected ActivityGlanceOverMapper activityGlanceOverMapper;

    @Autowired
    protected MyAttentionMapper myAttentionMapper;

    @Autowired
    protected  GiveLikeMapper giveLikeMapper;

}
