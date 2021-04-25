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
 * 活动详情对象 activity_detail
 */
@Data
@Accessors(chain = true)
@ApiModel(value = "活动详情对象", description = "活动详情对象")
public class ActivityDetail extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "JDBC")
    @ApiModelProperty(value = "id")
    private Integer id;

    @ApiModelProperty(value = "活动详情")
    private String activityDetail;

    @ApiModelProperty(value = "活动id")
    private Integer activityId;


}