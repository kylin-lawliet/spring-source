package com.blackcat.value;

import com.blackcat.value.config.MyConfig;
import com.blackcat.value.entity.User;
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
        User user = ctx.getBean(User.class);
        System.out.println(user.getUserName());
        System.out.println(user.getAge());
        System.out.println(user.getOther());
    }
}
