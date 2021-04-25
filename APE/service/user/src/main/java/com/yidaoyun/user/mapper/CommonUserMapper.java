package com.yidaoyun.user.mapper;

import com.yidaoyun.user.domain.CommonUser;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * 普通用户Mapper接口
 */
@Repository
public interface CommonUserMapper extends Mapper<CommonUser> {
}
