package com.stackroute.exercise1;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StringReverseTest {

    StringReverse stringReverse;
    @Before
    public void setUp()
    {
        stringReverse=new StringReverse();
    }
    @After
    public void tearDown()
    {
        stringReverse=null;
    }

    @Test
    public void testGivenAStringShouldReturnReverseOfString()
    {
        String result=stringReverse.reverse("asmitha");
        assertEquals(result,"ahtimsa");
    }
    @Test
    public void testGivenNumbersShouldReturnReverse()
    {
        String result=stringReverse.reverse("123");
        assertEquals(result,"321");
    }

    @Test
    public void testGivenNullShouldReturnError()
    {
        String result=stringReverse.reverse("");
        assertEquals(result,"string should not be empty or null");
    }

    @Test
    public void testGivenNullShouldReturnErrorMessage()
    {
        String result=stringReverse.reverse(null);
        assertEquals(result,"string should not be empty or null");
    }
}