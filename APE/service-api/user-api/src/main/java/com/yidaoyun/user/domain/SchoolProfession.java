package com.yidaoyun.user.domain;

import java.io.Serializable;

/**
 * 学校专业关系表(SchoolProfession)实体类
 */
public class SchoolProfession implements Serializable {
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

}