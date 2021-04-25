package com.yidaoyun.administrator.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.Date;

import com.yidaoyun.base.util.BaseEntity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

/**
 * 管理员用户对象 administrator_user
 *
 * @author zhoux
 * @date 2020-01-09
 */
@Data
@Accessors(chain = true)
@ApiModel(value = "管理员用户对象", description = "管理员用户对象")
public class AdministratorUser extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "JDBC")
    @ApiModelProperty(value = "id")
    private Integer id;
    @ApiModelProperty(value = "账号")
    private String account;
    @ApiModelProperty(value = "姓名")
    private String name;
    @ApiModelProperty(value = "账号状态（1：正常 0：冻结）")
    private Integer accountStatus;
    @ApiModelProperty(value = "注册时间")
    private Date registrationTime;
    @ApiModelProperty(value = "登录次数")
    private Integer loginTimes;
    @ApiModelProperty(value = "最后登录时间")
    private Date lastLoginTime;
    @ApiModelProperty(value = "密码")
    private String password;
    @ApiModelProperty(value = "角色管理id")
    private String roleManagementId;
    @ApiModelProperty(value = "盐加密")
    private String salt;
    @Transient
    @ApiModelProperty(value = "角色名称")
    private String roleName;

}