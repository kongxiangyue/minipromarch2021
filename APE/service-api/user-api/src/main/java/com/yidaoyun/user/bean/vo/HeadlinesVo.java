package com.yidaoyun.user.bean.vo;

import com.yidaoyun.base.util.BaseEntity;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;


public class HeadlinesVo extends BaseEntity {
    //关注的主键id
    private Integer myAttentions;

    //新闻资讯id/通知公告id
    private Integer id;

    private String preview;

    /**
     * 通知标题
     */
    private String noticeTitle;

    /**
     * 关键词
     */
    private String keywords;

    /**
     * 发布时间
     */
    private Date releaseTime;

    /**
     * 标识 1 新闻 2 通知公告
     */
    private Integer type;
    @ApiModelProperty(value = "浏览量")
    private Long pageView;

    public Long getPageView() {
        return pageView;
    }

    public void setPageView(Long pageView) {
        this.pageView = pageView;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPreview() {
        return preview;
    }

    public void setPreview(String preview) {
        this.preview = preview;
    }

    public String getNoticeTitle() {
        return noticeTitle;
    }

    public void setNoticeTitle(String noticeTitle) {
        this.noticeTitle = noticeTitle;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public Date getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(Date releaseTime) {
        this.releaseTime = releaseTime;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getMyAttentions() {
        return myAttentions;
    }

    public void setMyAttentions(Integer myAttentions) {
        this.myAttentions = myAttentions;
    }
}
