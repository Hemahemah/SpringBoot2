package com.example.springboot2test.controller;

import com.example.springboot2test.config.annotation.TokenToAdminUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

@Controller
public class TestController {

    private static final String FILE_UPLOAD_PATH = "D:\\IDEA\\IDEA\\SpringBoot2\\SpringBoot2-test\\upload\\";

    @ResponseBody
    @PostMapping("/upload")
    public String testUpload(@RequestParam MultipartFile file){
        if (file.isEmpty()){
            return "上传失败";
        }
        String fileName = file.getOriginalFilename();
        String suffixName = fileName.substring(fileName.lastIndexOf("."));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd_HHmmss");
        Random num = new Random();
        StringBuilder tempName = new StringBuilder();
        tempName.append(sdf.format(new Date())).append(num.nextInt(100)).append(suffixName);
        fileName = tempName.toString();

        try {
            byte[] bytes = file.getBytes();
            Path path = Paths.get(FILE_UPLOAD_PATH+fileName);
            Files.write(path,bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "上传成功!文件为:"+ fileName;
    }

    @ResponseBody
    @GetMapping("/tokenAdmin")
    public String testTokenAdmin(@TokenToAdminUser String token){
        return token;
    }
}
