package com.yidaoyun.user.bean.vo;

import com.yidaoyun.user.domain.SchoolScore;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class ProfessionDetailVO implements Serializable {

    /**
     * 专业id
     */
    private Integer id;

    /**
     * 专业代码
     */
    private String professionCode;
    /**
     * 专业名称
     */
    private String professionName;

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
     * 基本修业年限
     */
    private String studyPeriod;
    /**
     * 学校官网
     */
    private String schoolWebsite;
    /**
     * 招生网站
     */
    private String enrolmentWebsite;

    /**
     * 省
     */
    private String province;

    /**
     * 市
     */
    private String city;

    /**
     * 学校名称
     */
    private String companyName;

    /**
     * 点击专业名称的次数（专业关注度）
     */
    private Long professionClick;


    /**
     * 专业预估分数线
     */
    private Integer estimateScore;

    /**
     * 就业率
     */
    private String employmentRate;

    /**
     * 近三年分数线
     */
    List<SchoolScore> passingScore;

    /**
     * 培养目标
     */
    private String fosterTarget;
    /**
     * 就业面向
     */
    private String jobDirection;
    /**
     * 核心课程与实习实训
     */
    private String trainingCourses;
    /**
     * 衔接中职专业举例
     */
    private String secondaryVocational;
    /**
     * 接续本科专业举例
     */
    private String bachelorDegree;
    /**
     * 是否删除 0未删除 1已删除
     */
    private Integer delStatus;

    /**
     * 1文科 2理科
     */
    private Integer subjectType;

    /**
     * 主要职业能力
     */
    private String vocationalAbility;

    //今年批次
    private Integer enrollBatch;

    public Integer getEnrollBatch() {
        return enrollBatch;
    }

    public void setEnrollBatch(Integer enrollBatch) {
        this.enrollBatch = enrollBatch;
    }

    public String getFosterTarget() {
        return fosterTarget;
    }

    public void setFosterTarget(String fosterTarget) {
        this.fosterTarget = fosterTarget;
    }

    public String getJobDirection() {
        return jobDirection;
    }

    public void setJobDirection(String jobDirection) {
        this.jobDirection = jobDirection;
    }

    public String getTrainingCourses() {
        return trainingCourses;
    }

    public void setTrainingCourses(String trainingCourses) {
        this.trainingCourses = trainingCourses;
    }

    public String getSecondaryVocational() {
        return secondaryVocational;
    }

    public void setSecondaryVocational(String secondaryVocational) {
        this.secondaryVocational = secondaryVocational;
    }

    public String getBachelorDegree() {
        return bachelorDegree;
    }

    public void setBachelorDegree(String bachelorDegree) {
        this.bachelorDegree = bachelorDegree;
    }

    public Integer getDelStatus() {
        return delStatus;
    }

    public void setDelStatus(Integer delStatus) {
        this.delStatus = delStatus;
    }

    public Integer getSubjectType() {
        return subjectType;
    }

    public void setSubjectType(Integer subjectType) {
        this.subjectType = subjectType;
    }

    public String getVocationalAbility() {
        return vocationalAbility;
    }

    public void setVocationalAbility(String vocationalAbility) {
        this.vocationalAbility = vocationalAbility;
    }

    public String getStudyPeriod() {
        return studyPeriod;
    }

    public void setStudyPeriod(String studyPeriod) {
        this.studyPeriod = studyPeriod;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProfessionCode() {
        return professionCode;
    }

    public void setProfessionCode(String professionCode) {
        this.professionCode = professionCode;
    }

    public String getProfessionName() {
        return professionName;
    }

    public void setProfessionName(String professionName) {
        this.professionName = professionName;
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

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Long getProfessionClick() {
        return professionClick;
    }

    public void setProfessionClick(Long professionClick) {
        this.professionClick = professionClick;
    }

    public List<SchoolScore> getPassingScore() {
        return passingScore;
    }

    public void setPassingScore(List<SchoolScore> passingScore) {
        this.passingScore = passingScore;
    }

    public Integer getEstimateScore() {
        return estimateScore;
    }

    public void setEstimateScore(Integer estimateScore) {
        this.estimateScore = estimateScore;
    }

    public String getEmploymentRate() {
        return employmentRate;
    }

    public void setEmploymentRate(String employmentRate) {
        this.employmentRate = employmentRate;
    }

    @Override
    public String toString() {
        return "ProfessionDetailVO{" +
                "id=" + id +
                ", professionCode='" + professionCode + '\'' +
                ", professionName='" + professionName + '\'' +
                ", schoolCode='" + schoolCode + '\'' +
                ", schoolCharacteristic='" + schoolCharacteristic + '\'' +
                ", enrolmentType='" + enrolmentType + '\'' +
                ", enrolmentTel='" + enrolmentTel + '\'' +
                ", schoolSuperiority='" + schoolSuperiority + '\'' +
                ", schoolType=" + schoolType +
                ", studyPeriod='" + studyPeriod + '\'' +
                ", schoolWebsite='" + schoolWebsite + '\'' +
                ", enrolmentWebsite='" + enrolmentWebsite + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", companyName='" + companyName + '\'' +
                ", professionClick=" + professionClick +
                ", passingScore=" + passingScore +
                ", estimateScore=" + estimateScore +
                ", employmentRate='" + employmentRate + '\'' +
                '}';
    }
}
