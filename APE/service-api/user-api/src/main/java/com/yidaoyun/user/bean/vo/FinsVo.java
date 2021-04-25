package com.yidaoyun.user.bean.vo;

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
 * 入驻单位对象 enter_company
 */
@Data
@Accessors(chain = true)
@ApiModel(value = "入驻单位对象", description = "入驻单位对象")
public class FinsVo extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "JDBC")
    @ApiModelProperty(value = "id")
    private Integer id;

    @ApiModelProperty(value = "单位名称")
    private String companyName;

    @ApiModelProperty(value = "联系人姓名")
    private String contactName;

    @ApiModelProperty(value = "手机号（登录）")
    private String tel;

    @ApiModelProperty(value = "邮箱（登录）")
    private String email;

    @ApiModelProperty(value = "注册时间")
    private Date registrationTime;

    @ApiModelProperty(value = "账号状态（1：正常 0：冻结）")
    private Integer accountStatus;

    @ApiModelProperty(value = "密码")
    private String password;

    @ApiModelProperty(value = "审核状态（0：待审核 1：审核成功  2：审核失败）")
    private Integer checkStatus;

    @ApiModelProperty(value = "审核时间")
    private Date checkTime;

    @ApiModelProperty(value = "审核备注")
    private String checkRemark;

    @ApiModelProperty(value = "单位LOGO")
    private String companyLogo;

    @ApiModelProperty(value = "单位地址")
    private String companyAddr;

    @ApiModelProperty(value = "单位法人")
    private String companyLegalPerson;

    @ApiModelProperty(value = "营业执照注册号")
    private String businessLicenseNumber;

    @ApiModelProperty(value = "营业执照")
    private String businessLicense;

    @ApiModelProperty(value = "单位详情")
    private String companyDetail;

    @ApiModelProperty(value = "单位性质")
    private String companyNature;

    @ApiModelProperty(value = "省")
    private String province;

    @ApiModelProperty(value = "市")
    private String city;

    @ApiModelProperty(value = "openid")
    private String openid;

    @ApiModelProperty(value = "盐加密")
    private String salt;

    @ApiModelProperty(value = "昵称")
    private String nickname;

    @ApiModelProperty(value = "头像")
    private String headImage;

    @Transient
    @ApiModelProperty(value = "单位名称或电话")
    private String companyNameOrTel;

    @ApiModelProperty(value = "关注度")
    private Long concerns;

    @ApiModelProperty(value = "是否关注 0 没关注 1  关注")
    private int attentionType;


    @ApiModelProperty(value = "角色：1校园用户登录")
    private int role;

    @ApiModelProperty(value = "粉丝数")
    private Integer finsCount;

}