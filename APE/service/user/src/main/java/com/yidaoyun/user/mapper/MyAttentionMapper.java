package com.yidaoyun.user.mapper;

import com.yidaoyun.user.bean.dto.UserMyAttentionDTO;
import com.yidaoyun.user.domain.MyAttention;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * 我的关注Mapper接口
 */
public interface MyAttentionMapper extends Mapper<MyAttention> {

}