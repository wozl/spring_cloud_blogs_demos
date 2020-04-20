package com.service.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient  //自动注册
@EnableDiscoveryClient //暴露服务
@EnableFeignClients //声明启用feign
public class ServiceFeignApplication {

    public static void main(String[] args) {

        SpringApplication.run(ServiceFeignApplication.class, args);
    }


}
