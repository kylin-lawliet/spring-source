package com.blackcat.compentscan.config;

import com.blackcat.compentscan.filtertype.MyFilterType;
import com.blackcat.compentscan.service.UserService;
import com.blackcat.configuration.App;
import com.blackcat.configuration.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * <p> 描述 ：CompentScan注解进行包扫描
 * @author : blackcat
 * @date : 2020/5/23 16:08
 *
 * 参数说明：
 * basePackages:扫描的路径
 * excludeFilters:排除 过滤条件
 * includeFilters:包含 过滤条件
 * useDefaultFilters：若使用包含的用法，需要把useDefaultFilters属性设置为false（true表示扫描全部的）
 *
 *  type的类型：
 *  FilterType.ANNOTATION: @Controller @Service @Repository @Compent
 *  FilterType.ASSIGNABLE_TYPE: @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,value = {UserService.class})
 *  FilterType.REGEX: 正则表达式的
 *  FilterType.ASPECTJ: aspectj类型的
 *  FilterType.CUSTOM: 自定义的
 */
//@ComponentScan(basePackages = {"com.blackcat.compentscan"})
/**
 * 排除 将不会加载所有Controller类 及UserService类(指定类)
 */
/*@ComponentScan(basePackages = {"com.blackcat.compentscan"},excludeFilters = {
    @ComponentScan.Filter(type = FilterType.ANNOTATION,value = {Controller.class}),
    @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,value = {UserService.class})
})*/

/**
 * 组合使用
 */
/*@ComponentScan(basePackages = {"com.blackcat.compentscan"},
    excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION,value = {Controller.class})},
    includeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION,value = Repository.class)
})*/
/**
 * 包含 只加载包含过滤条件  需要把useDefaultFilters属性设置为false（true表示扫描全部的）
 * 其他写法：
 *  excludeFilters = {
 *     @ComponentScan.Filter(type = FilterType.ANNOTATION,value = {Controller.class, Service.class}),
 *      @ComponentScan.Filter(type = FilterType.CUSTOM,value = MyFilterType.class)
 *  }
 */
@ComponentScan(basePackages = {"com.blackcat.compentscan"},includeFilters = {
    @ComponentScan.Filter(type = FilterType.CUSTOM,value = MyFilterType.class)
},useDefaultFilters = false)
@Configuration
public class MyConfig {

}
