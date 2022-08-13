package com.example.springboot2test.bean;

import lombok.Data;

@Data
public class User {

    private Integer adminUserId;
    private String loginUserName;
    private String loginPassword;
    private String nickName;
    private Integer locked;

}
