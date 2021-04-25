package com.yidaoyun.base.util;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Entity基类
 */
@ApiModel(value = "Entity基类",description = "Entity基类")
@Data
@Accessors(chain = true)
public class BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

/*    @ApiModelProperty(value = "搜索值")
    private String searchValue;

    @ApiModelProperty(value = "创建者")
    private String createBy;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "更新者")
    private String updateBy;

    @ApiModelProperty(value = "更新时间")
    private Date updateTime;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "beginTime")
    private String beginTime;

    @ApiModelProperty(value = "endTime")
    private String endTime;

    @ApiModelProperty(value = "请求参数")
    private Map<String, Object> params;*/

}
