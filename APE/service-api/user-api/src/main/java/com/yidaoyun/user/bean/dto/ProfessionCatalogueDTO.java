package com.yidaoyun.user.bean.dto;

import com.yidaoyun.base.util.SupportPagingDTO;

import java.io.Serializable;
import java.util.Date;

/**
 * 专业目录
 */
public class ProfessionCatalogueDTO extends SupportPagingDTO implements Serializable {
    private static final long serialVersionUID = 922744518958532654L;
    /**
    * id
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
    * 专业大类代码
    */
    private String oneKindCode;
    /**
    * 专业大类名称
    */
    private String oneKindName;
    /**
    * 二级类代码
    */
    private String twoKindCode;
    /**
    * 二级类名称
    */
    private String twoKindName;
    /**
    * 专业详情
    */
    private String professionDetail;
    /**
    * 专业层次
    */
    private String professionLevel;
    /**
    * 基本修业年限
    */
    private String studyPeriod;
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
    * 点击专业名称的次数
    */
    private Long professionClick;
    /**
    * 是否删除 0未删除 1已删除
    */
    private Integer delStatus;
    /**
    * 创建时间
    */
    private Date createTime;

    /**
     * 1文科 2理科
     */
    private Integer subjectType;

    public Integer getSubjectType() {
        return subjectType;
    }

    public void setSubjectType(Integer subjectType) {
        this.subjectType = subjectType;
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

    public String getOneKindCode() {
        return oneKindCode;
    }

    public void setOneKindCode(String oneKindCode) {
        this.oneKindCode = oneKindCode;
    }

    public String getOneKindName() {
        return oneKindName;
    }

    public void setOneKindName(String oneKindName) {
        this.oneKindName = oneKindName;
    }

    public String getTwoKindCode() {
        return twoKindCode;
    }

    public void setTwoKindCode(String twoKindCode) {
        this.twoKindCode = twoKindCode;
    }

    public String getTwoKindName() {
        return twoKindName;
    }

    public void setTwoKindName(String twoKindName) {
        this.twoKindName = twoKindName;
    }

    public String getProfessionDetail() {
        return professionDetail;
    }

    public void setProfessionDetail(String professionDetail) {
        this.professionDetail = professionDetail;
    }

    public String getProfessionLevel() {
        return professionLevel;
    }

    public void setProfessionLevel(String professionLevel) {
        this.professionLevel = professionLevel;
    }

    public String getStudyPeriod() {
        return studyPeriod;
    }

    public void setStudyPeriod(String studyPeriod) {
        this.studyPeriod = studyPeriod;
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

    public Long getProfessionClick() {
        return professionClick;
    }

    public void setProfessionClick(Long professionClick) {
        this.professionClick = professionClick;
    }

    public Integer getDelStatus() {
        return delStatus;
    }

    public void setDelStatus(Integer delStatus) {
        this.delStatus = delStatus;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "ProfessionCatalogueDTO{" +
                "id=" + id +
                ", professionCode='" + professionCode + '\'' +
                ", professionName='" + professionName + '\'' +
                ", oneKindCode='" + oneKindCode + '\'' +
                ", oneKindName='" + oneKindName + '\'' +
                ", twoKindCode='" + twoKindCode + '\'' +
                ", twoKindName='" + twoKindName + '\'' +
                ", professionDetail='" + professionDetail + '\'' +
                ", professionLevel='" + professionLevel + '\'' +
                ", studyPeriod='" + studyPeriod + '\'' +
                ", fosterTarget='" + fosterTarget + '\'' +
                ", jobDirection='" + jobDirection + '\'' +
                ", trainingCourses='" + trainingCourses + '\'' +
                ", secondaryVocational='" + secondaryVocational + '\'' +
                ", bachelorDegree='" + bachelorDegree + '\'' +
                ", professionClick=" + professionClick +
                ", delStatus=" + delStatus +
                ", createTime=" + createTime +
                ", subjectType=" + subjectType +
                '}';
    }
}