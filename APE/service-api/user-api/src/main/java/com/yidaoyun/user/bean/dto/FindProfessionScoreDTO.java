package com.yidaoyun.user.bean.dto;

import com.yidaoyun.base.util.SupportPagingDTO;

import java.io.Serializable;


public class FindProfessionScoreDTO extends SupportPagingDTO implements Serializable {

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
     * 批次 1 专科批 2 专科提前批 3 艺术批
     */
    private Integer enrollBatch;

    /**
     * 专业名称
     */
    private String professionName;

    /**
     * 1文科 2理科
     */
    private Integer subjectType;

    /**
     * 排序 1按全国关注度排序 2按专业大类关注度排序
     */
    private Integer sortType;

    /**
     * 专业大类代码
     */
    private String oneKindCode;
    /**
     * 专业大类名称
     */
    private String oneKindName;

    /**
     * 年份
     * @return
     */
    private Integer year;

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
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

    public Integer getEnrollBatch() {
        return enrollBatch;
    }

    public void setEnrollBatch(Integer enrollBatch) {
        this.enrollBatch = enrollBatch;
    }

    public String getProfessionName() {
        return professionName;
    }

    public void setProfessionName(String professionName) {
        this.professionName = professionName;
    }

    public Integer getSubjectType() {
        return subjectType;
    }

    public void setSubjectType(Integer subjectType) {
        this.subjectType = subjectType;
    }

    public Integer getSortType() {
        return sortType;
    }

    public void setSortType(Integer sortType) {
        this.sortType = sortType;
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
}
