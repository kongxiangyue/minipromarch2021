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
 * 活动对象 activity
 */
@ApiModel(value = "活动对象",description = "活动对象")
@Data
@Accessors(chain = true)
public class Activity extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "JDBC")
    @ApiModelProperty(value = "id")
    private Integer id;

    @ApiModelProperty(value = "活动海报")
    private String activityPosters;

    @ApiModelProperty(value = "活动标题")
    private String activityTitle;

    @ApiModelProperty(value = "活动编号")
    private String activityNumber;

    @ApiModelProperty(value = "活动类型id")
    private Integer activityTypeId;

    @ApiModelProperty(value = "关键词")
    private String keywords;

    @ApiModelProperty(value = "发布时间")
    private Date releaseTime;

    @ApiModelProperty(value = "审核状态（0：草稿 1：待审核 2：报名中 3：审核失败 4：待举办 5：进行中 6：已结束）")
    private Integer checkStatus;

    @ApiModelProperty(value = "审核时间")
    private Date checkTime;

    @ApiModelProperty(value = "审核人联系方式")
    private String checkPersonContact;

    @ApiModelProperty(value = "审核备注")
    private String checkRemark;

    @ApiModelProperty(value = "报名开始时间")
    private Date registrationStartTime;

    @ApiModelProperty(value = "活动开始时间")
    private Date activityStartTime;

    @ApiModelProperty(value = "地址")
    private String addr;

    @ApiModelProperty(value = "人数限制")
    private Integer personLimit;

    @ApiModelProperty(value = "报名费用")
    private Double registrationFee;

    @ApiModelProperty(value = "客服微信二维码")
    private String wxCustomerCode;

    @ApiModelProperty(value = "收款方式")
    private String paymentMethod;

    @ApiModelProperty(value = "报名结束时间")
    private Date registrationEndTime;

    @ApiModelProperty(value = "活动结束时间")
    private Date activityEndTime;

    @ApiModelProperty(value = "省")
    private String province;

    @ApiModelProperty(value = "市")
    private String city;

    @ApiModelProperty(value = "是否需要审核（1：需要 0：不需要）")
    private Integer checkNeed;

    @ApiModelProperty(value = "入驻单位id")
    private Integer enterCompanyId;

    @ApiModelProperty(value = "活动类型名称")
    @Transient
    private String activityTypeName;

    @ApiModelProperty(value = "报名人数")
    @Transient
    private Integer registrationNumber;

    @ApiModelProperty(value = "搜索条件")
    @Transient
    private String searchCriteria;

    @ApiModelProperty(value = "筛选条件：关键词或活动标题")
    @Transient
    private String filter4KeywordsOrActivityTitle;

    @ApiModelProperty(value = "筛选条件：活动类型id")
    @Transient
    private String filter4ActivityTypeId;

    @ApiModelProperty(value = "筛选条件：地区")
    @Transient
    private String filter4City;

    @ApiModelProperty(value = "筛选条件：免费或付费")
    @Transient
    private Integer filter4FreeOrPay;

    @ApiModelProperty(value = "筛选条件：时间")
    @Transient
    private Integer filter4Time;

    @ApiModelProperty(value = "筛选条件：审核状态")
    @Transient
    private String filter4CheckStatus;

    @ApiModelProperty(value = "活动详情")
    @Transient
    private String activityDetail;

    @ApiModelProperty(value = "活动议程")
    @Transient
    private String activityAgenda;

    @ApiModelProperty(value = "活动通知")
    @Transient
    private String activityNotice;

}