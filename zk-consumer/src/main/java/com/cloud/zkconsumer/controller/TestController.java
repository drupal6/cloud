package com.cloud.zkconsumer.controller;

import com.cloud.zkconsumer.remote.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    HelloRemote helloRemote;

    public String index(@RequestParam("name") String name) {
        return helloRemote.index(name);
    }
}
