package com.example.springboot2test.controller;

import com.example.springboot2test.bean.User;
import com.example.springboot2test.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class MyBatisController {

    @Resource
    private UserDao userDao;

    @GetMapping("/user")
    public List<User> selectUser(){
        return userDao.findAllUsers();
    }

    @GetMapping("/user/{username}")
    public User selectUserByName(@PathVariable String username){
        return userDao.selectUserByUserName("admin");
    }

}
