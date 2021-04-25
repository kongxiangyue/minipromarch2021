package com.yidaoyun.user.domain;

import com.yidaoyun.base.util.BaseEntity;
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
 * 普通用户对象 common_user
 */
@Data
@Accessors(chain = true)
@ApiModel(value = "普通用户对象", description = "普通用户对象")
public class CommonUser extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "JDBC")
    @ApiModelProperty(value = "id")
    private Integer id;

    @ApiModelProperty(value = "系统账号")
    private String systemAccount;

    @ApiModelProperty(value = "昵称")
    private String nickname;

    @ApiModelProperty(value = "手机号")
    private String tel;

    @ApiModelProperty(value = "报名活动（场）")
    private Integer registrationActivities;

    @ApiModelProperty(value = "签到活动（场）")
    private Integer signInActivities;

    @ApiModelProperty(value = "注册时间")
    private Date registrationTime;

    @ApiModelProperty(value = "账号状态（1：正常 0：冻结）")
    private Integer accountStatus;

    @ApiModelProperty(value = "密码")
    private String password;

    @ApiModelProperty(value = "头像")
    private String headImage;

    @ApiModelProperty(value = "身份证号")
    private String idNumber;

    @ApiModelProperty(value = "unionid")
    private String unionid;

    @ApiModelProperty(value = "盐加密")
    private String salt;

    @ApiModelProperty(value = "openid")
    private String openid;

    @Transient
    @ApiModelProperty(value = "昵称或手机号")
    private String nicknameOrTel;

}
