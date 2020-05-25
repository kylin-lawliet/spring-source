package com.blackcat.factorybean.bean;

import org.springframework.beans.factory.FactoryBean;

import java.sql.DriverManager;

/**
 * <p> 描述 :
 * @author : blackcat
 * @date  : 2020/5/25 16:23
 */
public class DriverFactoryBean implements FactoryBean {

    private String jdbcUrl;

    public String getJdbcUrl() {
        return jdbcUrl;
    }

    public void setJdbcUrl(String jdbcUrl) {
        this.jdbcUrl = jdbcUrl;
    }

    @Override
    public Object getObject() throws Exception {
        return DriverManager.getDriver(jdbcUrl);
    }

    @Override
    public Class<?> getObjectType() {
        return java.sql.Driver.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
