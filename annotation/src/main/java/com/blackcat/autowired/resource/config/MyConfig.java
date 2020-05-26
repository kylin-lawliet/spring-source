package com.blackcat.autowired.resource.config;

import com.blackcat.autowired.autowired.dao.UserDao;
import com.blackcat.autowired.autowired.dao.UserService;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * <p> 描述 :
 * @author : blackcat
 * @date  : 2020/5/25 17:45
*/
@Configuration
@ComponentScan(basePackages = "com.blackcat.autowired.resource")
public class MyConfig {

    /*@Primary
    @Bean
    public UserDao userDao2() {
        return new UserDao();
    }*/
}
