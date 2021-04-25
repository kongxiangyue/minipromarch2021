package com.yidaoyun.user.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import com.yidaoyun.base.util.BaseEntity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 活动订单对象 active_order
 */
@Data
@Accessors(chain = true)
@ApiModel(value = "活动订单对象", description = "活动订单对象")
public class ActiveOrder extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "JDBC")
    @ApiModelProperty(value = "id")
    private Integer id;
    @ApiModelProperty(value = "状态（1：待审核 2：待参加 3：已检票 4：已取消）")
    private Integer status;
    @ApiModelProperty(value = "活动id")
    private Integer activityId;
    @ApiModelProperty(value = "普通用户id")
    private Integer commonUserId;

}