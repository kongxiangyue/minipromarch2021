package com.yidaoyun.user.domain;

import com.yidaoyun.base.util.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * 通知公告对象 notice_announcement
 */
@Data
@Accessors(chain = true)
@ApiModel(value = "通知公告对象", description = "通知公告对象")
public class NoticeAnnouncement extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "JDBC")
    @ApiModelProperty(value = "id")
    private Integer id;
    @ApiModelProperty(value = "预览图")
    private String preview;
    @ApiModelProperty(value = "通知标题")
    private String noticeTitle;
    @ApiModelProperty(value = "接收用户")
    private String receiveUser;
    @ApiModelProperty(value = "关键词")
    private String keywords;
    @ApiModelProperty(value = "发布人")
    private String releasePerson;
    @ApiModelProperty(value = "发布时间")
    private Date releaseTime;
    @ApiModelProperty(value = "通知详情")
    private String noticeDetail;
    @ApiModelProperty(value = "删除状态（1：正常 0：已删除）")
    private Integer delStatus;

}