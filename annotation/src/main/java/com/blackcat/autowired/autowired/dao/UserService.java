package com.blackcat.autowired.autowired.dao;

import lombok.Data;
import org.springframework.stereotype.Service;

/**
 * <p> 描述 ：
 *
 * @author : blackcat
 * @date : 2020/5/26 13:55
 */
@Data
public class UserService {

    private UserDao userDao;

    @Override
    public String toString() {
        return "UserService{" +
                "userDao=" + userDao +
                '}';
    }
}
