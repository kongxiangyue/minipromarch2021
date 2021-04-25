package com.yidaoyun.user.bean.dto;

import com.yidaoyun.base.util.SupportPagingDTO;

import java.io.Serializable;
import java.util.Date;

/**
 * 学校专业往年分数表(SchoolScore)实体类
 */
public class SchoolScoreDTO extends SupportPagingDTO implements Serializable {
    private static final long serialVersionUID = 889865035553394016L;
    /**
    * id
    */
    private Integer id;
    /**
    * 专业代码
    */
    private String professionCode;
    /**
    * 学校代码
    */
    private String schoolCode;
    /**
    * 年份
    */
    private Integer year;
    /**
    * 专业录取最低分
    */
    private Integer lowestScore;
    /**
    * 专业预估分数线
    */
    private Integer estimateScore;
    /**
    * 批次 1 专科批 2 专科提前批 3 艺术批
    */
    private Integer enrollBatch;
    /**
    * 创建时间
    */
    private Date createTime;

    //排序 1 录取最低分倒叙 ，2预估分数线倒叙
    private Integer sort;

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
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

    public Integer getLowestScore() {
        return lowestScore;
    }

    public void setLowestScore(Integer lowestScore) {
        this.lowestScore = lowestScore;
    }

    public Integer getEstimateScore() {
        return estimateScore;
    }

    public void setEstimateScore(Integer estimateScore) {
        this.estimateScore = estimateScore;
    }

    public Integer getEnrollBatch() {
        return enrollBatch;
    }

    public void setEnrollBatch(Integer enrollBatch) {
        this.enrollBatch = enrollBatch;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "SchoolScore{" +
                "id=" + id +
                ", professionCode='" + professionCode + '\'' +
                ", schoolCode='" + schoolCode + '\'' +
                ", year=" + year +
                ", lowestScore=" + lowestScore +
                ", estimateScore='" + estimateScore + '\'' +
                ", enrollBatch=" + enrollBatch +
                ", createTime=" + createTime +
                '}';
    }
}