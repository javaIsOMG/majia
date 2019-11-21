package com.funtl.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Classname providerApplication
 * @Description TODO
 * @Date 2019/11/21 15:39
 * @Created by heyinghao
 */
//@EnableDiscoveryClient
@EnableEurekaClient
@SpringBootApplication
public class providerApplication {
    public static void main(String[] args) {
        SpringApplication.run(providerApplication.class,args);
    }
}
