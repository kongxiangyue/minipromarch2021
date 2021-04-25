package com.yidaoyun.system.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import com.yidaoyun.base.util.BaseEntity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 帮助中心对象 help_center
 *
 * @author zhoux
 * @date 2020-01-10
 */
@Data
@Accessors(chain = true)
@ApiModel(value = "帮助中心对象", description = "帮助中心对象")
public class HelpCenter extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "JDBC")
    @ApiModelProperty(value = "id")
    private Integer id;
    @ApiModelProperty(value = "用户账号")
    private String problem;
    @ApiModelProperty(value = "反馈内容")
    private String answer;

}