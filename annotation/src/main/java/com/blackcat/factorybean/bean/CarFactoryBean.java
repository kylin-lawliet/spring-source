package com.blackcat.factorybean.bean;

import org.springframework.beans.factory.FactoryBean;

/**
 * <p> 描述 : 通过实现factoryBean接口往容器中注册组件
 *      使用场景 在Bean初始化时需要生成很多数据操作
 *      适合 整合第三方的复杂初始化
 *      比如 SqlSessionFactoryBean
 *
 * @author : blackcat
 * @date  : 2020/5/25 16:23
 */
public class CarFactoryBean implements FactoryBean<Car> {

    // 返回bean的对象
    @Override
    public Car getObject() throws Exception {
        return new Car();
    }

    // 返回bean的类型
    @Override
    public Class<?> getObjectType() {
        return Car.class;
    }

    // 是否为单利
    @Override
    public boolean isSingleton() {
        return false;
    }
}
