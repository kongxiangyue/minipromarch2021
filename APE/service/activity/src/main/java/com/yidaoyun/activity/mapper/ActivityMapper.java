package com.yidaoyun.activity.mapper;

import com.yidaoyun.activity.domain.Activity;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * 活动Mapper接口
 */
@Repository
public interface ActivityMapper extends Mapper<Activity> {


}
