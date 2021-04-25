package com.yidaoyun.user.bean.vo;

import com.yidaoyun.user.domain.SchoolScore;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Transient;
import java.util.Date;
import java.util.List;

public class SchoolDeatilVO {
    /**
     * id与入驻单位id对应,学校id
     */
    private Integer id;
    /**
     * 学校代码
     */
    private String schoolCode;
    /**
     * 高校特色: 1 骨干校 2 双高计划 3 教育部直属 4 中央部委
     */
    private String schoolCharacteristic;
    /**
     * 招生类型 1 综合评价招生 2 单招 3春季高考 4 夏季高考
     */
    private String enrolmentType;
    /**
     * 招生电话
     */
    private String enrolmentTel;
    /**
     * 学校优势
     */
    private String schoolSuperiority;
    /**
     * 办学类型 1 专科（公办） 2专科（民办）
     */
    private Integer schoolType;
    /**
     * 学校官网
     */
    private String schoolWebsite;
    /**
     * 招生网站
     */
    private String enrolmentWebsite;
    /**
     * 招生简章
     */
    private String enrolmentBrochure;
    /**
     * 学校简介
     */
    private String schoolSynopsis;
    /**
     * 点击官网的次数
     */
    private Long schoolWebsiteClick;
    /**
     * 点击招生网站次数
     */
    private Long enrolmentWebsiteClick;
    /**
     * 被对比次数
     */
    private Long schoolContrast;

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

    @ApiModelProperty(value = "昵称")
    private String nickname;

    @ApiModelProperty(value = "头像")
    private String headImage;

    @ApiModelProperty(value = "单位名称或电话")
    private String companyNameOrTel;

    //近三年分数线
    private List<SchoolScore> minimumPassingScore;

    //就业率
    private String employmentRate;

    //预估最低分
    private Integer estimateScore;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSchoolCode() {
        return schoolCode;
    }

    public void setSchoolCode(String schoolCode) {
        this.schoolCode = schoolCode;
    }

    public String getSchoolCharacteristic() {
        return schoolCharacteristic;
    }

    public void setSchoolCharacteristic(String schoolCharacteristic) {
        this.schoolCharacteristic = schoolCharacteristic;
    }

    public String getEnrolmentType() {
        return enrolmentType;
    }

    public void setEnrolmentType(String enrolmentType) {
        this.enrolmentType = enrolmentType;
    }

    public String getEnrolmentTel() {
        return enrolmentTel;
    }

    public void setEnrolmentTel(String enrolmentTel) {
        this.enrolmentTel = enrolmentTel;
    }

    public String getSchoolSuperiority() {
        return schoolSuperiority;
    }

    public void setSchoolSuperiority(String schoolSuperiority) {
        this.schoolSuperiority = schoolSuperiority;
    }

    public Integer getSchoolType() {
        return schoolType;
    }

    public void setSchoolType(Integer schoolType) {
        this.schoolType = schoolType;
    }

    public String getSchoolWebsite() {
        return schoolWebsite;
    }

    public void setSchoolWebsite(String schoolWebsite) {
        this.schoolWebsite = schoolWebsite;
    }

    public String getEnrolmentWebsite() {
        return enrolmentWebsite;
    }

    public void setEnrolmentWebsite(String enrolmentWebsite) {
        this.enrolmentWebsite = enrolmentWebsite;
    }

    public String getEnrolmentBrochure() {
        return enrolmentBrochure;
    }

    public void setEnrolmentBrochure(String enrolmentBrochure) {
        this.enrolmentBrochure = enrolmentBrochure;
    }

    public String getSchoolSynopsis() {
        return schoolSynopsis;
    }

    public void setSchoolSynopsis(String schoolSynopsis) {
        this.schoolSynopsis = schoolSynopsis;
    }

    public Long getSchoolWebsiteClick() {
        return schoolWebsiteClick;
    }

    public void setSchoolWebsiteClick(Long schoolWebsiteClick) {
        this.schoolWebsiteClick = schoolWebsiteClick;
    }

    public Long getEnrolmentWebsiteClick() {
        return enrolmentWebsiteClick;
    }

    public void setEnrolmentWebsiteClick(Long enrolmentWebsiteClick) {
        this.enrolmentWebsiteClick = enrolmentWebsiteClick;
    }

    public Long getSchoolContrast() {
        return schoolContrast;
    }

