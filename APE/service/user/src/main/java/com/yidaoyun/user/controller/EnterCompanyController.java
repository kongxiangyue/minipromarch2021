package com.yidaoyun.user.controller;

import cn.hutool.core.util.IdUtil;
import com.yidaoyun.activity.domain.Activity;
import com.yidaoyun.administrator.annotation.HasPermissions;
import com.yidaoyun.base.util.*;
import com.yidaoyun.user.bean.dto.EnterCompanyDTO;
import com.yidaoyun.user.bean.vo.EnterCompanyVo;
import com.yidaoyun.user.domain.EnterCompany;
import com.yidaoyun.user.domain.MyAttention;
import com.yidaoyun.user.domain.SchoolExtend;
import com.yidaoyun.user.service.SchoolExtendService;
import com.yidaoyun.user.util.ThisController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;
import org.weixin4j.WeixinException;
import org.weixin4j.model.message.template.Miniprogram;
import org.weixin4j.model.message.template.TemplateData;
import org.weixin4j.model.message.template.TemplateMessage;
import org.weixin4j.spring.WeixinTemplate;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

/**
 * 入驻单位 提供者
 */
@RestController
@RequestMapping("enterCompany")
@Api(value = "入驻单位 提供者", tags = "入驻单位 提供者")
public class EnterCompanyController extends ThisController {



}
