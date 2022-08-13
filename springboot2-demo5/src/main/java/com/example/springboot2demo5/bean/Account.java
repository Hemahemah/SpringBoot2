package com.example.springboot2demo5.bean;

import lombok.Data;

@Data
public class Account {

    private Integer adminUserId;
    private String loginUserName;
    private String loginPassword;
    private String nickName;
    private Integer locked;
}
