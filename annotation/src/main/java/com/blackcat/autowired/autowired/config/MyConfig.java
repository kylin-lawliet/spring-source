package com.blackcat.autowired.autowired.config;

import com.blackcat.autowired.autowired.dao.UserDao;
import com.blackcat.autowired.autowired.dao.UserService;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * <p> 描述 :
 * @author : blackcat
 * @date  : 2020/5/25 17:45
 *
 * 自动装配首先时按照类型进行装配，若在IOC容器中发现了多个相同类型的组件，
 * 那么就按照 属性名称来进行装配
 *
 * 比如，我容器中有二个UserDao类型的组件 一个叫userDao 一个叫userDao2
 * 那么我们通过@AutoWired 来修饰的属性名称时userDao， 那么拿就加载容器的userDao组件，
 * 若属性名称为 userDao2  那么他就加载的时userDao2组件
*/
@Configuration
@ComponentScan(basePackages = "com.blackcat.autowired.autowired")
public class MyConfig {
    @Bean
    public UserDao userDao2() {
        UserDao userDao = new UserDao();
        userDao.setFlag(2);
        return userDao;
    }

//    @Primary
    @Bean
    public UserDao userDao() {
        UserDao userDao = new UserDao();
        userDao.setFlag(1);
        return userDao;
    }

    @Bean(autowire = Autowire.BY_NAME)
    public UserService userService() {
        return new UserService();
    }
}
