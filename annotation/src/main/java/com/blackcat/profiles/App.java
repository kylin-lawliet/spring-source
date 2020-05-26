package com.blackcat.profiles;

import com.blackcat.profiles.config.MyConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * <p> 描述 : 通过@Profile注解 来根据环境来激活标识不同的Bean
 * @author : blackcat
 * @date  : 2020/5/26 17:46
 *
 * 激活切换环境的方法：
 * 代码激活切换环境的方法  main方法示例
 * 通过运行时jvm参数来切换 -Dspring.profiles.active=test|dev|prod
*/
public class App {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();

        // 代码激活切换环境的方法
        ctx.getEnvironment().setActiveProfiles("test","dev");

        ctx.register(MyConfig.class);
        ctx.refresh();

        for(String beanName:ctx.getBeanDefinitionNames()) {
            System.out.println("容器中的BeanName："+beanName);
        }
    }
}
