package com.example.springboot2demo7.controller;

import com.example.springboot2demo7.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${person.name}")
    private String name;

    @Autowired
    private Person person;

    @GetMapping("/hello")
    public String hello(){
        return "hello:" + name;
    }

    @GetMapping("/person")
    public Person person(){
        return person;
    }
}
