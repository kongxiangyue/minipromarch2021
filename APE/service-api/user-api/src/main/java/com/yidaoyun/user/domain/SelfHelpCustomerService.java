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
 * 自助客服对象 self_help_customer_service
 */
@Data
@Accessors(chain = true)
@ApiModel(value = "自助客服对象", description = "自助客服对象")
public class SelfHelpCustomerService extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "JDBC")
    @ApiModelProperty(value = "id")
    private Integer id;
    @ApiModelProperty(value = "标题")
    private String title;
    @ApiModelProperty(value = "关键词")
    private String keywords;
    @ApiModelProperty(value = "内容")
    private String content;
    @ApiModelProperty(value = "入驻单位id")
    private Integer enterCompanyId;

}