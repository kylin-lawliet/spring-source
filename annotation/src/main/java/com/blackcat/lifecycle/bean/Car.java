package com.blackcat.lifecycle.bean;

/**
 * <p> 描述 :
 * @author : blackcat
 * @date  : 2020/5/25 16:58
 */
public class Car {

    public Car() {
        System.out.println("Car的构造方法..........");
    }

    public void init() {
        System.out.println("Car的初始化方法......init");
    }

    public void destroy() {
        System.out.println("Car的销毁方法.....destroy");
    }

}
