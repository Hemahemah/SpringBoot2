package com.example.springboot2demo4.controller;

import com.example.springboot2demo4.expection.UserToManyException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;

@Slf4j
@RestController
public class TestController {

    @GetMapping("/hello")
    public String hello(HttpSession session){
        session.setAttribute("user","admin");
        return "hello";
    }

    @GetMapping("/test")
    public String test(){
        return "test";
    }

    @GetMapping("/testError")
    public String testError(){
        int i = 10/0;
        return "error";
    }

    @GetMapping("/testUser")
    public String testUser(){
        throw new UserToManyException();
    }


    @PostMapping("/upload")
    public String formLayouts(String email,
                              String username,
                              MultipartFile headerImg,
                              MultipartFile[] photos) throws IOException {
        log.info("上传信息:email={},username={},headerImg={},photos={}",
                email,username,headerImg.getSize(),photos.length);
        if (!headerImg.isEmpty()){
            //保存
            headerImg.transferTo(new File("classpath: static"));
        }
        return "success";
    }
}
