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
    }
    @After
    public void tearDown(){
        printNumbers = null;
    }
    @Test
    public  void testGivenANumberShouldReturnSeriesOfthatNumber() {
        String result = printNumbers.looping(5);
        assertEquals("122333444455555", result);
    }
    @Test
    public  void testGivenANegativeNumberShouldReturnErrorMesage() {
        String result = printNumbers.looping(-1);
        assertEquals("should give positive numbers", result);
    }
    @Test
    public  void testGivenZeroShouldReturnEmpty() {
        String result = printNumbers.looping(0);
        assertEquals("", result);
    }
}