package com.blackcat.value.config;

import com.blackcat.value.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * <p> 描述 :
 * @author : blackcat
 * @date  : 2020/5/25 17:45
*/
@Configuration
@PropertySource(value = {"classpath:user.properties"})// 指定外部文件的位置
public class MyConfig {

    @Bean
    public User user() {
        return new User();
    }
}
