package com.example.springboot2demo6;

import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.concurrent.TimeUnit;

@SpringBootTest
@DisplayName("测试junit功能测试类")
public class Junit5Test {



    @DisplayName("测试displayName")
    @Test
    void testDisplayName(){
        System.out.println(1);

    }

    @RepeatedTest(5)
    void test3(){
        System.out.println(5);
    }

    /**
     * 规定时间,超出时间抛出异常
     * @throws InterruptedException
     */
    @Test
    @Timeout(value = 500,unit = TimeUnit.MILLISECONDS)
    void testTimeOut() throws InterruptedException {
        Thread.sleep(800);
    }

    @Disabled
    @Test
    void test2(){
        System.out.println(2);
    }

    @BeforeEach
    void testBeforeEach(){
        System.out.println("测试开始.....");
    }

    @AfterEach
    void testAfterEach(){
        System.out.println("测试结束....");
    }

    @BeforeAll
    static void testBeforeAll(){
        System.out.println("所有测试开始....");
    }

    @AfterAll
    static void testAfterAll(){
        System.out.println("所有测试结束....");
    }
}
