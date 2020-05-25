package com.blackcat.lifecycle.bean;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * <p> 描述 : 通过JSR250规范 提供的注解@PostConstruct 和@ProDestory标注的方法
 * @author : blackcat
 * @date  : 2020/5/25 16:58
*/
@Component
public class Book {

    public Book() {
        System.out.println("book 的构造方法");
    }

    @PostConstruct
    public void init() {
        System.out.println("book 的PostConstruct标志的方法");
    }

    @PreDestroy
    public void destory() {
        System.out.println("book 的PreDestory标注的方法");
    }
}
