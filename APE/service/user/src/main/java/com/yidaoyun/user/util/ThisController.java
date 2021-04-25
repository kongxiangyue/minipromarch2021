package com.yidaoyun.user.util;

import com.yidaoyun.activity.feign.RemoteActivityService;
import com.yidaoyun.base.util.BaseController;
import com.yidaoyun.redis.util.RedisUtils;
import com.yidaoyun.user.mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

public class ThisController extends BaseController {

    @Autowired
    protected ActiveOrderMapper activeOrderMapper;

    @Autowired
    protected ActivityQrcodeMapper activityQrcodeMapper;

    @Autowired
    protected CommonProblemMapper commonProblemMapper;

    @Autowired
    protected CommonUserMapper commonUserMapper;

    @Autowired
    protected EnterCompanyMapper enterCompanyMapper;

    @Autowired
    protected EnterCompanyGatheringInfoMapper enterCompanyGatheringInfoMapper;

    @Autowired
    protected MyAttentionMapper myAttentionMapper;

    @Autowired
    protected SelfHelpCustomerServiceMapper selfHelpCustomerServiceMapper;

    @Autowired
    protected RemoteActivityService remoteActivityService;

    @Autowired
    protected RestTemplate restTemplate;

    @Autowired
    protected RedisUtils redis;

    @Autowired
    protected NewsInfoMapper newsInfoMapper;

    @Autowired
    protected NoticeAnnouncementMapper noticeAnnouncementMapper;

    @Autowired
    protected ChatDialogBoxMapper chatDialogBoxMapper;

    @Autowired
    protected ChatRecordsMapper chatRecordsMapper;

    @Autowired
    protected ChatQuestionMapper chatQuestionMapper;

    @Autowired
    protected ActivityMapper activityMapper;

}
