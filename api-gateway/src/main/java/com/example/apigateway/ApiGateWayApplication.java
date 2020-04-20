package com.example.apigateway;

import com.example.apigateway.filter.AuthFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import javax.annotation.Resource;

@EnableEurekaClient
@SpringBootApplication
public class ApiGateWayApplication {

    @Resource
    private AuthFilter authFilter;

    public static void main(String[] args) {
        SpringApplication.run(ApiGateWayApplication.class, args);
    }

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r.path("/csdn")
                        .filters(f -> f.filter(authFilter)
//                                .addRequestParameter("name", "tenmao")
                        )
                        .uri("https://blog.csdn.net")
                )
                .build();
    }
}
