package com.example.springboot2thread.generator.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.springboot2thread.generator.domain.User;

/**
* @author lh
* @description 针对表【user】的数据库操作Service
* @createDate 2022-05-27 21:48:10
*/
public interface UserService extends IService<User> {

    Boolean updateAccount();
}
