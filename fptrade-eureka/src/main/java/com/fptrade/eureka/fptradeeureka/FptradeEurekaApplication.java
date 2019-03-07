package com.fptrade.eureka.fptradeeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class FptradeEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(FptradeEurekaApplication.class, args);
    }

}
