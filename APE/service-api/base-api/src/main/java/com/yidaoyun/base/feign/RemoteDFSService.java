package com.yidaoyun.base.feign;

import com.yidaoyun.base.feign.factory.RemoteDFSFallbackFactory;
import com.yidaoyun.base.util.R;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

/**
 * dfs Feign服务层
 */
@FeignClient(name = "dfs" , fallbackFactory = RemoteDFSFallbackFactory.class)
public interface RemoteDFSService {

    /**
     * 通用上传请求 todo:暂时不用
     */
    @PostMapping("upload")
    @ApiOperation(value = "通用上传请求", notes = "通用上传请求")
    R upload(MultipartFile file);

}
