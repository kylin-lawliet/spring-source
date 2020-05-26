package com.blackcat.autowired.autowiredinmethod.config;

import com.blackcat.autowired.autowiredinmethod.component.MyAspect;
import com.blackcat.autowired.autowiredinmethod.component.MyLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * <p> 描述 :
 * @author : blackcat
 * @date  : 2020/5/25 17:45
*/
@Configuration
@ComponentScan(basePackages = "com.blackcat.autowired.autowiredinmethod")
public class MyConfig {

    /**
     * <p> 描述 : 标注在配置类上的入参中（可以不写）
     * @author : blackcat
     * @date  : 2020/5/26 14:59
    */
    @Bean
    public MyAspect myAspect(@Autowired MyLog myLog) {
        MyAspect myAspect = new MyAspect(myLog);
        return myAspect;
    }
}
