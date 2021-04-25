package com.yidaoyun.activity.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import com.yidaoyun.base.util.BaseEntity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 活动文件对象 activity_file
 */
@Data
@Accessors(chain = true)
@ApiModel(value = "活动文件对象", description = "活动文件对象")
public class ActivityFile extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "JDBC")
    @ApiModelProperty(value = "id")
    private Integer id;
    @ApiModelProperty(value = "地址")
    private String addr;
    @ApiModelProperty(value = "名称")
    private String name;
    @ApiModelProperty(value = "活动id")
    private Integer activityId;

}