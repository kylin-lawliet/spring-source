package com.blackcat.lifecycle.config;

import com.blackcat.lifecycle.bean.BlackCatLog;
import com.blackcat.lifecycle.bean.Car;
import com.blackcat.lifecycle.bean.MyBeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * <p> 描述 : 生命周期
 * @author : blackcat
 * @date  : 2020/5/25 17:04
*/
@Configuration
@ComponentScan(basePackages = "com.blackcat.lifecycle")
public class MyConfig {

    /**
     * <p> 描述 : 指定了bean的生命周期的初始化方法和销毁方法
     * @author : blackcat
     * @date  : 2020/5/25 17:14
     *
     * 针对单实例bean的话，容器启动的时候，bean的对象就创建了，而且容器销毁的时候，也会调用Bean的销毁方法
     * 针对多实例bean的话,容器启动的时候，bean是不会被创建的而是在获取bean的时候被创建，而且bean的销毁不受 IOC容器的管理.
    */
    @Scope(value = "prototype") // 加入该注解为多例
    //@Bean(initMethod = "init",destroyMethod = "destroy")
    public Car car() {
        return new Car();
    }

    //@Bean(initMethod = "init")
    public BlackCatLog blackCatLog() {
        return new BlackCatLog();
    }

    //@Bean
    public MyBeanPostProcessor myBeanPostProcessor() {
        return new MyBeanPostProcessor();
    }
}
