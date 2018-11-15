package com.example.demo-azure-spring-cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@EnableDiscoveryClient
@SpringBootApplication
public class ServiceAzureApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceAzureApplication.class, args);
    }
}
