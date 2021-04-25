package com.yidaoyun.user.bean.vo;

import com.yidaoyun.base.util.SupportPagingDTO;

import java.io.Serializable;


public class FindProfessionScoreVO {

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
     * 专业大类代码
     */
    private String oneKindCode;
    /**
     * 专业大类名称
     */
    private String oneKindName;

    /**
     * 学校代码
     */
    private String schoolCode;

    /**
     * 单位名称/学校名称
     */
    private String companyName;

    /**
     * 批次 1 专科批 2 专科提前批 3 艺术批
     */
    private Integer enrollBatch;

    /**
     * 专业录取最低分
     */
    private Integer lowestScore;
    /**
     * 专业预估分数线
     */
    private Integer estimateScore;

    /**
     * 全国关注度排名
     */
    private Integer nationwideFocusRanking;

    /**
     * 大类关注度排名
     */
    private Integer oneKindFocusRanking;

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

    public String getSchoolCode() {
        return schoolCode;
    }

    public void setSchoolCode(String schoolCode) {
        this.schoolCode = schoolCode;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Integer getEnrollBatch() {
        return enrollBatch;
    }

    public void setEnrollBatch(Integer enrollBatch) {
        this.enrollBatch = enrollBatch;
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

    public Integer getNationwideFocusRanking() {
        return nationwideFocusRanking;
    }

    public void setNationwideFocusRanking(Integer nationwideFocusRanking) {
        this.nationwideFocusRanking = nationwideFocusRanking;
    }

    public Integer getOneKindFocusRanking() {
        return oneKindFocusRanking;
    }

    public void setOneKindFocusRanking(Integer oneKindFocusRanking) {
        this.oneKindFocusRanking = oneKindFocusRanking;
    }
}
