package com.blackcat.conditional;

import com.blackcat.conditional.config.MyConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * <p> 描述 :
 * @author : blackcat
 * @date  : 2020/5/24 14:02   
*/
public class App {

    public static void main(String[] args) {
        // 容器中读取Bean
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MyConfig.class);
        for(String beanName:ctx.getBeanDefinitionNames()) {
            System.out.println("beanName:"+beanName);
        }
    }
}
