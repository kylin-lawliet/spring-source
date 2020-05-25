package com.blackcat.factorybean;

import com.blackcat.factorybean.bean.CarFactoryBean;
import com.blackcat.factorybean.config.MyConfig;
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

        // 获取到的是CarFactoryBean返回的对象
        Object bean = ctx.getBean("carFactoryBean");
        System.out.println(bean.getClass());
        // print: class com.blackcat.factorybean.bean.Car

        // 加上‘&’说明获取CarFactoryBean本身 不是Car
        Object bean2 = ctx.getBean("&carFactoryBean");
        System.out.println(bean2.getClass());
        // print: class com.blackcat.factorybean.bean.CarFactoryBean

        System.out.println(bean==bean2);
        // print: false

        System.out.println(ctx.getBean("driverFactoryBean"));
        // print: com.mysql.jdbc.Driver@4b5a5ed1

        CarFactoryBean carFactoryBean = ctx.getBean(CarFactoryBean.class);
        System.out.println(carFactoryBean.getClass());
        // print: class com.blackcat.factorybean.bean.CarFactoryBean
    }
}
