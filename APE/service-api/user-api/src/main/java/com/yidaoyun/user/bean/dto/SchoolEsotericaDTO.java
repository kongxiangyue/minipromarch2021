package com.yidaoyun.user.bean.dto;

import com.yidaoyun.base.util.SupportPagingDTO;

import java.io.Serializable;
import java.util.Date;

/**
 * 择校秘籍表(SchoolEsoterica)实体类
 */
public class SchoolEsotericaDTO extends SupportPagingDTO implements Serializable {
    private static final long serialVersionUID = 475441636918934588L;
    /**
    * id
    */
    private Integer id;
    /**
    * 视频标题
    */
    private String videoTitle;
    /**
    * 视频链接
    */
    private String videoLink;
    /**
    * 发布人id
    */
    private Integer userId;
    /**
    * 发布人姓名
    */
    private String userName;
    /**
    * 是否冻结  0未冻结 1未删除
    */
    private Integer videoStatus;
    /**
    * 是否删除 0未删除 1已删除
    */
    private Integer delStatus;
    /**
    * 视频排序
    */
    private Integer videoSort;
    /**
    * 创建时间
    */
    private Date createTime;

    /**
     * 占用内存
     */

    private String occupiedMemory;

    public String getOccupiedMemory() {
        return occupiedMemory;
    }

    public void setOccupiedMemory(String occupiedMemory) {
        this.occupiedMemory = occupiedMemory;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVideoTitle() {
        return videoTitle;
    }

    public void setVideoTitle(String videoTitle) {
        this.videoTitle = videoTitle;
    }

    public String getVideoLink() {
        return videoLink;
    }

    public void setVideoLink(String videoLink) {
        this.videoLink = videoLink;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getVideoStatus() {
        return videoStatus;
    }

    public void setVideoStatus(Integer videoStatus) {
        this.videoStatus = videoStatus;
    }

    public Integer getDelStatus() {
        return delStatus;
    }

    public void setDelStatus(Integer delStatus) {
        this.delStatus = delStatus;
    }

    public Integer getVideoSort() {
        return videoSort;
    }

    public void setVideoSort(Integer videoSort) {
        this.videoSort = videoSort;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "SchoolEsoterica{" +
                "id=" + id +
                ", videoTitle='" + videoTitle + '\'' +
                ", videoLink='" + videoLink + '\'' +
                ", userId=" + userId +
                ", userName='" + userName + '\'' +
                ", videoStatus=" + videoStatus +
                ", delStatus=" + delStatus +
                ", videoSort=" + videoSort +
                ", createTime=" + createTime +
                '}';
    }
}