package com.example.springboot2thread.generator.controller;

import com.example.springboot2thread.generator.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/test")
    public Boolean test(){
        return userService.updateAccount();
    }

    @RequestMapping("/get")
    public String test1(){
        return this.toString();
    }


}
