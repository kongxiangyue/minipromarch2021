package com.yidaoyun.base.util;

/**
 * @ClassName SupportPagingDTO
 */
public class SupportPagingDTO
{

    /**
     * 第几页
     */
    private Integer pageNum = 1;

    /**
     * 页大小
     */
    private Integer pageSize = 10;

    /**
     * 数据库查询开始行
     */
    private int startRow;

    /**
     * 总记录数
     */
    private Long total;

    public Integer getPageNum() {
        if(null != ServletUtils.getParameterToInt(Constants.PAGE_NUM)){
            return  ServletUtils.getParameterToInt(Constants.PAGE_NUM);
        }else{
            return pageNum;
        }

    }

    public void setPageNum(Integer pageNum) {
        if(null != ServletUtils.getParameterToInt(Constants.PAGE_NUM)){
            this.pageNum = ServletUtils.getParameterToInt(Constants.PAGE_NUM);
        }else{
            this.pageNum = pageNum;
        }

    }

    public Integer getPageSize()
    {
        if(null != ServletUtils.getParameterToInt(Constants.PAGE_SIZE)){
            return ServletUtils.getParameterToInt(Constants.PAGE_SIZE) ;
        }else{
            return pageSize;
        }

    }

    public void setPageSize(Integer pageSize)
    {
        if(null != ServletUtils.getParameterToInt(Constants.PAGE_SIZE)){
            this.pageSize = ServletUtils.getParameterToInt(Constants.PAGE_SIZE) ;
        }else{
            this.pageSize = pageSize;
        }
    }

    public int getStartRow()
    {
        this.startRow = (getPageNum() - 1) * getPageSize();
        if (this.startRow < 0)
        {
            this.startRow = 0;
        }
        return startRow;
    }

    public void setStartRow(int startRow)
    {
        this.startRow = startRow;
    }

    public Long getTotal()
    {
        return total;
    }

    public void setTotal(Long total)
    {
        this.total = total;
    }

}
