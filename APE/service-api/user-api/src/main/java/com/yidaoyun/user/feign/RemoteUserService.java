package com.yidaoyun.user.feign;

import com.yidaoyun.base.util.R;
import com.yidaoyun.user.feign.factory.RemoteUserFallbackFactory;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * user Feign服务层
 */
@FeignClient(name = "user", fallbackFactory = RemoteUserFallbackFactory.class)
public interface RemoteUserService {

    @GetMapping("enterCompany/get/{id}")
    @ApiOperation(value = "查询入驻单位", notes = "查询入驻单位")
    R enterCompanyGet(@PathVariable("id") Integer id);

    @GetMapping("commonUser/get/{id}")
    @ApiOperation(value = "查询普通用户", notes = "查询普通用户")
    R commonUserGet(@PathVariable("id") Integer id);

    @PostMapping("enterCompany/toDoReminder")
    @ApiOperation(value = "待办事项提醒", notes = "待办事项提醒")
    R toDoReminder(@RequestParam("enterCompanyId") Integer enterCompanyId, @RequestParam("remark") String remark);

    @PostMapping("commonUser/eventIsAboutToStart")
    @ApiOperation(value = "活动即将开始提醒", notes = "活动即将开始提醒")
    R eventIsAboutToStart(@RequestParam("commonUserId") Integer commonUserId, @RequestParam("name") String name,
                          @RequestParam("time") String time, @RequestParam("addr") String addr);

}
