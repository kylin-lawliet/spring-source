package com.blackcat.scope.config;

import com.blackcat.scope.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

/**
 * <p> 描述 ：容器加载Bean
 * @author : blackcat
 * @date : 2020/5/23 16:08
 */
@Configuration
public class MyConfig {

    /**
     * <p> 描述 : 配置Bean的作用域对象
     * @author : blackcat
     * @date  : 2020/5/23 17:31
     *
     * 在不指定@Scope的情况下，所有的bean都是单实例的bean,而且是饿汉加载(容器启动实例就创建好了)
     * 指定@Scope为 prototype 表示为多实例的，而且还是懒汉模式加载（IOC容器启动的时候，并不会创建对象，而是 在第一次使用的时候才会创建）
     *
     * Scope指定的作用域方法取值:
     *  singleton 单实例的(默认)
     *  prototype 多实例的
     *  request 同一次请求
     *  session 同一个会话级别
    */
    @Bean
//    @Scope(value = "prototype")
//    @Lazy // 主要针对单实例的bean 容器启动的时候，不创建对象，在第一次使用的时候才会创建该对象
    public User user(){
        return new User();
    }

}
