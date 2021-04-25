package com.yidaoyun.advertising.domain;

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
 * 广告对象 advertising
 */
@Data
@Accessors(chain = true)
@ApiModel(value = "广告对象", description = "广告对象")
public class Advertising extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "JDBC")
    @ApiModelProperty(value = "id")
    private Integer id;
    @ApiModelProperty(value = "类型（1：pc端 0：移动端）")
    private Integer type;
    @ApiModelProperty(value = "广告图")
    private String advertisingPhoto;
    @ApiModelProperty(value = "广告标题")
    private String advertisingTitle;
    @ApiModelProperty(value = "排序")
    private Integer rank;
    @ApiModelProperty(value = "链接")
    private String link;
    @ApiModelProperty(value = "活动编号")
    private String activityNumber;
    @ApiModelProperty(value = "发布人id")
    private Integer releasePersonId;
    @ApiModelProperty(value = "发布人姓名")
    private String releasePersonName;
    @ApiModelProperty(value = "发布时间")
    private Date releaseTime;
    @ApiModelProperty(value = "删除状态（1：正常 0：已删除）")
    private Integer delStatus;
    @ApiModelProperty(value = "图文详情")
    private String graphicDetails;

}