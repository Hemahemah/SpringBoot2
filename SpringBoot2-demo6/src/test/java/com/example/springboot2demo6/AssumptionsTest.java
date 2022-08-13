package com.example.springboot2demo6;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AssumptionsTest {

    @Test
    @DisplayName("前置条件")
    void testAssumptions(){
        Assumptions.assumeTrue(false,"不是tue");
        System.out.println("1111");

    }
}
