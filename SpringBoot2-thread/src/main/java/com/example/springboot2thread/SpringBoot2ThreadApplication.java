package com.example.springboot2thread;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.springboot2thread.generator.mapper")
public class SpringBoot2ThreadApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot2ThreadApplication.class, args);
    }

}
