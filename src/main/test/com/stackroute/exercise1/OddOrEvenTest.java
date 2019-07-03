package com.stackroute.exercise1;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class OddOrEvenTest {
    OddOrEven oddEven;
    @Before
    public void setUp(){
        oddEven=new OddOrEven();
    }
    @After
    public void tearDown(){
        oddEven=null;
    }
    @Test
    public  void testGivenANumberBetween20and30ShouldReturntJerryIfEven()
    {
        String result=oddEven.checkOddEven(22);
        assertEquals(result,"Jerry");
    }
    @Test
    public  void testGivenANumberBetween20and30ShouldReturntTomIfOdd()
    {
        String result=oddEven.checkOddEven(21);
        assertEquals(result,"Tom");
    }
    @Test
    public  void testGivenANumberNotBetween20and30ShouldReturnNotTomNotJerry()
    {
        String result=oddEven.checkOddEven(20);
        assertEquals(result,"NotTomNotJerry");
    }

    @Test
    public  void testGivenANumberNotBetween20and30()
    {
        String result=oddEven.checkOddEven(30);
        assertEquals(result,"NotTomNotJerry");
    }

    @Test
    public  void testGivenANumberBetween20and30IfOddShouldReturntTom()
    {
        String result=oddEven.checkOddEven(29);
        assertEquals(result,"Tom");
    }
}
