package com.yidaoyun.user.bean.dto;

import com.yidaoyun.user.domain.SchoolEmployment;

import java.util.List;

public class SchoolEmploymentListDTO {
    private List<SchoolEmployment>  schoolEmploymentListDTO;

    public List<SchoolEmployment> getSchoolEmploymentListDTO() {
        return schoolEmploymentListDTO;
    }

    public void setSchoolEmploymentListDTO(List<SchoolEmployment> schoolEmploymentListDTO) {
        this.schoolEmploymentListDTO = schoolEmploymentListDTO;
    }
}
