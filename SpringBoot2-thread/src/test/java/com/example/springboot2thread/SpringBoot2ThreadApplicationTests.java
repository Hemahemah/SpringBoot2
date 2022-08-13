package com.example.springboot2thread;

import com.example.springboot2thread.generator.domain.User;
import com.example.springboot2thread.generator.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
@Slf4j
class SpringBoot2ThreadApplicationTests {

    @Resource
    private UserService userService;

    @Test
    void contextLoads() {
        for (int i = 0; i < 1; i++) {
            new Thread(()->{
                log.info("userService:{}",userService);
                log.info("thread:{} start",Thread.currentThread());

                User user = userService.getById(1);
                user.setUserAccount(user.getUserAccount()-1);
                if (userService.updateById(user)){
                    log.info("thread:{} end",Thread.currentThread());
                }else {
                    log.error("thread:{} error",Thread.currentThread());
                }

            }).start();
        }
    }

}
