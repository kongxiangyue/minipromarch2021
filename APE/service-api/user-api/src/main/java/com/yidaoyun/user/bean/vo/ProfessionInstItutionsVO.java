package com.yidaoyun.user.bean.vo;

import com.yidaoyun.base.util.SupportPagingDTO;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

public class ProfessionInstItutionsVO  implements Serializable {
    /**
     * 学校id
     */

    private Integer id;

    /**
     * 学校代码
     */
    private String schoolCode;

    /**
     * 专业代码
     */
    private String professionCode;

    /**
     * 单位名称/学校名称
     */
    private String companyName;

    /**
     * 学校官网
     */
    private String schoolWebsite;
    /**
     * 招生网站
     */
    private String enrolmentWebsite;


    /**
     * 批次 1 专科批 2 专科提前批 3 艺术批
     */
    private Integer enrollBatch;

    /**
     * 专业录取最低分
     */
    private Integer lowestScore;
    /**
     * 专业预估分数线
     */
    private Integer estimateScore;

    /**
     * 省
     */
    private String province;

    /**
     * 市
     */
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

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
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

    public Integer getEnrollBatch() {
        return enrollBatch;
    }

    public void setEnrollBatch(Integer enrollBatch) {
        this.enrollBatch = enrollBatch;
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

    public String getProfessionCode() {
        return professionCode;
    }

    public void setProfessionCode(String professionCode) {
        this.professionCode = professionCode;
    }

    @Override
    public String toString() {
        return "ProfessionInstItutionsVO{" +
                "id=" + id +
                ", schoolCode='" + schoolCode + '\'' +
                ", professionCode='" + professionCode + '\'' +
                ", companyName='" + companyName + '\'' +
                ", schoolWebsite='" + schoolWebsite + '\'' +
                ", enrolmentWebsite='" + enrolmentWebsite + '\'' +
                ", enrollBatch=" + enrollBatch +
                ", lowestScore=" + lowestScore +
                ", estimateScore=" + estimateScore +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", schoolType=" + schoolType +
                ", schoolWebsiteClick=" + schoolWebsiteClick +
                ", enrolmentWebsiteClick=" + enrolmentWebsiteClick +
                ", schoolContrast=" + schoolContrast +
                '}';
    }
}
