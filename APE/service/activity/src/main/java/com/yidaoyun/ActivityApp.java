package com.yidaoyun;

import com.yidaoyun.base.util.EnableYiDaoYunFeignClients;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.scheduling.annotation.EnableScheduling;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * 启动程序
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableScheduling
@EnableDiscoveryClient
@EnableYiDaoYunFeignClients
@MapperScan("com.yidaoyun.*.mapper")
public class ActivityApp {
    public static void main(String[] args) {
        SpringApplication.run(ActivityApp.class);
    }
}