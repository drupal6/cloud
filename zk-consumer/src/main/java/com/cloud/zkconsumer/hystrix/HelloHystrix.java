package com.cloud.zkconsumer.hystrix;

import com.cloud.zkconsumer.remote.HelloRemote;

public class HelloHystrix implements HelloRemote {
    @Override
    public String index(String name) {
        return "Hello " + name + " fail!";
    }
}
