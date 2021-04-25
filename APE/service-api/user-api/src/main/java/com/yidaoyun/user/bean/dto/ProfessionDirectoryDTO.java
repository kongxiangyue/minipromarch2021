package com.yidaoyun.user.bean.dto;

import com.yidaoyun.base.util.SupportPagingDTO;

import java.io.Serializable;

public class ProfessionDirectoryDTO extends SupportPagingDTO implements Serializable {

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
     * 专业名称
     */
    private String professionName;

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
     * 专业二类代码
     */
    private String twoKindCode;

    /**
     * 专业二类名称
     */
    private String twoKindName;

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

    public String getProfessionName() {
        return professionName;
    }

    public void setProfessionName(String professionName) {
        this.professionName = professionName;
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

    @Override
    public String toString() {
        return "ProfessionDirectoryDTO{" +
                "estimateScoreStart=" + estimateScoreStart +
                ", estimateScoreEnd=" + estimateScoreEnd +
                ", lowestScoreStart=" + lowestScoreStart +
                ", lowestScoreEnd=" + lowestScoreEnd +
                ", professionName='" + professionName + '\'' +
                ", sortType=" + sortType +
                ", oneKindCode='" + oneKindCode + '\'' +
                ", oneKindName='" + oneKindName + '\'' +
                ", twoKindCode='" + twoKindCode + '\'' +
                ", twoKindName='" + twoKindName + '\'' +
                ", year=" + year +
                '}';
    }
}
