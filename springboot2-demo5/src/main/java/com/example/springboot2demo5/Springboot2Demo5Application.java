package com.example.springboot2demo5;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("com.example.springboot2demo5.mapper")
public class Springboot2Demo5Application {

    public static void main(String[] args) {
        SpringApplication.run(Springboot2Demo5Application.class, args);
    }

}
