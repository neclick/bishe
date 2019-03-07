package com.fptrader.provider.fptraderproviderproduct;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
@MapperScan("com.fptrader.provider.fptraderproviderproduct.dao")
public class FptraderProviderProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(FptraderProviderProductApplication.class, args);
    }

}
