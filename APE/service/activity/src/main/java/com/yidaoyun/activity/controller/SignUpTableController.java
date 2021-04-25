package com.yidaoyun.activity.controller;

import cn.afterturn.easypoi.excel.ExcelExportUtil;
import cn.afterturn.easypoi.excel.entity.ExportParams;
import cn.afterturn.easypoi.excel.entity.params.ExcelExportEntity;
import cn.hutool.core.util.ObjectUtil;
import com.yidaoyun.activity.bean.vo.ActivitySignUpTotalVO;
import com.yidaoyun.activity.domain.SignUpTable;
import com.yidaoyun.activity.util.ThisController;
import com.yidaoyun.base.util.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.apache.poi.ss.usermodel.Workbook;
import org.redisson.api.RLock;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Example;

import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

/**
 * 报名 提供者
 */
@RestController
@RequestMapping("signUpTable")
@Api(value = "报名 提供者", tags = "报名 提供者")
public class SignUpTableController extends ThisController {


}