package com.yidaoyun.user.bean.vo;

import java.util.List;

public class OneKindGroupVO {

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
     * 专业列表
     */
    List<ProfessionDirectoryVO> professionDirectoryList;

    public List<ProfessionDirectoryVO> getProfessionDirectoryList() {
        return professionDirectoryList;
    }

    public void setProfessionDirectoryList(List<ProfessionDirectoryVO> professionDirectoryList) {
        this.professionDirectoryList = professionDirectoryList;
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
        return "OneKindGroupVO{" +
                "oneKindCode='" + oneKindCode + '\'' +
                ", oneKindName='" + oneKindName + '\'' +
                ", twoKindCode='" + twoKindCode + '\'' +
                ", twoKindName='" + twoKindName + '\'' +
                ", professionDirectoryList=" + professionDirectoryList +
                '}';
    }
}
