package com.yidaoyun.user.domain;

import com.yidaoyun.base.util.BaseEntity;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
import java.io.Serializable;

/**
 * 新闻资讯(NewsInfo)实体类
 */
public class NewsInfo extends BaseEntity {
    /**
    * id
    */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "JDBC")
    private Integer id;
    /**
    * 预览图
    */
    private String preview;
    /**
    * 通知标题
    */
    private String noticeTitle;
    /**
    * 相关活动编号
    */
    private String relatedActivityNumber;
    /**
    * 关键词
    */
    private String keywords;
    /**
    * 发布人角色
    */
    private String releasePersonRole;
    /**
    * 发布人
    */
    private String releasePerson;
    /**
    * 发布时间
    */
    private Date releaseTime;
    /**
    * 新闻详情
    */
    private String newsDetail;
    /**
    * 删除状态（1：正常 0：已删除）
    */
    private Integer delStatus;
    /**
    * 审核状态（1：成功 0：失败）
    */
    private Integer checkStatus;
    /**
    * 审核时间
    */
    private Date checkTime;
    /**
    * 审核人联系方式
    */
    private String checkPersonContact;
    /**
    * 审核备注
    */
    private String checkRemark;

    @ApiModelProperty(value = "浏览量")
    private Long pageView;
    @ApiModelProperty(value = "新闻链接")
    private String newsLink;

    public Long getPageView() {
        return pageView;
    }

    public void setPageView(Long pageView) {
        this.pageView = pageView;
    }

    public String getNewsLink() {
        return newsLink;
    }

    public void setNewsLink(String newsLink) {
        this.newsLink = newsLink;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPreview() {
        return preview;
    }

    public void setPreview(String preview) {
        this.preview = preview;
    }

    public String getNoticeTitle() {
        return noticeTitle;
    }

    public void setNoticeTitle(String noticeTitle) {
        this.noticeTitle = noticeTitle;
    }

    public String getRelatedActivityNumber() {
        return relatedActivityNumber;
    }

    public void setRelatedActivityNumber(String relatedActivityNumber) {
        this.relatedActivityNumber = relatedActivityNumber;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getReleasePersonRole() {
        return releasePersonRole;
    }

    public void setReleasePersonRole(String releasePersonRole) {
        this.releasePersonRole = releasePersonRole;
    }

    public String getReleasePerson() {
        return releasePerson;
    }

    public void setReleasePerson(String releasePerson) {
        this.releasePerson = releasePerson;
    }

    public Date getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(Date releaseTime) {
        this.releaseTime = releaseTime;
    }

    public String getNewsDetail() {
        return newsDetail;
    }

    public void setNewsDetail(String newsDetail) {
        this.newsDetail = newsDetail;
    }



    public Integer getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(Integer checkStatus) {
        this.checkStatus = checkStatus;
    }

    public Date getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }

    public String getCheckPersonContact() {
        return checkPersonContact;
    }

    public void setCheckPersonContact(String checkPersonContact) {
        this.checkPersonContact = checkPersonContact;
    }

    public String getCheckRemark() {
        return checkRemark;
    }

    public void setCheckRemark(String checkRemark) {
        this.checkRemark = checkRemark;
    }

    public Integer getDelStatus() {
        return delStatus;
    }

    public void setDelStatus(Integer delStatus) {
        this.delStatus = delStatus;
    }
}