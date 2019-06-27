package com.stackroute.exercise1;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class oddOrEvenTest {
    oddOrEven oddEven;
    @Before
    public void setUp(){
        oddEven=new oddOrEven();
        System.out.println("before");
    }
    @After
    public void tearDown(){
        oddEven=null;
        System.out.println("after");
    }
    @Test
    public  void givenANumberBetween20and30ShouldReturntJerryIfEven()
    {
        String result=oddEven.checkOddEven(28);
        assertEquals(result,"Jerry");
    }
    @Test
    public  void givenANumberBetween20and30ShouldReturntTomIfOdd()
    {
        String result=oddEven.checkOddEven(27);
        assertEquals(result,"Tom");
    }
    @Test
    public  void givenANumberNotBetween20and30ShouldReturnNotTomNotJerry()
    {
        String result=oddEven.checkOddEven(8);
        assertEquals(result,"NotTomNotJerry");
    }

}
