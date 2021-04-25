package com.yidaoyun.user.bean.vo;

public class ProfessionDirectoryVO {

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
     * 专业录取最低分
     */
    private Integer lowestScore;
    /**
     * 专业预估分数线
     */
    private Integer estimateScore;

    /**
     * 专业层次
     */
    private String professionLevel;

    /**
     * 开设院校数
     */
    private Integer openSchoolNum;

    /**
     * 全国关注度排名
     */
    private Integer nationwideFocusRanking;

    /**
     * 专业大类名称
     */
    private String oneKindName;

    /**
     * 大类关注度排名
     */
    private Integer oneKindFocusRanking;

    public String getOneKindName() {
        return oneKindName;
    }

    public void setOneKindName(String oneKindName) {
        this.oneKindName = oneKindName;
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

    public String getProfessionLevel() {
        return professionLevel;
    }

    public void setProfessionLevel(String professionLevel) {
        this.professionLevel = professionLevel;
    }

    public Integer getOpenSchoolNum() {
        return openSchoolNum;
    }

    public void setOpenSchoolNum(Integer openSchoolNum) {
        this.openSchoolNum = openSchoolNum;
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

    @Override
    public String toString() {
        return "ProfessionDirectoryVO{" +
                "id=" + id +
                ", professionCode='" + professionCode + '\'' +
                ", professionName='" + professionName + '\'' +
                ", lowestScore=" + lowestScore +
                ", estimateScore=" + estimateScore +
                ", professionLevel='" + professionLevel + '\'' +
                ", openSchoolNum=" + openSchoolNum +
                ", nationwideFocusRanking=" + nationwideFocusRanking +
                ", oneKindFocusRanking=" + oneKindFocusRanking +
                '}';
    }
}
