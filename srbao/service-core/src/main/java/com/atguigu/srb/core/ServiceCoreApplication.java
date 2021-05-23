package com.atguigu.srb.core;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.converter.json.GsonBuilderUtils;

import javax.annotation.PostConstruct;

/**
 * Author:
 * Date: 2021/5/18 20:23
 */
@SpringBootApplication
@ComponentScan({"com.atguigu.srb","com.atguigu.common"})
public class ServiceCoreApplication {

    @Value("${server.port}")
    private String port;

    public static void main(String[] args) {
        SpringApplication.run(ServiceCoreApplication.class, args);

    }

    @PostConstruct
    public void up(){
        System.out.println("启动成功 端口号"+port);
    }

}
