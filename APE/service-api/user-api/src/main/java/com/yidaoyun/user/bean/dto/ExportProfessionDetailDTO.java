package com.yidaoyun.user.bean.dto;

import com.yidaoyun.base.util.SupportPagingDTO;

import java.util.List;

public class ExportProfessionDetailDTO extends SupportPagingDTO {
    private List<SchoolProfessionDTO> spList;

    public List<SchoolProfessionDTO> getSpList() {
        return spList;
    }

    public void setSpList(List<SchoolProfessionDTO> spList) {
        this.spList = spList;
    }
}
