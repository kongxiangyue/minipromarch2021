package com.yidaoyun.activity.mapper;

import com.yidaoyun.activity.domain.ActivityType;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

/**
 * 活动类型Mapper接口
 */
@Repository
public interface ActivityTypeMapper extends Mapper<ActivityType> {
}