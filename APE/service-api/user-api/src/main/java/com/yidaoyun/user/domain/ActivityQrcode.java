package com.yidaoyun.user.domain;

import com.yidaoyun.base.util.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


/**
 * 活动二维码对象 activity_qrcode
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Accessors(chain = true)
@ApiModel(value = "活动二维码对象", description = "活动二维码对象")
public class ActivityQrcode extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "JDBC")
    @ApiModelProperty(value = "$column.columnComment")
    private Integer id;

    @ApiModelProperty(value = "活动ID", required = true)
    private Integer activityId;

    @ApiModelProperty(value = "二维码类型（分享：0，签到：1）", required = true)
    private Integer type;

    @ApiModelProperty(value = "地址")
    private String address;

}