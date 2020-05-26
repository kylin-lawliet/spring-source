package com.blackcat.autowired.autowired.dao;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * <p> 描述 ：
 *
 * @author : blackcat
 * @date : 2020/5/26 14:03
 */
@Data
@Service
public class BaiDuService {

    /**
     * <p> 描述 : 自动装配注解
     * @author : blackcat
     * @date  : 2020/5/26 14:17
     *
     * 假设我们需要指定特定的组件来进行装配，我们可以通过使用@Qualifier("userDao")来指定装配的组件
     * 或者在配置类上的@Bean加上@Primary注解
     *
     * Autowired(required = false) 的意思是装配的上就装，装不上就不装。
     * 示例 @Qualifier("userDao3") 容器中即没有userDao3也没有userDao2，那么在装配的时候就会抛出异常。
     * 若我们想不抛异常 ，我们需要指定 required为false的时候可以了
    */
//    @Qualifier("userDao")
//    @Autowired(required = false)
    @Autowired
    private UserDao userDao2;

    @Override
    public String toString() {
        return "BaiDuService{" +
                "userDao=" + userDao2 +
                '}';
    }

}
