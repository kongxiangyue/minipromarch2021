package com.yidaoyun.user.controller;

import cn.hutool.core.collection.CollectionUtil;
import com.alibaba.fastjson.JSONObject;
import com.yidaoyun.activity.domain.Activity;
import com.yidaoyun.base.util.ResponseVO;
import com.yidaoyun.user.bean.dto.ChatEachOtherDTO;
import com.yidaoyun.user.bean.dto.ChatFirstDTO;
import com.yidaoyun.user.bean.vo.ChatEachOtherVO;
import com.yidaoyun.user.bean.vo.ChatFirstVO;
import com.yidaoyun.user.bean.vo.ConfigAddress;
import com.yidaoyun.user.bean.vo.QuestionVO;
import com.yidaoyun.user.domain.ChatDialogBox;
import com.yidaoyun.user.domain.ChatQuestion;
import com.yidaoyun.user.domain.ChatRecords;
import com.yidaoyun.user.util.PythonTransferUtils;
import com.yidaoyun.user.util.ThisController;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author: ${xzr}
 * @date: 2020/6/18 14:41
 * @description:
 */
@RestController
@RequestMapping("chat")
public class RobotChatController extends ThisController {


}
