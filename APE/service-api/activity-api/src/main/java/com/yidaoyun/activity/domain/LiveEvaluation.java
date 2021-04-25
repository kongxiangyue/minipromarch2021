package com.yidaoyun.activity.domain;

import com.yidaoyun.base.util.BaseEntity;
import com.yidaoyun.user.domain.CommonUser;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.util.Date;

/**
 * 直播评价对象 live_evaluation
 */
@Data
@Accessors(chain = true)
@ApiModel(value = "直播评价对象", description = "直播评价对象")
public class LiveEvaluation extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "JDBC")
    @ApiModelProperty(value = "id")
    private Integer id;
    @ApiModelProperty(value = "内容")
    private String content;
    @ApiModelProperty(value = "时间")
    private Date time;
    @ApiModelProperty(value = "文件")
    private String file;
    @ApiModelProperty(value = "用户id")
    private Integer userId;
    @ApiModelProperty(value = "活动id")
    private Integer activityId;
    @ApiModelProperty(value = "用户信息")
    @Transient
    private CommonUser commonUser;

}