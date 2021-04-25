package com.yidaoyun.activity.config;

import com.alibaba.fastjson.JSON;
import com.yidaoyun.base.condition.ScheduleCondition;
import lombok.extern.slf4j.Slf4j;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Slf4j
public class ActivityJob4EventIsAboutToStartManage{

    private static final String prefix4JobName = "JobName-ActivityJob4EventIsAboutToStart:";

    private static final String targetBeanName = "activityJob4EventIsAboutToStart";

    private static final String targetMethodName = "run";

    private static final String type = "uncode-single-task";

    public static ScheduleCondition getScheduleCondition4Add(Integer activityId, Date date) {
        ScheduleCondition condition = new ScheduleCondition();
        condition.setUuid(prefix4JobName + activityId);
        condition.setTargetBean(targetBeanName).setTargetMethod(targetMethodName).setType(type);
        Map<String, Object> map = new HashMap<>();
        map.put("activityId", activityId);
        condition.setParams(JSON.toJSONString(map));
        condition.setStartTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date));
        return condition;
    }


    public static ScheduleCondition getScheduleCondition4Update(Integer activityId, Date date) {
        ScheduleCondition condition = new ScheduleCondition();
        condition.setUuid(prefix4JobName + activityId);
        condition.setTargetBean(targetBeanName).setTargetMethod(targetMethodName).setType(type);
        condition.setStartTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date));
        return condition;
    }

    public static ScheduleCondition getScheduleCondition4Remove(Integer activityId) {
        ScheduleCondition condition = new ScheduleCondition();
        condition.setUuid(prefix4JobName + activityId);
        return condition;
    }

    public static Date getDate4EventIsAboutToStart(Date date) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.DAY_OF_MONTH, -1);
        String format = new SimpleDateFormat("yyyy-MM-dd").format(c.getTime()) + " 10:00:00";
        try {
            date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(format);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

}
