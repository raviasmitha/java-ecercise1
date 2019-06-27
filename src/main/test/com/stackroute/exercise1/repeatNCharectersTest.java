package com.stackroute.exercise1;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class repeatNCharectersTest {
    repeatNCharecters stringRepeat;
    @Before
    public void setUp()
    {
        System.out.println("Before");
        stringRepeat=new repeatNCharecters();
    }
    @After
    public void tearDown()
    {
        System.out.println("After");
        stringRepeat=null;
    }
    @Test
    public void givenAStringShouldRepeatLastNumberOfGivenCharacters()
    {

        String result=stringRepeat.repeat("ashu",3);
        assertEquals("ashushushushu",result);
    }

    @Test
    public void givenAStringShouldRepeatLastNumberCharacters()
    {

        String result=stringRepeat.repeat("stackroute",5);
        assertEquals("stackrouterouterouterouterouteroute",result);
    }
    @Test
    public void givenAStringShouldRepeatLastNumberCharactersOfCharectersGiven()
    {

        String result=stringRepeat.repeat("stackroute",4);
        assertEquals("stackrouteouteouteouteoute",result);
    }

}
