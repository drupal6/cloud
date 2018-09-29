package com.cloud.zkconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ZkConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZkConsumerApplication.class, args);
    }
}
