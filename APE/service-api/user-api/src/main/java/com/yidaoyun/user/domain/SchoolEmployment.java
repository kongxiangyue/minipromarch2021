package com.yidaoyun.user.domain;

import java.io.Serializable;

/**
 * 学校就业率表(SchoolEmployment)实体类
 */
public class SchoolEmployment implements Serializable {
    private static final long serialVersionUID = 575842600471067804L;
    /**
    * id
    */
    private Integer id;
    /**
    * 学校代码
    */
    private String schoolCode;
    /**
    * 年份
    */
    private Integer year;
    /**
    * 就业率
    */
    private String employmentRate;


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

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getEmploymentRate() {
        return employmentRate;
    }

    public void setEmploymentRate(String employmentRate) {
        this.employmentRate = employmentRate;
    }

    @Override
    public String toString() {
        return "SchoolEmployment{" +
                "id=" + id +
                ", schoolCode='" + schoolCode + '\'' +
                ", year=" + year +
                ", employmentRate='" + employmentRate + '\'' +
                '}';
    }
}