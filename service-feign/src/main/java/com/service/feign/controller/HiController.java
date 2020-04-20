package com.service.feign.controller;

import com.service.feign.services.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

    @Autowired
    @SuppressWarnings("all")
    SchedualServiceHi schedualServiceHi;

    @GetMapping(value = "/hi")
    public String sayhI(@RequestParam String name){
        return schedualServiceHi.sayHiFromClientOne(name);
    }
}
