package com.blackcat.lifecycle;

import com.blackcat.lifecycle.bean.Car;
import com.blackcat.lifecycle.config.MyConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * <p> 描述 : bean的生命周期
 *      bean的生命周期不是由我们自己控制，是IOC容器通过回调控制
 * @author : blackcat
 * @date  : 2020/5/25 17:01
 *
 * 为了方便查看运行结果 可以先注释掉一些注解
*/
public class App {

    public static void main(String[] args) {
        // 容器中读取Bean
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MyConfig.class);
//        Car car = ctx.getBean(Car.class);
        ctx.close();
    }
}
