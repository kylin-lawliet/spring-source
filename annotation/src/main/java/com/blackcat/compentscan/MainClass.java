package com.blackcat.compentscan;

import com.blackcat.compentscan.config.MyConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by smlz on 2019/5/19.
 */
public class MainClass {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MyConfig.class);
        String[] beanDefinationNames = ctx.getBeanDefinitionNames();// 获取所有加载的bean
        for (String name:beanDefinationNames) {
            System.out.println("bean的定义信息:"+name);
        }

    }
}
