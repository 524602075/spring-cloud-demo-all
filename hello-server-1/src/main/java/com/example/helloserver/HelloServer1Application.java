package com.example.helloserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class HelloServer1Application {

    public static void main(String[] args) {
        SpringApplication.run(HelloServer1Application.class, args);
    }

}
