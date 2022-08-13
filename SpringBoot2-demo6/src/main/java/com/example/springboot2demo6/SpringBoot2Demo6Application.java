package com.example.springboot2demo6;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.example.springboot2demo6.mapper")
@SpringBootApplication
public class SpringBoot2Demo6Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot2Demo6Application.class, args);
    }

}
