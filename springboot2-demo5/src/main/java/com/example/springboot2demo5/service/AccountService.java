package com.example.springboot2demo5.service;

import com.example.springboot2demo5.bean.Account;
import com.example.springboot2demo5.mapper.AccountMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AccountService {

    @Resource
    AccountMapper accountMapper;

    public Account getAcctByName(String userName){
        return accountMapper.getAcct(userName);
    }
}
