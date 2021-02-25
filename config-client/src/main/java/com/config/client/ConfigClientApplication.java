package com.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaClient
@SpringBootApplication
@RestController
@RefreshScope
public class ConfigClientApplication {

    public static void main(String[] args) {

        SpringApplication.run(ConfigClientApplication.class, args);
    }

    @Value("${foo}")
    String fool;
    @RequestMapping(value ="/hi")
    public String hi(){
        return fool;
    }

    @Value("${server.port}")
    Integer port;

    @GetMapping("/infos")
    public String val(){
        return "这里是config-client,端口号："+port;
    }

}
