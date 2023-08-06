package com.example.springbootpoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpringbootPocApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootPocApplication.class, args);
    }

}
