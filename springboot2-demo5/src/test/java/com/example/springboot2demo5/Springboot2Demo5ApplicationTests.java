package com.example.springboot2demo5;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;

@Slf4j
@SpringBootTest
class Springboot2Demo5ApplicationTests {

    @Autowired
    DataSource dataSource;

    @Test
    void contextLoads() {
        log.info(String.valueOf(dataSource));
    }

}
