package com.yidaoyun.activity.config;

import com.yidaoyun.activity.domain.Activity;
import com.yidaoyun.activity.domain.SignUpTable;
import com.yidaoyun.activity.mapper.ActivityMapper;
import com.yidaoyun.activity.mapper.SignUpTableMapper;
import com.yidaoyun.user.feign.RemoteUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

import java.util.List;

@Component
public class SchedulingTask {

    @Autowired
    private ActivityMapper activityMapper;

    @Autowired
    private SignUpTableMapper signUpTableMapper;

    @Autowired
    private RemoteUserService remoteUserService;

    @Scheduled(cron = "0 0 17 * * ?")
    public void toDoReminder() {
        List<Activity> list = activityMapper.select(new Activity().setCheckStatus(2));
        if (!ObjectUtils.isEmpty(list)) {
            list.forEach(x -> {
                Integer activityId = x.getId();
                Integer enterCompanyId = x.getEnterCompanyId();
                String remark = "【" + x.getActivityTitle() + "】待审核"
                        + signUpTableMapper.selectCount(new SignUpTable().setActivityId(activityId).setStatus(1))
                        + "人，累计"
                        + signUpTableMapper.selectCount(new SignUpTable().setActivityId(activityId))
                        + "人报名，累计"
                        + signUpTableMapper.selectCount(new SignUpTable().setActivityId(activityId).setStatus(7))
                        + "人取消报名，请及时处理。";
                remoteUserService.toDoReminder(enterCompanyId, remark);
            });
        }
    }

}
