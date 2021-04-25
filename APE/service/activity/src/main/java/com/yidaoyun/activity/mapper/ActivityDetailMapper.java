package com.yidaoyun.activity.mapper;

import com.yidaoyun.activity.domain.ActivityDetail;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

/**
 * 活动详情Mapper接口
 */
@Repository
public interface ActivityDetailMapper extends Mapper<ActivityDetail> {
}