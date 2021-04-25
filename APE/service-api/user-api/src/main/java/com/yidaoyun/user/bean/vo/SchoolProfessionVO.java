package com.yidaoyun.user.bean.vo;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * 学校专业关系表(SchoolProfession)实体类
 */
public class SchoolProfessionVO implements Serializable {
    private static final long serialVersionUID = -11258423129707618L;
    /**
    * id
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
     * 学院
     */
    private String schoolAcademy;

    /**
     * 专业名称
     */
    private String professionName;

    @ApiModelProperty(value = "学校名称")
    private String companyName;

    public String getProfessionName() {
        return professionName;
    }

    public void setProfessionName(String professionName) {
        this.professionName = professionName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getSchoolAcademy() {
        return schoolAcademy;
    }

    public void setSchoolAcademy(String schoolAcademy) {
        this.schoolAcademy = schoolAcademy;
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
        return "SchoolProfessionVO{" +
                "id=" + id +
                ", schoolCode='" + schoolCode + '\'' +
                ", professionCode='" + professionCode + '\'' +
                ", schoolAcademy='" + schoolAcademy + '\'' +
                ", professionName='" + professionName + '\'' +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}