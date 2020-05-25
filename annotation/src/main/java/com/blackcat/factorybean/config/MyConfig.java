package com.blackcat.factorybean.config;

import com.blackcat.factorybean.bean.CarFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * <p> 描述 ：Import导入组件
 * @author : blackcat
 * @date : 2020/5/25 16:22
 */
@Configuration
@ImportResource(locations = {"classpath:beans.xml"})
public class MyConfig {

    @Bean
    public CarFactoryBean carFactoryBean() {
        return new CarFactoryBean();
    }
}
