package com.yidaoyun.user.bean.dto;

import com.yidaoyun.base.util.SupportPagingDTO;

public class SchoolProfessionDTO extends SupportPagingDTO {
    //专业代码
    private String professionCode;

    //学校代码
    private String schoolCode;

    /**
     * 学院
     */
    private String schoolAcademy;

    /**
     * 更新的学院名
     */
    private String updateSchoolAcademy;

    public String getUpdateSchoolAcademy() {
        return updateSchoolAcademy;
    }

    public void setUpdateSchoolAcademy(String updateSchoolAcademy) {
        this.updateSchoolAcademy = updateSchoolAcademy;
    }

    public String getSchoolAcademy() {
        return schoolAcademy;
    }

    public void setSchoolAcademy(String schoolAcademy) {
        this.schoolAcademy = schoolAcademy;
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
}
