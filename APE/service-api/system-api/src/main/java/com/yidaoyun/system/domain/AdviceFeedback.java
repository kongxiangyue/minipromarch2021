package com.yidaoyun.system.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.Date;

import com.yidaoyun.base.util.BaseEntity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 意见反馈对象 advice_feedback
 *
 * @author zhoux
 * @date 2020-01-10
 */
@Data
@Accessors(chain = true)
@ApiModel(value = "意见反馈对象", description = "意见反馈对象")
public class AdviceFeedback extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "JDBC")
    @ApiModelProperty(value = "id")
    private Integer id;
    @ApiModelProperty(value = "用户账号")
    private Integer userAccount;
    @ApiModelProperty(value = "反馈内容")
    private String feedbackComtent;
    @ApiModelProperty(value = "图片")
    private String picture;
    @ApiModelProperty(value = "反馈时间")
    private Date feedbackTime;

}