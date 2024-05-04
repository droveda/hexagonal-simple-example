package com.droveda.archdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ArchdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ArchdemoApplication.class, args);
    }

}
