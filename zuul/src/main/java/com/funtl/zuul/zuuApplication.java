package com.funtl.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Classname zuuApplication
 * @Description TODO
 * @Date 2019/11/21 16:36
 * @Created by heyinghao
 */
@EnableEurekaClient
@EnableZuulProxy
@SpringBootApplication
public class zuuApplication {
    public static void main(String[] args) {
        SpringApplication.run(zuuApplication.class,args);
    }
}
