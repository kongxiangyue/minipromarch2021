package com.yidaoyun.activity.config;

import com.alibaba.fastjson.JSON;
import com.yidaoyun.base.condition.ScheduleCondition;
import lombok.extern.slf4j.Slf4j;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Slf4j
public class ActivityJob4ChangeStatusManage{

    private static final String prefix4JobName = "JobName-ActivityJob4ChangeStatus:";

    private static final String targetBeanName = "activityJob4ChangeStatus";

    private static final String targetMethodName = "run";

    private static final String type = "uncode-single-task";

    public static ScheduleCondition getScheduleCondition4Add(Integer activityId, Integer checkStatus, Date date) {
        ScheduleCondition condition = new ScheduleCondition();
        String suffix4Data = activityId + "," + checkStatus;
        condition.setUuid(prefix4JobName + suffix4Data);
        condition.setTargetBean(targetBeanName).setTargetMethod(targetMethodName).setType(type);
        Map<String, Object> map = new HashMap<>();
        map.put("activityId", activityId);
        map.put("checkStatus", checkStatus);
        condition.setParams(JSON.toJSONString(map));
        condition.setStartTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date));
        return condition;
    }


    public static ScheduleCondition getScheduleCondition4Update(Integer activityId, Integer checkStatus, Date date) {
        ScheduleCondition condition = new ScheduleCondition();
        String suffix4Data = activityId + "," + checkStatus;
        condition.setUuid(prefix4JobName + suffix4Data);
        condition.setTargetBean(targetBeanName).setTargetMethod(targetMethodName).setType(type);
        condition.setStartTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date));
        return condition;
    }

    public static ScheduleCondition getScheduleCondition4Remove(Integer activityId, Integer checkStatus) {
        ScheduleCondition condition = new ScheduleCondition();
        String suffix4Data = activityId + "," + checkStatus;
        condition.setUuid(prefix4JobName + suffix4Data);
        return condition;
    }

}
