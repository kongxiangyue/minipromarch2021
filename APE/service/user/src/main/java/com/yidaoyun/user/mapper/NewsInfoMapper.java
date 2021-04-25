package com.yidaoyun.user.mapper;

import com.yidaoyun.base.util.SupportPagingDTO;
import com.yidaoyun.user.domain.NewsInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;


/**
 * 普通用户Mapper接口
 */
@Repository
public interface NewsInfoMapper extends Mapper<NewsInfo> {
}
