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
 * 常见问题对象 common_problem
 */
@Data
@Accessors(chain = true)
@ApiModel(value = "常见问题对象", description = "常见问题对象")
public class CommonProblem extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "JDBC")
    @ApiModelProperty(value = "id")
    private Integer id;
    @ApiModelProperty(value = "问题")
    private String problem;
    @ApiModelProperty(value = "回答")
    private String answer;

}