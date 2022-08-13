package com.example.springboot2test.dao;

import com.example.springboot2test.bean.User;

import java.util.List;

public interface UserDao {

    List<User> findAllUsers();

    User selectUserByUserName(String username);

}
