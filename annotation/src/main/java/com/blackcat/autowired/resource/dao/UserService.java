package com.blackcat.autowired.resource.dao;

import lombok.Data;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p> 描述 ：
 *
 * @author : blackcat
 * @date : 2020/5/26 13:55
 */
@Data
@Service
public class UserService {

    /**
     * 功能和@AutoWired的功能差不多一样，但是不支持@Primary 和@Qualifier的支持
     */
    @Resource
    private UserDao userDao;

    @Override
    public String toString() {
        return "UserService{" +
                "userDao=" + userDao +
                '}';
    }
}
