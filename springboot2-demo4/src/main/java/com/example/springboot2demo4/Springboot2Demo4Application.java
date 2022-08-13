package com.example.springboot2demo4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class Springboot2Demo4Application {

    public static void main(String[] args) {
        SpringApplication.run(Springboot2Demo4Application.class, args);
    }

}
