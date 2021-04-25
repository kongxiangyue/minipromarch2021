package com.yidaoyun.activity.domain;

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
 * 报名对象 sign_up_table
 */
@Data
@Accessors(chain = true)
@ApiModel(value = "报名对象", description = "报名对象")
public class SignUpTable extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "JDBC")
    @ApiModelProperty(value = "id")
    private Integer id;
    @ApiModelProperty(value = "报名时间")
    private Date signUpTime;
    @ApiModelProperty(value = "订单号")
    private String orderNo;
    @ApiModelProperty(value = "姓名")
    private String name;
    @ApiModelProperty(value = "身份证号")
    private String idNo;
    @ApiModelProperty(value = "电话")
    private String tel;
    @ApiModelProperty(value = "单位名称")
    private String companyName;
    @ApiModelProperty(value = "身份")
    private String identity;
    @ApiModelProperty(value = "订单金额")
    private Double orderAmount;
    @ApiModelProperty(value = "付款凭证")
    private String billCredit;
    @ApiModelProperty(value = "付款方式")
    private String payWay;
    @ApiModelProperty(value = "状态（1：待审核 3：待检票 4：已检票 6：已退款 7：已取消 8：审核失败）")
    private Integer status;
    @ApiModelProperty(value = "时间")
    private Date time;
    @ApiModelProperty(value = "来源")
    private String source;
    @ApiModelProperty(value = "审核备注")
    private String checkRemark;
    @ApiModelProperty(value = "退款备注")
    private String refundRemark;
    @ApiModelProperty(value = "检票时间")
    private Date checkInTime;
    @ApiModelProperty(value = "活动id")
    private Integer activityId;
    @ApiModelProperty(value = "普通用户id")
    private Integer commonUserId;
    @ApiModelProperty(value = "手机号或者身份证")
    @Transient
    private String telOrIdNo;
    @ApiModelProperty(value = "活动")
    @Transient
    private Activity activity;
    @ApiModelProperty(value = "状态分隔字符串（如：1,2,3,4,5,6,7,8）")
    @Transient
    private String status4Split;

    @ApiModelProperty(value = "单位LOGO")
    @Transient
    private String companyLogo;
    @ApiModelProperty(value = "活动标题")
    @Transient
    private String activityTitle;
    @ApiModelProperty(value = "活动开始时间")
    @Transient
    private Date activityStartTime;
    @ApiModelProperty(value = "地址")
    @Transient
    private String addr;

}