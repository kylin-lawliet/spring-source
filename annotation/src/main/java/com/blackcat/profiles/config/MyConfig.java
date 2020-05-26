package com.blackcat.profiles.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.util.StringValueResolver;

import javax.sql.DataSource;

/**
 * <p> 描述 : 通过@Profile注解 来根据环境来激活标识不同的Bean
 * @author : blackcat
 * @date  : 2020/5/25 17:45
 *
 * Profile标识在类上，那么只有当前环境匹配，整个配置类才会生效
 * Profile标识在Bean上 ，那么只有当前环境的Bean才会被激活
 * 没有标志为Profile的bean 不管在什么环境都可以被激活
*/
@Configuration
@PropertySource(value = {"classpath:ds.properties"})
public class MyConfig  implements EmbeddedValueResolverAware {

    @Value("${ds.username}")
    private String userName;

    @Value("${ds.password}")
    private String password;

    private String jdbcUrl;

    private String classDriver;

    @Override
    public void setEmbeddedValueResolver(StringValueResolver stringValueResolver) {
        this.jdbcUrl = stringValueResolver.resolveStringValue("${ds.jdbcUrl}");
        this.classDriver = stringValueResolver.resolveStringValue("${ds.classDriver}");
    }

    // 标识为测试环境才会被装配
    @Bean
    @Profile(value = "test")
    public DataSource testDs() {
        return buliderDataSource(new DruidDataSource());
    }

    // 标识开发环境才会被激活
    @Bean
    @Profile(value = "dev")
    public DataSource devDs() {
        return buliderDataSource(new DruidDataSource());
    }

    // 标识生产环境才会被激活
    @Bean
    @Profile(value = "prod")
    public DataSource prodDs() {
        return buliderDataSource(new DruidDataSource());
    }

    private DataSource buliderDataSource(DruidDataSource dataSource) {
        dataSource.setUsername(userName);
        dataSource.setPassword(password);
        dataSource.setDriverClassName(classDriver);
        dataSource.setUrl(jdbcUrl);
        return dataSource;
    }
}
