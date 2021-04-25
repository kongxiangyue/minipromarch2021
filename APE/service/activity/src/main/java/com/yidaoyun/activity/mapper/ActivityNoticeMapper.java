package com.yidaoyun.activity.mapper;

import com.yidaoyun.activity.domain.ActivityNotice;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

/**
 * 活动通知Mapper接口
 */
@Repository
public interface ActivityNoticeMapper extends Mapper<ActivityNotice> {
}