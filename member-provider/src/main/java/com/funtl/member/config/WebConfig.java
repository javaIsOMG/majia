package com.funtl.member.config;

import com.funtl.member.interceptor.ResponseResultInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Classname WebConfig
 * @Description TODO
 * @Date 2019/11/23 11:08
 * @Created by heyinghao
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new ResponseResultInterceptor()).addPathPatterns("/**");
    }
}
