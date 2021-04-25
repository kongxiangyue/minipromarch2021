package com.yidaoyun.advertising.util;

import com.yidaoyun.activity.feign.RemoteActivityService;
import com.yidaoyun.administrator.feign.RemoteAdministratorService;
import com.yidaoyun.advertising.mapper.AdvertisingMapper;
import com.yidaoyun.base.util.BaseController;
import com.yidaoyun.redis.util.RedisUtils;
import com.yidaoyun.user.feign.RemoteUserService;
import org.springframework.beans.factory.annotation.Autowired;

public class ThisController extends BaseController {

    @Autowired
    protected AdvertisingMapper advertisingMapper;

    @Autowired
    protected RemoteAdministratorService remoteAdministratorService;

    @Autowired
    protected RemoteUserService remoteUserService;

    @Autowired
    protected RemoteActivityService remoteActivityService;

    @Autowired
    protected RedisUtils redis;

}
