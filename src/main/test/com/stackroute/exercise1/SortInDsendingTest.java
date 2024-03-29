package com.stackroute.exercise1;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortInDsendingTest {
    SortInDsending sortInDescending;
    @Before
    public void setUp()
    {
        sortInDescending=new SortInDsending();
    }
    @After
    public void tearDown()
    {
        sortInDescending=null;
    }
    @Test
    public void testGivenANumberShouldReturnDescendingOrder()
    {
        String result=sortInDescending.sort(1234);
        assertEquals("4321",result);
    }
    @Test
    public void testGivenANumberShouldReturnDescendingOrderOfThatNumber()
    {
        String result=sortInDescending.sort(89765);
        assertEquals("98765",result);
    }
    @Test
    public void testGivenANumberShouldReturnDescending()
    {
        String result=sortInDescending.sort(65748);
        assertEquals("87654",result);
    }
}