package com.yidaoyun.activity.mapper;

import com.yidaoyun.activity.bean.vo.ActivitySignUpTotalVO;
import com.yidaoyun.activity.domain.ActivityGlanceOver;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * 活动Mapper接口
 */
@Repository
public interface ActivityGlanceOverMapper extends Mapper<ActivityGlanceOver> {


}
