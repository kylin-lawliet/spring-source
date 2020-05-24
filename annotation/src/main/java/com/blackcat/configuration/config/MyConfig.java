package com.blackcat.configuration.config;

import com.blackcat.configuration.App;
import com.blackcat.configuration.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <p> 描述 ：容器加载Bean
 * @author : blackcat
 * @date : 2020/5/23 16:08
 */
@Configuration
public class MyConfig {

    /**
     * <p> 描述 : @Bean的形式是使用的话， bean的默认名称是方法名
     * @author : blackcat
     * @date  : 2020/5/23 16:20
     * @see App ctx.getBean("user1") 得到bean
    */
    @Bean
    public User user1(){
        return new User();
    }

    /**
     * <p> 描述 : @Bean(value="bean的名称") 那么bean的名称是指定的
     * @author : blackcat
     * @date  : 2020/5/23 16:22
     * @see App ctx.getBean("user3") 得到bean
    */
    @Bean("user3")
    public User user2(){
        return new User();
    }
}
