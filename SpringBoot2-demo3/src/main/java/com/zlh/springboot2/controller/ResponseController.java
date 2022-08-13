package com.zlh.springboot2.controller;
import java.util.Date;
import com.zlh.springboot2.bean.Pet;

import com.zlh.springboot2.bean.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ResponseController {


    @ResponseBody
    @GetMapping("/test/person")
    public Person getPerson(){
        Person person = new Person();
        person.setUserName("user");
        person.setAge(10);
        person.setBirth(new Date());
        return person;
    }


}
