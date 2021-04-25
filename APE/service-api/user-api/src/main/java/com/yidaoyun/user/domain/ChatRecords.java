package com.yidaoyun.user.domain;

import java.util.Date;
import java.io.Serializable;

/**
 *  聊天记录表(ChatRecords)实体类
 */
public class ChatRecords implements Serializable {
    private static final long serialVersionUID = 583481139371942118L;
    /**
    * id
    */
    private Integer id;
    /**
    * 聊天对话框id
    */
    private Integer dialogBoxId;
    /**
    * 问题
    */
    private String question;
    /**
    * 回答
    */
    private String answer;
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
    *  0不能回答 1能回答
    */
    private String state;
    /**
    * 本表的问题id
    */
    private Integer recordsId;
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

    public Integer getDialogBoxId() {
        return dialogBoxId;
    }

    public void setDialogBoxId(Integer dialogBoxId) {
        this.dialogBoxId = dialogBoxId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getRecordsId() {
        return recordsId;
    }

    public void setRecordsId(Integer recordsId) {
        this.recordsId = recordsId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}