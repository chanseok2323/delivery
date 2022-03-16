package com.chanseok.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {

    @Bean
    public RouteLocator gatewayRoute(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r.path("/orders/**")
                        .uri("lb://order-service"))
                .route(r -> r.path("/users/**")
                        .uri("lb://user-service"))
                .build();
    }
}
