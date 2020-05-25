package com.blackcat.value.entity;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * <p> 描述 :
 * @author : blackcat
 * @date  : 2020/5/25 17:45
*/
@Data
@Component
public class User {

    // 通过普通的方式
    @Value("cat")
    private String userName;

    // spel方式来赋值
    @Value("#{28-3}")
    private Integer age;

    // 通过读取外部配置文件的值
    @Value("${user.userName}")
    private String other;
}
