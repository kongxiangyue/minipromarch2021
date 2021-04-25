package com.yidaoyun.activity.feign;

import com.yidaoyun.activity.domain.Activity;
import com.yidaoyun.activity.domain.SignUpTable;
import com.yidaoyun.activity.feign.factory.RemoteActivityFallbackFactory;
import com.yidaoyun.base.util.R;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * activity Feign服务层
 */
@FeignClient(name = "activity" , fallbackFactory = RemoteActivityFallbackFactory.class)
public interface RemoteActivityService {

    @GetMapping("activity/get/{id}")
    @ApiOperation(value = "查询活动", notes = "查询活动")
    R activityGet(@PathVariable("id") Integer id);

    @GetMapping("activity/getByActivityNumber")
    @ApiOperation(value = "活动数量", notes = "活动数量")
    Activity getByActivityNumber(@RequestParam("activityNumber") String activityNumber);

    @PostMapping("activity/update")
    @ApiOperation(value = "修改保存活动", notes = "修改保存活动")
    R activityUpdate(@RequestBody Activity activity);

    @PostMapping("activity/eventIsAboutToStart")
    @ApiOperation(value = "活动即将开始提醒", notes = "活动即将开始提醒")
    R activityEventIsAboutToStart(@RequestParam("activityId") Integer activityId);

    @GetMapping("signUpTable/selectByCommonUserIdAndActivityId")
    SignUpTable signUpTableSelectByCommonUserIdAndActivityId(@RequestParam("commonUserId") Integer commonUserId,
                                                         @RequestParam("activityId") Integer activityId);

}
