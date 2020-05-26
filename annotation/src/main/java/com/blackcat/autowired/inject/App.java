package com.blackcat.autowired.inject;

import com.blackcat.autowired.inject.config.MyConfig;
import com.blackcat.autowired.inject.dao.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * <p> 描述 :
 * @author : blackcat
 * @date  : 2020/5/25 17:46
*/
public class App {

    public static void main(String[] args) {
        // 容器中读取Bean
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MyConfig.class);

        UserService userService = ctx.getBean(UserService.class);
        System.out.println(userService.toString());

        Object userDao = ctx.getBean("userDao");
        System.out.println(userDao.toString());

    }
}
