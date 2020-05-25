package com.blackcat.import1.config;

import com.blackcat.import1.compent.Car;
import com.blackcat.import1.compent.Person;
import com.blackcat.import1.importselect.MyBeanDefinitionRegister;
import com.blackcat.import1.importselect.MyImportSelector;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * <p> 描述 ：Import导入组件
 * @author : blackcat
 * @date : 2020/5/25 16:08
 */
@Configuration
//@Import(value = {Person.class, Car.class})
//@Import(value = {Person.class, Car.class, MyImportSelector.class})
@Import(value = {Person.class, Car.class, MyImportSelector.class, MyBeanDefinitionRegister.class})
public class MyConfig {

}
