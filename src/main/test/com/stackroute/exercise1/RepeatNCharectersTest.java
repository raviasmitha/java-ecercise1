package com.stackroute.exercise1;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatNCharectersTest {
    RepeatNCharecters stringRepeat;
    @Before
    public void setUp()
    {
        stringRepeat=new RepeatNCharecters();
    }
    @After
    public void tearDown()
    {
        stringRepeat=null;
    }
    @Test
    public void testGivenAStringShouldRepeatLastNumberOfGivenCharacters()
    {

        String result=stringRepeat.repeat("ashu",3);
        assertEquals("ashushushushu",result);
    }

    @Test
    public void testGivenAStringShouldRepeatLastNumberCharacters()
    {

        String result=stringRepeat.repeat("stackr oute",5);
        assertEquals("stackr oute oute oute oute oute oute",result);
    }
    @Test
    public void testGivenAStringShouldRepeatLastNumberCharactersOfCharectersGiven()
    {

        String result=stringRepeat.repeat("stackroute",4);
        assertEquals("stackrouteouteouteouteoute",result);
    }

    @Test
    public void testGivenAStringShouldRepeat()
    {

        String result=stringRepeat.repeat("stack",10);
        assertEquals("enter number lessthan string length",result);
    }

}
