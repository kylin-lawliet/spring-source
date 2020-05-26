package com.blackcat.autowired.resource.dao;

import lombok.Data;
import org.springframework.stereotype.Repository;

/**
 * <p> 描述 ：
 *
 * @author : blackcat
 * @date : 2020/5/26 13:56
 */
@Data
@Repository
public class UserDao {

    private int flag=1;

    @Override
    public String toString() {
        return "UserDao{" +
                "flag=" + flag +
                '}';
    }
}
