package com.server.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient //对外暴露服务
@EnableHystrix //声明加入熔断服务组件，可使用熔断组件功能
@EnableCircuitBreaker // 启动断路器，如果要监控hystrix的流必须开启此注解，即使fegin已经通过属性
@EnableHystrixDashboard //开启HystrixDashboard仪表盘功能
public class ServerRibbonApplication {

    public static void main(String[] args) {

        SpringApplication.run(ServerRibbonApplication.class, args);
    }

    @Bean
    @LoadBalanced
    RestTemplate restTemplate(){

        return  new RestTemplate();
    }


}
