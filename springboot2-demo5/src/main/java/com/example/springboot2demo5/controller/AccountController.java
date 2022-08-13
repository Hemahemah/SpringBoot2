package com.example.springboot2demo5.controller;

import com.example.springboot2demo5.bean.Account;
import com.example.springboot2demo5.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin
@RestController
public class AccountController {

    @Autowired
    AccountService accountService;

    @GetMapping("/acct/{name}")
    public Account getByName(@PathVariable String name){
        return accountService.getAcctByName(name);
    }

}
