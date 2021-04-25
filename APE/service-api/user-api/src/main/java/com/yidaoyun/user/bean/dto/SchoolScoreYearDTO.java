package com.yidaoyun.user.bean.dto;

public class SchoolScoreYearDTO {
    //开始年份
    private Integer startYear;
    //结束年份
    private Integer endYear;
    //学校代码
    private String SchoolCode;
    //专业代码
    private String professionCode;

    public Integer getStartYear() {
        return startYear;
    }

    public void setStartYear(Integer startYear) {
        this.startYear = startYear;
    }

    public Integer getEndYear() {
        return endYear;
    }

    public void setEndYear(Integer endYear) {
        this.endYear = endYear;
    }

    public String getSchoolCode() {
        return SchoolCode;
    }

    public void setSchoolCode(String schoolCode) {
        SchoolCode = schoolCode;
    }

    public String getProfessionCode() {
        return professionCode;
    }

    public void setProfessionCode(String professionCode) {
        this.professionCode = professionCode;
    }

    @Override
    public String toString() {
        return "SchoolScoreYearDTO{" +
                "startYear=" + startYear +
                ", endYear=" + endYear +
                ", SchoolCode='" + SchoolCode + '\'' +
                ", professionCode='" + professionCode + '\'' +
                '}';
    }
}
