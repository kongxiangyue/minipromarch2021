package com.yidaoyun.user.controller;


import com.yidaoyun.base.util.ResponsePagingVO;
import com.yidaoyun.base.util.ResponseVO;
import com.yidaoyun.user.bean.dto.SchoolProfessionDTO;
import com.yidaoyun.user.bean.vo.SchoolProfessionVO;
import com.yidaoyun.user.domain.SchoolProfession;
import com.yidaoyun.user.service.SchoolProfessionService;
import com.yidaoyun.user.service.SchoolScoreService;
import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 学校专业关系表(SchoolProfession)表控制层
 */
@RestController
@RequestMapping("schoolProfession")
public class SchoolProfessionController {

}