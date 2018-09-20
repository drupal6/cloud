package com.cloud.consumer.remote;

import com.cloud.consumer.hystrix.HelloHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="producer", fallback = HelloHystrix.class)
@Service
public interface HelloRemote {

    @RequestMapping(value="/hello/hello")
    public String hello(@RequestParam("name") String name);
}
