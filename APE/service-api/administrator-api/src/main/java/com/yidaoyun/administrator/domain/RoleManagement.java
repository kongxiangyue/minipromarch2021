package com.yidaoyun.administrator.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import com.yidaoyun.base.util.BaseEntity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 角色管理对象 role_management
 *
 * @author zhoux
 * @date 2020-01-09
 */
@Data
@Accessors(chain = true)
@ApiModel(value = "角色管理对象", description = "角色管理对象")
public class RoleManagement extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "JDBC")
    @ApiModelProperty(value = "id")
    private Integer id;
    @ApiModelProperty(value = "名称")
    private String name;
    @ApiModelProperty(value = "角色备注")
    private String roleRemark;

}