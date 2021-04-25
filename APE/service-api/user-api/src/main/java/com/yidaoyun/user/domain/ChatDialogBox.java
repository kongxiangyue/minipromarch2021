package com.yidaoyun.user.domain;

import java.util.Date;
import java.io.Serializable;

/**
 * 聊天对话框表(ChatDialogBox)实体类
 */
public class ChatDialogBox implements Serializable {
    private static final long serialVersionUID = -63107590610967224L;
    /**
    * id
    */
    private Integer id;
    /**
    * 普通用户id
    */
    private Integer commonUserId;
    /**
    * 活动id
    */
    private Integer activityId;
    /**
    * 默认1  1机器 2客服
    */
    private Integer type;
    /**
    * 创建时间
    */
    private Date createTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCommonUserId() {
        return commonUserId;
    }

    public void setCommonUserId(Integer commonUserId) {
        this.commonUserId = commonUserId;
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}