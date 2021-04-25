package com.yidaoyun.user.domain ;

import java.util.Date;
import java.io.Serializable;

/**
 * 入驻单位-学校信息扩展表(SchoolExtend)实体类
 */
public class SchoolExtend implements Serializable {
    private static final long serialVersionUID = 851109544073189868L;
    /**
    * id与入驻单位id对应
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
    /**
    * 创建时间
    */
    private Date createTime;


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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "SchoolExtend{" +
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
                ", createTime=" + createTime +
                '}';
    }
}