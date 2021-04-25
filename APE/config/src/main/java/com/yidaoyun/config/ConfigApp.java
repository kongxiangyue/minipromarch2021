package com.yidaoyun.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 配置中心
 */
@EnableDiscoveryClient
@EnableConfigServer
@SpringBootApplication
public class ConfigApp
{
    public static void main(String[] args)
    {
        SpringApplication.run(ConfigApp.class, args);
        System.out.println("配置中心(config)启动成功，请接着其他服务");
    }
}