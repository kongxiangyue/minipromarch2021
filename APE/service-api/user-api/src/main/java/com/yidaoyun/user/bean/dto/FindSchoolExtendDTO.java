package com.yidaoyun.user.bean.dto;

import com.yidaoyun.base.util.SupportPagingDTO;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

/**
 * 入驻单位-学校信息扩展表(SchoolExtend)实体类
 */
public class FindSchoolExtendDTO extends SupportPagingDTO implements Serializable{
    private static final long serialVersionUID = 851109544073189868L;

    @ApiModelProperty("省")
    private String province;

    @ApiModelProperty("市-所属地区")
    private String city;
    /**
    * 高校特色: 1 骨干校 2 双高计划 3 教育部直属 4 中央部委
    */
    private String schoolCharacteristic;
    /**
    * 招生类型 1 综合评价招生 2 单招 3春季高考 4 夏季高考
    */
    private String enrolmentType;
    /**
    * 学校优势
    */
    private String schoolSuperiority;
    /**
    * 办学类型 1 专科（公办） 2专科（民办）
    */
    private Integer schoolType;

    /**
     * 预估分数开始
     */
    private Integer estimateScoreStart;

    /**
     * 预估分数结束
     */
    private Integer estimateScoreEnd;

    /**
     * 近一年分数开始
     */
    private Integer lowestScoreStart;

    /**
     * 近一年分数结束
     */
    private Integer lowestScoreEnd;

    /**
     * 学校优势或学校名称
     */
    private String schoolSuperiorityOrName;

    /**
     * 学校名称
     */
    private String companyName;

    /**
     * 年份
     */
    private Integer year;

    public String getSchoolSuperiorityOrName() {
        return schoolSuperiorityOrName;
    }

    public void setSchoolSuperiorityOrName(String schoolSuperiorityOrName) {
        this.schoolSuperiorityOrName = schoolSuperiorityOrName;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
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

    public Integer getEstimateScoreStart() {
        return estimateScoreStart;
    }

    public void setEstimateScoreStart(Integer estimateScoreStart) {
        this.estimateScoreStart = estimateScoreStart;
    }

    public Integer getEstimateScoreEnd() {
        return estimateScoreEnd;
    }

    public void setEstimateScoreEnd(Integer estimateScoreEnd) {
        this.estimateScoreEnd = estimateScoreEnd;
    }

    public Integer getLowestScoreStart() {
        return lowestScoreStart;
    }

    public void setLowestScoreStart(Integer lowestScoreStart) {
        this.lowestScoreStart = lowestScoreStart;
    }

    public Integer getLowestScoreEnd() {
        return lowestScoreEnd;
    }

    public void setLowestScoreEnd(Integer lowestScoreEnd) {
        this.lowestScoreEnd = lowestScoreEnd;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "FindSchoolExtendDTO{" +
                "province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", schoolCharacteristic='" + schoolCharacteristic + '\'' +
                ", enrolmentType='" + enrolmentType + '\'' +
                ", schoolSuperiority='" + schoolSuperiority + '\'' +
                ", schoolType=" + schoolType +
                ", estimateScoreStart=" + estimateScoreStart +
                ", estimateScoreEnd=" + estimateScoreEnd +
                ", lowestScoreStart=" + lowestScoreStart +
                ", lowestScoreEnd=" + lowestScoreEnd +
                ", schoolSuperiorityOrName='" + schoolSuperiorityOrName + '\'' +
                ", companyName='" + companyName + '\'' +
                ", year=" + year +
                '}';
    }
}