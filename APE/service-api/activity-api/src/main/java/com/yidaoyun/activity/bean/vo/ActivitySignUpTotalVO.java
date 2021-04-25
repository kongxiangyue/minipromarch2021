package com.yidaoyun.activity.bean.vo;

import com.yidaoyun.base.util.BaseEntity;

import java.util.Date;

public class ActivitySignUpTotalVO extends BaseEntity {
    /**
     * 日期
     */
    private Date date;
    /**
     * 总数
     */
    private Long total;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }
}
