package com.yidaoyun.activity.domain;

import com.yidaoyun.base.util.BaseEntity;

import java.util.Date;
import java.io.Serializable;

/**
 * 活动浏览记录表(ActivityGlanceOver)实体类
 */
public class ActivityGlanceOver  extends BaseEntity  {
    /**
    * id
    */
    private Integer id;
    /**
    * 活动id
    */
    private Integer activityId;
    /**
    * 浏览人id
    */
    private Integer commonUserId;
    /**
    * 浏览时间
    */
    private Date glanceOverTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public Integer getCommonUserId() {
        return commonUserId;
    }

    public void setCommonUserId(Integer commonUserId) {
        this.commonUserId = commonUserId;
    }

    public Date getGlanceOverTime() {
        return glanceOverTime;
    }

    public void setGlanceOverTime(Date glanceOverTime) {
        this.glanceOverTime = glanceOverTime;
    }

}