package com.hanyinh.marketweb.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author bingquan.huang@ucarinc.com
 * @version 1.0
 * @Description: 跨域配置
 * @date 2019/7/24 18:43
 */
@Configuration
public class WebConfigurer implements WebMvcConfigurer {
    @Bean
    public FilterRegistrationBean indexFilterRegistration() {
        FilterRegistrationBean registration = new FilterRegistrationBean(new IndexFilter());
        registration.addUrlPatterns("*");
        return registration;
    }
}
