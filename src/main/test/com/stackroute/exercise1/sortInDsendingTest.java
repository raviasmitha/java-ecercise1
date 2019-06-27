package com.stackroute.exercise1;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class sortInDsendingTest {
    sortInDsending sortInDescending;
    @Before
    public void setUp()
    {
        System.out.println("Before");
        sortInDescending=new sortInDsending();
    }
    @After
    public void tearDown()
    {
        System.out.println("After");
        sortInDescending=null;
    }
    @Test
    public void givenANumberShouldReturnDescendingOrder()
    {
        String result=sortInDescending.sort(1234);
        assertEquals("4321",result);
    }
    @Test
    public void givenANumberShouldReturnDescendingOrderOfThatNumber()
    {
        String result=sortInDescending.sort(89765);
        assertEquals("98765",result);
    }
    @Test
    public void givenANumberShouldReturnDescending()
    {
        String result=sortInDescending.sort(65748);
        assertEquals("87654",result);
    }
}