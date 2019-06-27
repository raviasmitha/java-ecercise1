package com.stackroute.exercise1;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LoopTest {
    Loop printNumbers;
    @Before
    public void setUp(){
        printNumbers = new Loop();
        System.out.println("before");
    }
    @After
    public void tearDown(){
        printNumbers = null;
        System.out.println("after");
    }
    @Test
    public  void givenANumberShouldReturnSeriesOfthatNumber() {
        String result = printNumbers.looping(5);
        assertEquals("122333444455555", result);
    }
    @Test
    public  void givenANumberShouldReturnSeriesOfthatNumbe() {
        String result = printNumbers.looping(5);
        assertEquals("122333444455555", result);
    }
    @Test
    public  void givenANumberShouldReturnSeriesOfthatNumb() {
        String result = printNumbers.looping(5);
        assertEquals("122333444455555", result);
    }
}