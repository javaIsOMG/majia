package com.funtl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Classname config
 * @Description TODO
 * @Date 2019/11/21 17:33
 * @Created by heyinghao
 */
@EnableConfigServer
@EnableEurekaClient
@SpringBootApplication
public class config {
    public static void main(String[] args) {
        SpringApplication.run(config.class,args);
    }
}
