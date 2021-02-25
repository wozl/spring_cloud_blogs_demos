package com.config.client.configdatabases.controller;

import com.config.client.configdatabases.services.WebServices;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/index")
public class WebController {

    @Autowired
    private WebServices ws;

    @Autowired
    private Gson js;

    @GetMapping(value = "/infos")
    public String all(){
        HashMap<String,Object> mp = new HashMap<String,Object>();
        mp.put("code",200);
        mp.put("msg","success");
        mp.put("data",ws.allinfos());
        return js.toJson(mp);
    }

}
