package com.yidaoyun.user.bean.dto;

import com.yidaoyun.base.util.SupportPagingDTO;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

public class ProfessionInstItutionsDTO extends SupportPagingDTO implements Serializable {

    /**
     * 专业id（必传）
     */
    private Integer id;

    /**
     * 专业代码（必传）
     */
    private String professionCode;

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
     * 单位名称/学校名称
     */
    private String companyName;

    /**
     * 年份
     */
    private Integer year;

    /**
     * 专业名称
     */
    private String professionName;

    public String getProfessionName() {
        return professionName;
    }

    public void setProfessionName(String professionName) {
        this.professionName = professionName;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
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

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "ProfessionInstItutionsDTO{" +
                "id=" + id +
                ", professionCode='" + professionCode + '\'' +
                ", estimateScoreStart=" + estimateScoreStart +
                ", estimateScoreEnd=" + estimateScoreEnd +
                ", lowestScoreStart=" + lowestScoreStart +
                ", lowestScoreEnd=" + lowestScoreEnd +
                ", enrollBatch=" + enrollBatch +
                ", companyName='" + companyName + '\'' +
                ", year=" + year +
                ", professionName='" + professionName + '\'' +
                '}';
    }
}
