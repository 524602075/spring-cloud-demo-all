package com.example.helloserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class HelloServer2Application {

    public static void main(String[] args) {
        SpringApplication.run(HelloServer2Application.class, args);
    }

}
