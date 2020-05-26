package com.blackcat.ware.component;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * <p> 描述 ：自己的组件 需要使用spring ioc的底层组件的时候
 *      比如 ApplicationContext等 我们可以通过实现XXXAware接口来实现
 * @author : blackcat
 * @date : 2020/5/26 15:26
 */
@Component
public class MyComponent  implements ApplicationContextAware, BeanNameAware {

    private ApplicationContext applicationContext;

    @Override
    public void setBeanName(String name) {
        System.out.println("current bean name is :【"+name+"】");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
