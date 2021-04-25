package com.yidaoyun.activity.bean.vo;

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
public class ActivityVO extends BaseEntity {

    private static final long serialVersionUID = 1L;

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

    //关注数
    private Long concerns;

    //是否关注 0 否1是
    private Integer attentionType;

    //点赞数
    private Long giveLikeNum;

    //是否点赞 0否1 是
    private Integer giveLikeType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getActivityPosters() {
        return activityPosters;
    }

    public void setActivityPosters(String activityPosters) {
        this.activityPosters = activityPosters;
    }

    public String getActivityTitle() {
        return activityTitle;
    }

    public void setActivityTitle(String activityTitle) {
        this.activityTitle = activityTitle;
    }

    public String getActivityNumber() {
        return activityNumber;
    }

    public void setActivityNumber(String activityNumber) {
        this.activityNumber = activityNumber;
    }

    public Integer getActivityTypeId() {
        return activityTypeId;
    }

    public void setActivityTypeId(Integer activityTypeId) {
        this.activityTypeId = activityTypeId;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public Date getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(Date releaseTime) {
        this.releaseTime = releaseTime;
    }

    public Integer getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(Integer checkStatus) {
        this.checkStatus = checkStatus;
    }

    public Date getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }

    public String getCheckPersonContact() {
        return checkPersonContact;
    }

    public void setCheckPersonContact(String checkPersonContact) {
        this.checkPersonContact = checkPersonContact;
    }

    public String getCheckRemark() {
        return checkRemark;
    }

    public void setCheckRemark(String checkRemark) {
        this.checkRemark = checkRemark;
    }

    public Date getRegistrationStartTime() {
        return registrationStartTime;
    }

    public void setRegistrationStartTime(Date registrationStartTime) {
        this.registrationStartTime = registrationStartTime;
    }

    public Date getActivityStartTime() {
        return activityStartTime;
    }

    public void setActivityStartTime(Date activityStartTime) {
        this.activityStartTime = activityStartTime;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public Integer getPersonLimit() {
        return personLimit;
    }

    public void setPersonLimit(Integer personLimit) {
        this.personLimit = personLimit;
    }

    public Double getRegistrationFee() {
        return registrationFee;
    }

    public void setRegistrationFee(Double registrationFee) {
        this.registrationFee = registrationFee;
    }

    public String getWxCustomerCode() {
        return wxCustomerCode;
    }

    public void setWxCustomerCode(String wxCustomerCode) {
        this.wxCustomerCode = wxCustomerCode;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Date getRegistrationEndTime() {
        return registrationEndTime;
    }

    public void setRegistrationEndTime(Date registrationEndTime) {
        this.registrationEndTime = registrationEndTime;
    }

    public Date getActivityEndTime() {
        return activityEndTime;
    }

    public void setActivityEndTime(Date activityEndTime) {
        this.activityEndTime = activityEndTime;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getCheckNeed() {
        return checkNeed;
    }

    public void setCheckNeed(Integer checkNeed) {
        this.checkNeed = checkNeed;
    }

    public Integer getEnterCompanyId() {
        return enterCompanyId;
    }

    public void setEnterCompanyId(Integer enterCompanyId) {
        this.enterCompanyId = enterCompanyId;
    }

    public String getActivityTypeName() {
        return activityTypeName;
    }

    public void setActivityTypeName(String activityTypeName) {
        this.activityTypeName = activityTypeName;
    }

    public Integer getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(Integer registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getSearchCriteria() {
        return searchCriteria;
    }

    public void setSearchCriteria(String searchCriteria) {
        this.searchCriteria = searchCriteria;
    }

    public String getFilter4KeywordsOrActivityTitle() {
        return filter4KeywordsOrActivityTitle;
    }

    public void setFilter4KeywordsOrActivityTitle(String filter4KeywordsOrActivityTitle) {
        this.filter4KeywordsOrActivityTitle = filter4KeywordsOrActivityTitle;
    }

    public String getFilter4ActivityTypeId() {
        return filter4ActivityTypeId;
    }

    public void setFilter4ActivityTypeId(String filter4ActivityTypeId) {
        this.filter4ActivityTypeId = filter4ActivityTypeId;
    }

    public String getFilter4City() {
        return filter4City;
    }

    public void setFilter4City(String filter4City) {
        this.filter4City = filter4City;
    }

    public Integer getFilter4FreeOrPay() {
        return filter4FreeOrPay;
    }

    public void setFilter4FreeOrPay(Integer filter4FreeOrPay) {
        this.filter4FreeOrPay = filter4FreeOrPay;
    }

    public Integer getFilter4Time() {
        return filter4Time;
    }

    public void setFilter4Time(Integer filter4Time) {
        this.filter4Time = filter4Time;
    }

    public String getFilter4CheckStatus() {
        return filter4CheckStatus;
    }

    public void setFilter4CheckStatus(String filter4CheckStatus) {
        this.filter4CheckStatus = filter4CheckStatus;
    }

    public String getActivityDetail() {
        return activityDetail;
    }

    public void setActivityDetail(String activityDetail) {
        this.activityDetail = activityDetail;
    }

    public String getActivityAgenda() {
        return activityAgenda;
    }

    public void setActivityAgenda(String activityAgenda) {
        this.activityAgenda = activityAgenda;
    }

    public String getActivityNotice() {
        return activityNotice;
    }

    public void setActivityNotice(String activityNotice) {
        this.activityNotice = activityNotice;
    }

    public Long getConcerns() {
        return concerns;
    }

    public void setConcerns(Long concerns) {
        this.concerns = concerns;
    }

    public Integer getAttentionType() {
        return attentionType;
    }

    public void setAttentionType(Integer attentionType) {
        this.attentionType = attentionType;
    }

    public Long getGiveLikeNum() {
        return giveLikeNum;
    }

    public void setGiveLikeNum(Long giveLikeNum) {
        this.giveLikeNum = giveLikeNum;
    }

    public Integer getGiveLikeType() {
        return giveLikeType;
    }

    public void setGiveLikeType(Integer giveLikeType) {
        this.giveLikeType = giveLikeType;
    }
}