    public void setSchoolContrast(Long schoolContrast) {
        this.schoolContrast = schoolContrast;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getRegistrationTime() {
        return registrationTime;
    }

    public void setRegistrationTime(Date registrationTime) {
        this.registrationTime = registrationTime;
    }

    public Integer getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(Integer accountStatus) {
        this.accountStatus = accountStatus;
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

    public String getCheckRemark() {
        return checkRemark;
    }

    public void setCheckRemark(String checkRemark) {
        this.checkRemark = checkRemark;
    }

    public String getCompanyLogo() {
        return companyLogo;
    }

    public void setCompanyLogo(String companyLogo) {
        this.companyLogo = companyLogo;
    }

    public String getCompanyAddr() {
        return companyAddr;
    }

    public void setCompanyAddr(String companyAddr) {
        this.companyAddr = companyAddr;
    }

    public String getCompanyLegalPerson() {
        return companyLegalPerson;
    }

    public void setCompanyLegalPerson(String companyLegalPerson) {
        this.companyLegalPerson = companyLegalPerson;
    }

    public String getBusinessLicenseNumber() {
        return businessLicenseNumber;
    }

    public void setBusinessLicenseNumber(String businessLicenseNumber) {
        this.businessLicenseNumber = businessLicenseNumber;
    }

    public String getBusinessLicense() {
        return businessLicense;
    }

    public void setBusinessLicense(String businessLicense) {
        this.businessLicense = businessLicense;
    }

    public String getCompanyDetail() {
        return companyDetail;
    }

    public void setCompanyDetail(String companyDetail) {
        this.companyDetail = companyDetail;
    }

    public String getCompanyNature() {
        return companyNature;
    }

    public void setCompanyNature(String companyNature) {
        this.companyNature = companyNature;
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

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getHeadImage() {
        return headImage;
    }

    public void setHeadImage(String headImage) {
        this.headImage = headImage;
    }

    public String getCompanyNameOrTel() {
        return companyNameOrTel;
    }

    public void setCompanyNameOrTel(String companyNameOrTel) {
        this.companyNameOrTel = companyNameOrTel;
    }

    public List<SchoolScore> getMinimumPassingScore() {
        return minimumPassingScore;
    }

    public void setMinimumPassingScore(List<SchoolScore> minimumPassingScore) {
        this.minimumPassingScore = minimumPassingScore;
    }

    public String getEmploymentRate() {
        return employmentRate;
    }

    public void setEmploymentRate(String employmentRate) {
        this.employmentRate = employmentRate;
    }

    public Integer getEstimateScore() {
        return estimateScore;
    }

    public void setEstimateScore(Integer estimateScore) {
        this.estimateScore = estimateScore;
    }

    @Override
    public String toString() {
        return "SchoolDeatilVO{" +
                "id=" + id +
                ", schoolCode='" + schoolCode + '\'' +
                ", schoolCharacteristic='" + schoolCharacteristic + '\'' +
                ", enrolmentType='" + enrolmentType + '\'' +
                ", enrolmentTel='" + enrolmentTel + '\'' +
                ", schoolSuperiority='" + schoolSuperiority + '\'' +
                ", schoolType=" + schoolType +
                ", schoolWebsite='" + schoolWebsite + '\'' +
                ", enrolmentWebsite='" + enrolmentWebsite + '\'' +
                ", enrolmentBrochure='" + enrolmentBrochure + '\'' +
                ", schoolSynopsis='" + schoolSynopsis + '\'' +
                ", schoolWebsiteClick=" + schoolWebsiteClick +
                ", enrolmentWebsiteClick=" + enrolmentWebsiteClick +
                ", schoolContrast=" + schoolContrast +
                ", companyName='" + companyName + '\'' +
                ", contactName='" + contactName + '\'' +
                ", tel='" + tel + '\'' +
                ", email='" + email + '\'' +
                ", registrationTime=" + registrationTime +
                ", accountStatus=" + accountStatus +
                ", checkStatus=" + checkStatus +
                ", checkTime=" + checkTime +
                ", checkRemark='" + checkRemark + '\'' +
                ", companyLogo='" + companyLogo + '\'' +
                ", companyAddr='" + companyAddr + '\'' +
                ", companyLegalPerson='" + companyLegalPerson + '\'' +
                ", businessLicenseNumber='" + businessLicenseNumber + '\'' +
                ", businessLicense='" + businessLicense + '\'' +
                ", companyDetail='" + companyDetail + '\'' +
                ", companyNature='" + companyNature + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", openid='" + openid + '\'' +
                ", nickname='" + nickname + '\'' +
                ", headImage='" + headImage + '\'' +
                ", companyNameOrTel='" + companyNameOrTel + '\'' +
                ", minimumPassingScore=" + minimumPassingScore +
                ", employmentRate='" + employmentRate + '\'' +
                ", estimateScore=" + estimateScore +
                '}';
    }
}
