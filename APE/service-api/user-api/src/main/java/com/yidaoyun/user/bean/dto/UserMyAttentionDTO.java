package com.yidaoyun.user.bean.dto;

import com.yidaoyun.base.util.BaseEntity;
import com.yidaoyun.base.util.SupportPagingDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 我的关注对象 my_attention
 */
@ApiModel(value = "我的关注对象", description = "我的关注对象")
public class UserMyAttentionDTO extends SupportPagingDTO {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    private Integer id;
    @ApiModelProperty(value = "活动id")
    private Integer activityId;
    @ApiModelProperty(value = "入驻单位id")
    private Integer enterCompanyId;
    @ApiModelProperty(value = "通知公告id")
    private Integer noticeAnnouncementId;
    @ApiModelProperty(value = "新闻资讯id")
    private Integer newsInfoId;
    @ApiModelProperty(value = "普通用户id")
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

    public Integer getEnterCompanyId() {
        return enterCompanyId;
    }

    public void setEnterCompanyId(Integer enterCompanyId) {
        this.enterCompanyId = enterCompanyId;
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