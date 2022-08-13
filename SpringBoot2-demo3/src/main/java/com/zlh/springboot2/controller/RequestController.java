package com.zlh.springboot2.controller;

import com.zlh.springboot2.bean.Person;
import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@Controller
public class RequestController {

    @GetMapping("/goto")
    public String goToPage(HttpServletRequest request){
        request.setAttribute("msg","成功");
        request.setAttribute("code",200);
        return "forward:/success";
    }

    @ResponseBody
    @GetMapping("/success")
    public Map<String, Object> success(@RequestAttribute(value = "msg",required = false) String msg,
                                       @RequestAttribute(value = "code",required = false) Integer code){
        Map<String,Object> map = new HashMap<>();
        map.put("msg",msg);
        map.put("code",code);
        return map;
    }


    @GetMapping("/params")
    public String testParam(Map<String,Object> map,
                            Model model,
                            HttpServletRequest request,
                            HttpServletResponse response){
        map.put("hello","word");
        model.addAttribute("model","hello_model");
        request.setAttribute("message","request");
        response.addCookie(new Cookie("cookie","cookie"));
        return "forward:/success";
    }


    @ResponseBody
    @PostMapping("/savePerson")
    public Person saveUser(Person person){
        return person;
    }

}
