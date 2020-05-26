package com.blackcat.autowired.autowired.dao;

import lombok.Data;

/**
 * <p> 描述 ：
 *
 * @author : blackcat
 * @date : 2020/5/26 13:56
 */
@Data
public class UserDao {

    private int flag=1;

    @Override
    public String toString() {
        return "UserDao{" +
                "flag=" + flag +
                '}';
    }
}
