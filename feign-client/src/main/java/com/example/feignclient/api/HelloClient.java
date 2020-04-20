package com.example.feignclient.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "hello-server")
public interface HelloClient {

    @RequestMapping(value = "/hello")
    String hello();

}
