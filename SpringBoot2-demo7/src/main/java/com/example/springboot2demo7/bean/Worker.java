package com.example.springboot2demo7.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;


@Data
@Profile("test")
@Component
@ConfigurationProperties("person")
public class Worker implements Person{

    private String name;
    private Integer age;

}
