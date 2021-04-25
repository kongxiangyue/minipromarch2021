package com.yidaoyun.user.bean.vo;

import io.swagger.annotations.ApiModelProperty;


public class SchoolFocusRankingVO {

    @ApiModelProperty(value = "学校id")
    private Integer id;

    @ApiModelProperty(value = "高校名称")
    private String companyName;

    @ApiModelProperty(value = "省")
    private String province;

    @ApiModelProperty(value = "市")
    private String city;

    @ApiModelProperty(value = "学校代码")
    private String schoolCode;

    @ApiModelProperty(value = "学校logo")
    private String companyLogo;

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

    public String getCompanyLogo() {
        return companyLogo;
    }

    public void setCompanyLogo(String companyLogo) {
        this.companyLogo = companyLogo;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
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

    @Override
    public String toString() {
        return "SchoolFocusRankingVO{" +
                "id=" + id +
                ", companyName='" + companyName + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", schoolCode='" + schoolCode + '\'' +
                ", companyLogo='" + companyLogo + '\'' +
                '}';
    }
}
