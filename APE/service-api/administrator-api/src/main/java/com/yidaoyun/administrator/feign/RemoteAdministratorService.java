package com.yidaoyun.administrator.feign;

import com.yidaoyun.administrator.feign.factory.RemoteAdministratorFallbackFactory;
import com.yidaoyun.base.util.R;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 管理员用户对象 Feign服务层
 *
 * @author zhoux
 * @date 2019-12-20
 */
@FeignClient(name = "administrator" , fallbackFactory = RemoteAdministratorFallbackFactory.class)
public interface RemoteAdministratorService {

    @PostMapping("administratorUser/permissionVerify")
    Boolean permissionVerify(@RequestParam("authority") String authority, @RequestParam("id") String id);

    @GetMapping("administratorUser/get/{id}")
    @ApiOperation(value = "查询管理员用户", notes = "查询管理员用户")
    R administratorGet(@PathVariable("id") Integer id);

}
