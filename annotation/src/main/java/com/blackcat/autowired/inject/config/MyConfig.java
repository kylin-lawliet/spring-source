package com.blackcat.autowired.inject.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * <p> 描述 :
 * @author : blackcat
 * @date  : 2020/5/25 17:45
*/
@Configuration
@ComponentScan(basePackages = "com.blackcat.autowired.inject")
public class MyConfig {

    /*@Primary
    @Bean
    public UserDao userDao2() {
        return new UserDao();
    }*/
}
