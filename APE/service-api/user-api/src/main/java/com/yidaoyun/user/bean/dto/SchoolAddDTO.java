package com.yidaoyun.user.bean.dto;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;

public class SchoolAddDTO {
    //学校主键id
    private Integer id;

    @ApiModelProperty(value = "单位名称")
    private String companyName;

    @ApiModelProperty(value = "单位LOGO")
    private String companyLogo;

    @NotNull
    @ApiModelProperty(value = "学校代码")
    private String schoolCode;

    @ApiModelProperty(value = "联系人姓名")
    private String contactName;

    @NotNull
    @ApiModelProperty(value = "手机号（登录）")
    private String tel;

    @ApiModelProperty(value = "招生电话")
    private String enrolmentTel;

    @ApiModelProperty(value = "邮箱（登录）")
    private String email;

    @ApiModelProperty(value = "省")
    private String province;

    @ApiModelProperty(value = "市")
    private String city;

    @ApiModelProperty(value = "单位地址")
    private String companyAddr;

    @ApiModelProperty(value = "高校特色: 1 骨干校 2 双高计划 3 教育部直属 4 中央部委")
    private String schoolCharacteristic;

    @ApiModelProperty(value = "招生类型 1 综合评价招生 2 单招 3春季高考 4 夏季高考")
    private String enrolmentType;

    @ApiModelProperty(value = "学校优势")
    private String schoolSuperiority;

    @ApiModelProperty(value = "办学类型 1 专科（公办） 2专科（民办）")
    private Integer schoolType;

    @ApiModelProperty(value = "学校官网")
    private String schoolWebsite;

    @ApiModelProperty(value = "招生网站")
    private String enrolmentWebsite;

    @ApiModelProperty(value = "密码")
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getCompanyLogo() {
        return companyLogo;
    }

    public void setCompanyLogo(String companyLogo) {
        this.companyLogo = companyLogo;
    }

    public String getSchoolCode() {
        return schoolCode;
    }

    public void setSchoolCode(String schoolCode) {
        this.schoolCode = schoolCode;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getEnrolmentTel() {
        return enrolmentTel;
    }

    public void setEnrolmentTel(String enrolmentTel) {
        this.enrolmentTel = enrolmentTel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getCompanyAddr() {
        return companyAddr;
    }

    public void setCompanyAddr(String companyAddr) {
        this.companyAddr = companyAddr;
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

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}
