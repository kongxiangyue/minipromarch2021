package com.yidaoyun.activity.domain;

import com.yidaoyun.base.util.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 活动通知对象 activity_notice
 */
@Data
@Accessors(chain = true)
@ApiModel(value = "活动通知对象", description = "活动通知对象")
public class ActivityNotice extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "JDBC")
    @ApiModelProperty(value = "id")
    private Integer id;

    @ApiModelProperty(value = "活动通知")
    private String activityNotice;

    @ApiModelProperty(value = "活动id")
    private Integer activityId;


}