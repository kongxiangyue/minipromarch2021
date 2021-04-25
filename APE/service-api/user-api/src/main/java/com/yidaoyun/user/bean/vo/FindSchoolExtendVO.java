package com.yidaoyun.user.bean.vo;

import com.yidaoyun.base.util.SupportPagingDTO;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * 入驻单位-学校信息扩展表(SchoolExtend)实体类
 */
public class FindSchoolExtendVO extends SupportPagingDTO implements Serializable{
    private static final long serialVersionUID = 851109544073189868L;

    //学校id
    private Integer id;

    //学校代码
    private String schoolCode;

    /**
     * 学校名称
     */
    private String companyName;

    /**
     * 近一年最低分
     */
    private Integer lowestScore;

    /**
     * 今年预估分数
     */
    private Integer estimateScore;

    @ApiModelProperty("省")
    private String province;

    @ApiModelProperty("市-所属地区")
    private String city;

    /**
     * 办学类型 1 专科（公办） 2专科（民办）
     */
    private Integer schoolType;

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

    /**
     * 高校特色: 1 骨干校 2 双高计划 3 教育部直属 4 中央部委
     */
    private String schoolCharacteristic;

    /**
     * 学校优势
     */
    private String schoolSuperiority;

    /**
     * 招生简章
     */
    private String enrolmentBrochure;

    /**
     * 学校官网
     */
    private String schoolWebsite;

    /**
     * 招生电话
     */
    private String enrolmentTel;

    /**
     * 学校简介
     */
    private String schoolSynopsis;

    @ApiModelProperty(value = "单位LOGO")
    private String companyLogo;

    public String getSchoolCharacteristic() {
        return schoolCharacteristic;
    }

    public void setSchoolCharacteristic(String schoolCharacteristic) {
        this.schoolCharacteristic = schoolCharacteristic;
    }

    public String getSchoolSuperiority() {
        return schoolSuperiority;
    }

    public void setSchoolSuperiority(String schoolSuperiority) {
        this.schoolSuperiority = schoolSuperiority;
    }

    public String getEnrolmentBrochure() {
        return enrolmentBrochure;
    }

    public void setEnrolmentBrochure(String enrolmentBrochure) {
        this.enrolmentBrochure = enrolmentBrochure;
    }

    public String getSchoolWebsite() {
        return schoolWebsite;
    }

    public void setSchoolWebsite(String schoolWebsite) {
        this.schoolWebsite = schoolWebsite;
    }

    public String getEnrolmentTel() {
        return enrolmentTel;
    }

    public void setEnrolmentTel(String enrolmentTel) {
        this.enrolmentTel = enrolmentTel;
    }

    public String getSchoolSynopsis() {
        return schoolSynopsis;
    }

    public void setSchoolSynopsis(String schoolSynopsis) {
        this.schoolSynopsis = schoolSynopsis;
    }

    public String getCompanyLogo() {
        return companyLogo;
    }

    public void setCompanyLogo(String companyLogo) {
        this.companyLogo = companyLogo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Integer getLowestScore() {
        return lowestScore;
    }

    public void setLowestScore(Integer lowestScore) {
        this.lowestScore = lowestScore;
    }

    public Integer getEstimateScore() {
        return estimateScore;
    }

    public void setEstimateScore(Integer estimateScore) {
        this.estimateScore = estimateScore;
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

    public Integer getSchoolType() {
        return schoolType;
    }

    public void setSchoolType(Integer schoolType) {
        this.schoolType = schoolType;
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

    public String getSchoolCode() {
        return schoolCode;
    }

    public void setSchoolCode(String schoolCode) {
        this.schoolCode = schoolCode;
    }

    @Override
    public String toString() {
        return "FindSchoolExtendVO{" +
                "id=" + id +
                ", schoolCode='" + schoolCode + '\'' +
                ", companyName='" + companyName + '\'' +
                ", lowestScore=" + lowestScore +
                ", estimateScore=" + estimateScore +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", schoolType=" + schoolType +
                ", schoolWebsiteClick=" + schoolWebsiteClick +
                ", enrolmentWebsiteClick=" + enrolmentWebsiteClick +
                ", schoolContrast=" + schoolContrast +
                ", schoolCharacteristic='" + schoolCharacteristic + '\'' +
                ", schoolSuperiority='" + schoolSuperiority + '\'' +
                ", enrolmentBrochure='" + enrolmentBrochure + '\'' +
                ", schoolWebsite='" + schoolWebsite + '\'' +
                ", enrolmentTel='" + enrolmentTel + '\'' +
                ", schoolSynopsis='" + schoolSynopsis + '\'' +
                ", companyLogo='" + companyLogo + '\'' +
                '}';
    }
}