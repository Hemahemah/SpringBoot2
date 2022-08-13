package com.example.springboot2test;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.example.springboot2test.dao")
@SpringBootApplication
public class SpringBoot2TestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot2TestApplication.class, args);
    }

}
