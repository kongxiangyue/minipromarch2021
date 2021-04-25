package com.yidaoyun.user.controller;

import com.yidaoyun.base.util.ResponsePagingVO;
import com.yidaoyun.base.util.ResponseVO;
import com.yidaoyun.base.util.StringUtils;
import com.yidaoyun.user.bean.dto.ProfessionCatalogueDTO;
import com.yidaoyun.user.bean.dto.SchoolScoreDTO;
import com.yidaoyun.user.bean.dto.SchoolScoreListDTO;
import com.yidaoyun.user.domain.ProfessionCatalogue;
import com.yidaoyun.user.domain.SchoolScore;
import com.yidaoyun.user.service.SchoolScoreService;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * 学校专业往年分数表(SchoolScore)表控制层
 */
@RestController
@RequestMapping("schoolScore")
public class SchoolScoreController {


}