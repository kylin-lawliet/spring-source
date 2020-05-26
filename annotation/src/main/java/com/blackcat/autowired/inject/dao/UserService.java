package com.blackcat.autowired.inject.dao;

import lombok.Data;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

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
     * 需要导入jar包依赖
     * 功能和支持@Primary功能 ,但是没有Require=false的功能
     */
    @Inject
    private UserDao userDao;

    @Override
    public String toString() {
        return "UserService{" +
                "userDao=" + userDao +
                '}';
    }
}
