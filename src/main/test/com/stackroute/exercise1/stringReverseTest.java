package com.stackroute.exercise1;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class stringReverseTest {

    stringReverse stringReverse;
    @Before
    public void setUp()
    {
        stringReverse=new stringReverse();
        System.out.println("Before");
    }
    @After
    public void tearDown()
    {
        stringReverse=null;
        System.out.println("After ");
    }
    @Test
    public void givenAStringShouldReturnReverseOfTheString()
    {
        String result=stringReverse.reverse("ashu");
        assertEquals(result,"uhsa");
    }
    @Test
    public void givenAStringShouldReturnReverseOfString()
    {
        String result=stringReverse.reverse("asmitha");
        assertEquals(result,"ahtimsa");
    }
    @Test
    public void givenAStringShouldReturnReverse()
    {
        String result=stringReverse.reverse("asmi");
        assertEquals(result,"imsa");
    }
}