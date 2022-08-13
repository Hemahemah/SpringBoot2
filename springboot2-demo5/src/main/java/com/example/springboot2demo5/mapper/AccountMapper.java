package com.example.springboot2demo5.mapper;


import com.example.springboot2demo5.bean.Account;
import org.apache.ibatis.annotations.Mapper;

public interface AccountMapper {

    Account getAcct(String username);
}
