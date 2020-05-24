package com.blackcat.conditional.config;

import com.blackcat.conditional.compent.MyAspect;
import com.blackcat.conditional.compent.MyLog;
import com.blackcat.conditional.conditional.MyCondition;
import com.blackcat.scope.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * <p> 描述 ：容器加载Bean 加入条件判断
 * @author : blackcat
 * @date : 2020/5/23 16:08
 */
@Configuration
public class MyConfig {

    /*@Bean
    public MyAspect myAspect() {
        return new MyAspect();
    }*/

    @Bean
    @Conditional(value = MyCondition.class)
    public MyLog myLog() {
        return new MyLog();
    }


}
