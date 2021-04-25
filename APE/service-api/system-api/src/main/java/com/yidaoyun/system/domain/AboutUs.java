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
 * 关于我们对象 about_us
 *
 * @author zhoux
 * @date 2020-01-10
 */
@Data
@Accessors(chain = true)
@ApiModel(value = "关于我们对象", description = "关于我们对象")
public class AboutUs extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "JDBC")
    @ApiModelProperty(value = "id")
    private Integer id;
    @ApiModelProperty(value = "关于我们")
    private String aboutUs;

}