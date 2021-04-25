package com.yidaoyun.user.controller;

import cn.hutool.core.collection.CollectionUtil;
import com.yidaoyun.base.util.ResponsePagingVO;
import com.yidaoyun.base.util.ResponseVO;
import com.yidaoyun.user.bean.dto.*;
import com.yidaoyun.user.bean.vo.*;
import com.yidaoyun.user.domain.ProfessionCatalogue;
import com.yidaoyun.user.service.ProfessionCatalogueService;
import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.Calendar;
import java.util.List;

/**
 * 高校专业表(ProfessionCatalogue)表控制层
 */
@RestController
@RequestMapping("professionCatalogue")
public class ProfessionCatalogueController {


}