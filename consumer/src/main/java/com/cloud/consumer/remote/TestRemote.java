package com.cloud.consumer.remote;


import com.cloud.consumer.entity.ReqItem;
import com.cloud.consumer.entity.ResItem;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="producer")
@Service
public interface TestRemote {

    @RequestMapping(value = "/producer/test/req/addItem")
    ResItem addItem(@RequestBody ReqItem reqItem, @RequestParam("rparam") String rparam);
}
