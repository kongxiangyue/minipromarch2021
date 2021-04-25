package com.yidaoyun.user.config.dfs;

import com.yidaoyun.base.util.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * <p>File：ResourcesConfig.java</p>
 * <p>Title: 静态资源映射</p>
 * <p>Description:生产使用为了安全,不建议通过这种方式映射,推荐使用nginx配置</p>
 */
@Configuration
public class ResourcesConfig implements WebMvcConfigurer {

    @Autowired
    private DfsConfig dfsConfig;

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        /** 本地文件上传路径 */
        registry.addResourceHandler(Constants.RESOURCE_PREFIX + "/**")
                .addResourceLocations("file:" + dfsConfig.getPath() + "/");
    }

}