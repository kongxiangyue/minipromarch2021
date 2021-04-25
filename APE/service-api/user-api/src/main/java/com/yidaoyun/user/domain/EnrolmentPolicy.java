package com.yidaoyun.user.domain;

import java.util.Date;
import java.io.Serializable;

/**
 * 招生政策表(EnrolmentPolicy)实体类
 */
public class EnrolmentPolicy implements Serializable {
    private static final long serialVersionUID = 349053391333682297L;
    /**
    * id
    */
    private Integer id;
    /**
    * 政策标题
    */
    private String policyTitle;
    /**
    * 政策详情
    */
    private String policyDetails;
    /**
    * 发布人id
    */
    private Integer userId;
    /**
    * 发布人姓名
    */
    private String userName;
    /**
    * 是否删除 0未删除 1已删除
    */
    private Integer delStatus;
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

    public String getPolicyTitle() {
        return policyTitle;
    }

    public void setPolicyTitle(String policyTitle) {
        this.policyTitle = policyTitle;
    }

    public String getPolicyDetails() {
        return policyDetails;
    }

    public void setPolicyDetails(String policyDetails) {
        this.policyDetails = policyDetails;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getDelStatus() {
        return delStatus;
    }

    public void setDelStatus(Integer delStatus) {
        this.delStatus = delStatus;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "EnrolmentPolicy{" +
                "id=" + id +
                ", policyTitle='" + policyTitle + '\'' +
                ", policyDetails='" + policyDetails + '\'' +
                ", userId=" + userId +
                ", userName='" + userName + '\'' +
                ", delStatus=" + delStatus +
                ", createTime=" + createTime +
                '}';
    }
}