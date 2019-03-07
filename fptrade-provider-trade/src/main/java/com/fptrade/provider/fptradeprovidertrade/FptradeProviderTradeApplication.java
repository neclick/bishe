package com.fptrade.provider.fptradeprovidertrade;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.fptrade.provider.fptradeprovidertrade.dao")
public class FptradeProviderTradeApplication {

    public static void main(String[] args) {
        SpringApplication.run(FptradeProviderTradeApplication.class, args);
    }

}
