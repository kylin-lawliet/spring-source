package com.blackcat.scope;

import com.blackcat.scope.config.MyConfig;
import com.blackcat.scope.entity.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * <p> 描述 ：Spring IOC 容器底层
 * @author : blackcat
 * @date : 2020/5/23 16:06
 *
 * xml配置文件的形式Car  配置类的形式User
 */
public class App {

    public static void main(String[] args) {
        // 容器中读取Bean
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MyConfig.class);
        User user1 = (User) ctx.getBean("user");
        User user2 = (User) ctx.getBean("user");
        System.out.println(user1==user2);
    }
}
