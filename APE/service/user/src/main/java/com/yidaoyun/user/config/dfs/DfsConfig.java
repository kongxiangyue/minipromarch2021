package com.yidaoyun.user.config.dfs;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * <p>File：DfsConfig.java</p>
 * <p>Title: 分布式文件配置</p>
 * <p>Description:</p>
 */
@Data
@Component
@ConfigurationProperties(prefix = "dfs")
public class DfsConfig {

    /**
     * 路径
     */
    private String path;

    //生产环境建议用nginx绑定域名映射
    /**
     * 域名
     */
    private String domain;

}