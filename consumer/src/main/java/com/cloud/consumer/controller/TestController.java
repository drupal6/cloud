package com.cloud.consumer.controller;

import com.cloud.consumer.entity.ReqItem;
import com.cloud.consumer.entity.ResItem;
import com.cloud.consumer.remote.TestRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    TestRemote testRemote;

    @RequestMapping("/test")
    public ResItem addItem() {
        ReqItem reqItem = new ReqItem();
        reqItem.setId("31231");
        reqItem.setName("hello world!");
        return testRemote.addItem(reqItem, "test111");
    }
}
