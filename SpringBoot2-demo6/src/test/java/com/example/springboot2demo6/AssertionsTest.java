package com.example.springboot2demo6;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class AssertionsTest {

    /**
     * 前面断言失败,后面的代码都不会运行
     */
    @DisplayName("测试简单断言")
    @Test
    void testAssertions(){
        int cal = cal(3, 4);
        assertEquals(8,cal,"业务逻辑计算失败");
        Object obj1 = new Object();
        Object obj2 = new Object();
        assertEquals(obj1,obj2);
    }

    @Test
    @DisplayName("组合断言")
    void all(){
        assertAll("test",
                ()->assertTrue(true&&true),
                ()->assertEquals(1,2));
    }

    @Test
    @DisplayName("array assertion")
    void array(){
        assertArrayEquals(new int[]{1,1,3},new int[]{1,2,3});
    }

    @Test
    @DisplayName("异常断言")
    void testException(){
        //断定业务逻辑一定出现异常
        assertThrows(ArithmeticException.class,
                ()->{int i = 10/1;},"业务竟然正常运行"
        );
    }

    @Test
    @DisplayName("快速失败")
    void testFail() {
        if (2 == 2) {
            fail("快速失败");
        }
    }

    int cal(int i,int j){
        return i+j;
    }
}
