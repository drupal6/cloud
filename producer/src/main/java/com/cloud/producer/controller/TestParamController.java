package com.cloud.producer.controller;

import com.cloud.producer.plyload.ReqItem;
import com.cloud.producer.plyload.ResItem;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestParamController {

    @RequestMapping("/req/addItem")
    public ResItem addItem(@RequestBody ReqItem qi, @RequestParam("rparam") String rparam) {
        ResItem ri = new ResItem();
        ri.setRet(0);
        ri.setMessage(qi.getName() + "<><>" + rparam);
        return ri;
    }
}
