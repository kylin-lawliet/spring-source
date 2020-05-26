package com.blackcat.autowired.autowiredinmethod;

import com.blackcat.autowired.autowiredinmethod.component.MyAspect;
import com.blackcat.autowired.autowiredinmethod.config.MyConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * <p> 描述 : 使用autowired 可以标注在方法上
 * @author : blackcat
 * @date  : 2020/5/25 17:46
*/
public class App {

    public static void main(String[] args) {
        // 容器中读取Bean
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MyConfig.class);

        MyAspect myAspect = ctx.getBean(MyAspect.class);
        System.out.println(myAspect.toString());

        Object myLog = ctx.getBean("myLog");
        System.out.println(myLog.toString());

    }
}
