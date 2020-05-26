package com.blackcat.autowired.autowiredinmethod.component;

import lombok.Data;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * <p> 描述 ：
 *
 * @author : blackcat
 * @date : 2020/5/26 14:54
 */
@Getter
public class MyAspect {

    private MyLog myLog;

    @Override
    public String toString() {
        return "MyAspect{" +
                "myLog=" + myLog +
                '}';
    }

    /**
     * <p> 描述 : 标注在set方法上
     * @author : blackcat
     * @date  : 2020/5/26 14:56
     */
    //@Autowired
    public void setMyLog(MyLog myLog) {
        this.myLog = myLog;
    }

    /**
     * <p> 描述 : 标注在构造方法上
     * @author : blackcat
     * @date  : 2020/5/26 14:56
    */
    @Autowired
    public MyAspect(MyLog myLog) {
        this.myLog = myLog;
    }
}
