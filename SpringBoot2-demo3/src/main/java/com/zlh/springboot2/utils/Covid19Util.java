package com.zlh.springboot2.utils;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

public class Covid19Util {


    @Test
    public  void test(){
        RestTemplate restTemplate = new RestTemplate();
        Map<String,String> params = new HashMap<>();
        params.put("name","disease_h5");
        ResponseEntity<String> forEntity = restTemplate.getForEntity("https://view.inews.qq.com/g2/getOnsInfo?name={name}", String.class, params);
        String body = forEntity.getBody();
        System.out.println(body);
    }
}
