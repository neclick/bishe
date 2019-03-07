package com.fptrade.provider.fptradeprovideruser;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableEurekaClient
@SpringBootApplication
@MapperScan("com.fptrade.provider.fptradeprovideruser.dao")
public class FptradeProviderUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(FptradeProviderUserApplication.class, args);
    }

}
