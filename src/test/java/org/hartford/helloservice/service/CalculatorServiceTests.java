package org.hartford.helloservice.service;

import org.hartford.helloservice.HelloServiceApplication;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(classes = CalculatorService.class)
public class CalculatorServiceTests {
    @Autowired
    private CalculatorService cal;


//    @BeforeAll
//    static void beforeAll() {
//        System.out.println("@BeforeAll");
//        cal = new CalculatorService();
//    }
//    @AfterAll
//    static void afterAll() {
//        System.out.println("@AfterAll");
//        cal = null;
//    }
//    @BeforeEach
//    public void setup() {
//        System.out.println("Before each is called!!!");
//    }
//
//    @AfterEach
//    public void teardown() {
//        System.out.println("After each is called!!!");
//    }

    @Test
    void testAdd() {
        int expected = 5;
        int actual = cal.add(2, 3);
        assertEquals(expected, actual);
    }

    @Test
    void testSub() {
        int expected = 0;
        int actual = cal.sub(3, 3);
        assertEquals(expected, actual);
    }
}
