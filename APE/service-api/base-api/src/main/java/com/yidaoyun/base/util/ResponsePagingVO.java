package com.yidaoyun.base.util;

import java.util.List;

/**
 * @ClassName SupportPagingVO
 */
public class ResponsePagingVO<T> extends BaseResponse{


    /**
     * 页大小
     */
    private Integer pageSize = 10;

    /**
     * 总记录数
     */
    private Long total = 0L;

    /**
     * 当前页
     */
    private Integer pageNum;

    /**
     * 当前页列表
     */
    private List<T> rows;


    public Integer getPageSize() {
        if(null != ServletUtils.getParameterToInt(Constants.PAGE_SIZE)){
            return ServletUtils.getParameterToInt(Constants.PAGE_SIZE);
        }else{
            return pageSize;
        }
    }

    public void setPageSize(Integer pageSize) {
        if(null != ServletUtils.getParameterToInt(Constants.PAGE_SIZE)){
            this.pageSize = ServletUtils.getParameterToInt(Constants.PAGE_SIZE);
        }else{
            this.pageSize = pageSize;
        }
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        if(null != ServletUtils.getParameterToInt(Constants.PAGE_NUM)){
            this.pageNum = ServletUtils.getParameterToInt(Constants.PAGE_NUM);
        }else{
            this.pageNum = pageNum;
        }
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }

    @Override
    public String toString() {
        return "SupportPagingVO{" +
                "pageSize=" + pageSize +
                ", total=" + total +
                ", pageNum=" + pageNum +
                ", rows=" + rows +
                '}';
    }
}
