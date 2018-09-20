package com.cloud.consumer.hystrix;

import com.cloud.consumer.remote.HelloRemote;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class HelloHystrix implements HelloRemote {
    @Override
    public String hello(@RequestParam("name") String name) {
        return "hello " + name + " this message send faild";
    }
}
