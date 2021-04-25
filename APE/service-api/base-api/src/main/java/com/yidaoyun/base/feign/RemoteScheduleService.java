package com.yidaoyun.base.feign;

import com.yidaoyun.base.condition.ScheduleCondition;
import com.yidaoyun.base.feign.factory.RemoteScheduleFallbackFactory;
import com.yidaoyun.base.util.R;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "schedule" , fallbackFactory = RemoteScheduleFallbackFactory.class)
public interface RemoteScheduleService {

    @PostMapping(value = "/schedule/task/add")
    @ApiOperation("定时任务添加")
    R addTask(@RequestBody ScheduleCondition condition);

    @PostMapping(value = "/schedule/task/update")
    @ApiOperation("定时任务更新")
    R updateTask(@RequestBody ScheduleCondition condition);

    @PostMapping(value = "/schedule/task/del")
    @ApiOperation("定时任务的删除")
    R delTask(@RequestBody ScheduleCondition condition);
}