package boot.controller;

import boot.bean.Person;
import boot.bean.Pet;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HelloController {

    @Autowired
    Pet pet;

    @Autowired
    Person person;

    @RequestMapping("/hello")
    public Pet hello(){
        log.info("请求...");
        return pet;
    }

    @RequestMapping("/person")
    public Person person(){
        return person;
    }
}
