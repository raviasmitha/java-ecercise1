package com.stackroute.exercise1;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SumOfIntegersTest {
    SumOfIntegers sumOfDigits;
    @Before
    public void setUp()
    {
        sumOfDigits=new SumOfIntegers();
    }
    @After
    public void tearDown()
    {
        sumOfDigits=null;
    }
    @Test
    public void testGivenTwoNumberShouldReturnSumOfDigits() {
        String result = sumOfDigits.sumDigits("34 5");
        assertEquals(result, "39");
    }

    @Test(expected = NumberFormatException.class)
    public void testGivenThreeNumberShouldReturnSumOfDigits() {
        String result = sumOfDigits.sumDigits("12 a 9");
    }

    @Test
    public void testGivenANumberShouldReturnSumOfDigits() {
        String result = sumOfDigits.sumDigits("12");
        assertEquals(result, "12");
    }

    @Test(expected = NullPointerException.class)
    public void testGivenEmptyShouldReturnError() {
        String result = sumOfDigits.sumDigits(null);
    }
}