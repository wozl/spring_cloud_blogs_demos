package com.config.client.configdatabases.config;

import com.alibaba.druid.pool.DruidDataSource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Slf4j
@RefreshScope
@Configuration
public class DruidConfiguration {

    @Value("${spring.datasource.url}")
    private String url;
    @Value("${spring.datasource.username}")
    private String username;
    @Value("${spring.datasource.password}")
    private String password;
    @Value("${spring.datasource.driver-class-name}")
    private String driver_class_name;
    @Value("${spring.datasource.dbcp2.initial-size}")
    private int initialsize;
    @Value("${spring.datasource.dbcp2.min-idle}")
    private int minidle;
    @Value("${spring.datasource.dbcp2.max-total}")
    private int maxtotal;
    @Value("${spring.datasource.dbcp2.max-wait-millis}")
    private int maxwait;

    @Bean //声明是一个bean
    @RefreshScope //动态刷新
    @Primary //在同样的DataSource中，首先使用被标注的DataSource
    public DataSource dataSource(){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl(this.url);
        dataSource.setUsername(this.username);
        dataSource.setPassword(this.password);
        dataSource.setDriverClassName(this.driver_class_name);

        //其它配置
        dataSource.setInitialSize(this.initialsize);
        dataSource.setMinIdle(this.minidle);
        dataSource.setMaxCreateTaskCount(this.maxtotal);
        dataSource.setMaxWait(this.maxwait);
        return dataSource;
    }
}
