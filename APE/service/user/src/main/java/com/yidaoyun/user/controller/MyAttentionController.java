package com.yidaoyun.user.controller;

import cn.hutool.core.collection.CollectionUtil;
import com.yidaoyun.activity.domain.Activity;
import com.yidaoyun.base.util.EntityUtil;
import com.yidaoyun.base.util.R;
import com.yidaoyun.base.util.ResponsePagingVO;
import com.yidaoyun.base.util.SupportPagingDTO;
import com.yidaoyun.user.bean.dto.EnterCompanyAttentionDTO;
import com.yidaoyun.user.bean.dto.UserMyAttentionDTO;
import com.yidaoyun.user.bean.vo.EnterCompanyVo;
import com.yidaoyun.user.bean.vo.HeadlinesVo;
import com.yidaoyun.user.bean.vo.FinsVo;
import com.yidaoyun.user.domain.EnterCompany;
import com.yidaoyun.user.domain.MyAttention;
import com.yidaoyun.user.domain.NewsInfo;
import com.yidaoyun.user.domain.NoticeAnnouncement;
import com.yidaoyun.user.util.ThisController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.BeanUtils;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * 我的关注 提供者
 */
@RestController
@RequestMapping("myAttention")
@Api(value = "我的关注 提供者", tags = "我的关注 提供者")
public class MyAttentionController extends ThisController {


}