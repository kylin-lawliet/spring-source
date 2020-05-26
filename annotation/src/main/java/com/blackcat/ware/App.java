package com.blackcat.ware;

import com.blackcat.ware.config.MyConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * <p> 描述 : Aware接口
 * @author : blackcat
 * @date  : 2020/5/26 17:46
*/
public class App {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
    }
}
