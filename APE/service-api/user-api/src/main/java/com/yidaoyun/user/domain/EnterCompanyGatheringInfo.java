package com.yidaoyun.user.domain;

import com.yidaoyun.base.util.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 入驻单位收款信息对象 enter_company_gathering_info
 */
@Data
@Accessors(chain = true)
@ApiModel(value = "入驻单位收款信息对象", description = "入驻单位收款信息对象")
public class EnterCompanyGatheringInfo extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "JDBC")
    @ApiModelProperty(value = "id")
    private Integer id;

    @ApiModelProperty(value = "微信收款名称")
    private String wxCollectionName;

    @ApiModelProperty(value = "微信收款二维码")
    private String wxCollectionCode;

    @ApiModelProperty(value = "支付宝收款名称")
    private String zfbCollectionName;

    @ApiModelProperty(value = "支付宝收款二维码")
    private String zfbCollectionCode;

    @ApiModelProperty(value = "银行收款户名")
    private String yhCollectionName;

    @ApiModelProperty(value = "银行收款账号")
    private String yhCollectionAcount;

    @ApiModelProperty(value = "银行收款开户行")
    private String yhCollectionBank;

    @ApiModelProperty(value = "入驻单位id")
    private Integer enterCompanyId;


}