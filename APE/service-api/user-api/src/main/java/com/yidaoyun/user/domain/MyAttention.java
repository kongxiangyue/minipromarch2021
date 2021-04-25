package com.yidaoyun.user.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import com.yidaoyun.base.util.BaseEntity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 我的关注对象 my_attention
 */
@Data
@Accessors(chain = true)
@ApiModel(value = "我的关注对象", description = "我的关注对象")
public class MyAttention extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "JDBC")
    @ApiModelProperty(value = "id")
    private Integer id;
    @ApiModelProperty(value = "活动id")
    private Integer activityId;
    @ApiModelProperty(value = "入驻单位id")
    private Integer enterCompanyId;
    @ApiModelProperty(value = "通知公告id")
    private Integer noticeAnnouncementId;
    @ApiModelProperty(value = "新闻资讯id")
    private Integer newsInfoId;
    @ApiModelProperty(value = "普通用户id")
    private Integer commonUserId;

}