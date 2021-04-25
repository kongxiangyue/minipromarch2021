package com.yidaoyun.user.bean.dto;

import com.yidaoyun.base.util.SupportPagingDTO;


public class EnterCompanyAttentionDTO extends SupportPagingDTO {

    private String companyName;

    private Integer commonUserId;

    private String companyNature;

    public String getCompanyNature() {
        return companyNature;
    }

    public void setCompanyNature(String companyNature) {
        this.companyNature = companyNature;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Integer getCommonUserId() {
        return commonUserId;
    }

    public void setCommonUserId(Integer commonUserId) {
        this.commonUserId = commonUserId;
    }
}
