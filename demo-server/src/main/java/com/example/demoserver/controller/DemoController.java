package com.example.demoserver.controller;

import com.example.feignclient.api.HelloClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class DemoController {

    @Value("${leader}")
    private String leader;

    @Autowired
    private HelloClient helloClient;




    @RequestMapping("demo")
    public String demo(){
        return helloClient.hello();
    }

    @RequestMapping("showValue")
    public String showValue(){
        return leader;
    }
}
