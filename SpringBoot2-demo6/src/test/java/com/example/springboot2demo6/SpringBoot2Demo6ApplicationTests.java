package com.example.springboot2demo6;

import com.example.springboot2demo6.domain.TEmployee;
import com.example.springboot2demo6.mapper.TEmployeeMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
@Slf4j
class SpringBoot2Demo6ApplicationTests {

    @Resource
    TEmployeeMapper employeeMapper;

    @Test
    void contextLoads() {
    }

    @Test
    void testMapper(){
        TEmployee employee = employeeMapper.selectById(13);
        log.info("用户信息:{}",employee);
    }

}
