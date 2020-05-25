package com.blackcat.lifecycle.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * <p> 描述 : 后置处理器
 *      用来修改bean的一些属性的
 * @author : blackcat
 * @date  : 2020/5/25 17:00
 *
 * 通过Spring的BeanPostProcessor的 bean的后置处理器会拦截所有bean创建过程
 * postProcessBeforeInitialization 在init方法之前调用
 * postProcessAfterInitialization 在init方法之后调用
*/
public class MyBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("MyBeanPostProcessor...postProcessBeforeInitialization:"+beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("MyBeanPostProcessor...postProcessAfterInitialization:"+beanName);
        return bean;
    }
}
