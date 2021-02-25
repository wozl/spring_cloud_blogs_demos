package com.config.client.configdatabases;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
@MapperScan("com.config.client.configdatabases.dao") //批量注解dao下的mybatis映射类，相当于每个映射类的@Mapper注解
public class ConfigDatabasesApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigDatabasesApplication.class, args);
    }

}
