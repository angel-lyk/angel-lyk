package com.oz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class GoodTwoApplication {
    public static void main(String[] args) {
        SpringApplication.run(GoodTwoApplication.class, args);
    }
}
