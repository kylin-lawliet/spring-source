package com.blackcat.lifecycle.bean;

import org.springframework.beans.factory.InitializingBean;

/**
 * <p> 描述 : InitializingBean接口为bean提供了初始化方法的方式
 *      凡是继承该接口的类，在初始化bean的时候都会执行该方法。
 *      用来设置一些bean的属性 比如 多数据源
 * @author : blackcat
 * @date  : 2020/5/25 17:25
*/
public class BlackCatLog implements InitializingBean {


    public BlackCatLog() {
        System.out.println("BlackCatLog的 构造方法");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("BlackCatLog的 afterPropertiesSet方法");
    }


    public void init() {
        System.out.println("BlackCatLog的 init方法");
    }
}
