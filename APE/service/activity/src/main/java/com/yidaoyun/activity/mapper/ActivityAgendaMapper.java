package com.yidaoyun.activity.mapper;

import com.yidaoyun.activity.domain.ActivityAgenda;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

/**
 * 活动议程Mapper接口
 */
@Repository
public interface ActivityAgendaMapper extends Mapper<ActivityAgenda> {
}