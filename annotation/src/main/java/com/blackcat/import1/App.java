package com.blackcat.import1;

import com.blackcat.import1.config.MyConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * <p> 描述 ：
 *
 * @author : blackcat
 * @date : 2020/5/25 16:05
 */
public class App {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MyConfig.class);
        for(String beanName:ctx.getBeanDefinitionNames()) {
            System.out.println("组件名称:"+beanName);
        }
    }
}
