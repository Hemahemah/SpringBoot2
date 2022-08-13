package com.example.springboot2thread.generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.springboot2thread.generator.domain.User;
import com.example.springboot2thread.generator.mapper.UserMapper;
import com.example.springboot2thread.generator.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
* @author lh
* @description 针对表【user】的数据库操作Service实现
* @createDate 2022-05-27 21:48:10
*/
@Service
@Slf4j
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService {

    @Override
    public Boolean updateAccount() {
        log.info("service:{}", this);
        log.info("thread:{} start", Thread.currentThread());
        User user = getById(1);
        user.setUserAccount(user.getUserAccount() - 1);
        List<User> users = new ArrayList<>();
        users.add(user);
        boolean b = updateBatchById(users);
        if (b){
            log.info("thread:{},success", Thread.currentThread());
        }else {
            log.error("thread:{},error", Thread.currentThread());
        }
        return b;
    }
}



