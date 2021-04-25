package com.yidaoyun.activity.mapper;

import com.yidaoyun.activity.bean.vo.ActivitySignUpTotalVO;
import com.yidaoyun.activity.domain.SignUpTable;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * 报名Mapper接口
 */
@Repository
public interface SignUpTableMapper extends Mapper<SignUpTable> {
}
