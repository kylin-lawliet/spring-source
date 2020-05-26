package com.blackcat.ware.config;

import org.springframework.context.annotation.*;

/**
 * <p> 描述 : 自己的组件 需要使用spring ioc的底层组件的时候
 *      比如 ApplicationContext等 我们可以通过实现XXXAware接口来实现
 * @author : blackcat
 * @date  : 2020/5/26 17:45
*/
@Configuration
@ComponentScan(basePackages = "com.blackcat.ware")
public class MyConfig {
}
