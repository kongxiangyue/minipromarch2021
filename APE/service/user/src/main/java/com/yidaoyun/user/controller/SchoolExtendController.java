package com.yidaoyun.user.controller;


import com.yidaoyun.base.util.*;
import com.yidaoyun.user.bean.dto.FindSchoolExtendDTO;
import com.yidaoyun.user.bean.dto.SchoolAddDTO;
import com.yidaoyun.user.bean.dto.SchoolExtendDTO;
import com.yidaoyun.user.bean.vo.FindSchoolExtendVO;
import com.yidaoyun.user.bean.vo.SchoolCityVO;
import com.yidaoyun.user.bean.vo.SchoolDeatilVO;
import com.yidaoyun.user.bean.vo.SchoolFocusRankingVO;
import com.yidaoyun.user.domain.EnterCompany;
import com.yidaoyun.user.domain.SchoolExtend;
import com.yidaoyun.user.service.EnterCompanyService;
import com.yidaoyun.user.service.SchoolExtendService;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.beans.BeanUtils;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * 入驻单位-学校信息扩展表(SchoolExtend)表控制层
 */
@RestController
@RequestMapping("schoolExtend")
public class SchoolExtendController {


}