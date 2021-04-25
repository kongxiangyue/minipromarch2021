package com.yidaoyun.activity.domain;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class GiveLike {

    private static final long serialVersionUID = 1L;
    @ApiModelProperty("id")
    private Integer id;
    @ApiModelProperty("活动id")
    private Integer activityId;
    @ApiModelProperty("通知公告id")
    private Integer noticeAnnouncementId;
    @ApiModelProperty("新闻资讯id")
    private Integer newsInfoId;
    @ApiModelProperty("普通用户id")
    private Integer commonUserId;

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

    public Integer getNoticeAnnouncementId() {
        return noticeAnnouncementId;
    }

    public void setNoticeAnnouncementId(Integer noticeAnnouncementId) {
        this.noticeAnnouncementId = noticeAnnouncementId;
    }

    public Integer getNewsInfoId() {
        return newsInfoId;
    }

    public void setNewsInfoId(Integer newsInfoId) {
        this.newsInfoId = newsInfoId;
    }

    public Integer getCommonUserId() {
        return commonUserId;
    }

    public void setCommonUserId(Integer commonUserId) {
        this.commonUserId = commonUserId;
    }
}
