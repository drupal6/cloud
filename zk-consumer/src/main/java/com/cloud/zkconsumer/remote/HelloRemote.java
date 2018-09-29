package com.cloud.zkconsumer.remote;

import com.cloud.zkconsumer.hystrix.HelloHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "zk-producer", fallback = HelloHystrix.class)
@Component
public interface HelloRemote {

    @RequestMapping("/hello/index")
    public String index(@RequestParam("name") String name);
}
