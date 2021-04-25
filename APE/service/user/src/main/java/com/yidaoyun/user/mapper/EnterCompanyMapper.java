package com.yidaoyun.user.mapper;

import com.yidaoyun.base.util.SupportPagingDTO;
import com.yidaoyun.user.bean.dto.EnterCompanyAttentionDTO;
import com.yidaoyun.user.bean.vo.EnterCompanyVo;
import com.yidaoyun.user.domain.EnterCompany;
import com.yidaoyun.user.domain.MyAttention;
import com.yidaoyun.user.domain.NoticeAnnouncement;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * 入驻单位Mapper接口
 */
@Repository
public interface EnterCompanyMapper extends Mapper<EnterCompany> {

}
