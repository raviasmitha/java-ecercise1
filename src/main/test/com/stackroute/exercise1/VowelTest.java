package com.stackroute.exercise1;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VowelTest {
    Vowel vowelConsonant;
    @Before
    public void SetUp()
    {
        vowelConsonant=new Vowel();
    }

    @After
    public void tearDown()
    {
        vowelConsonant=null;
    }

    @Test
    public void testGivenAStringShouldReturnVowelsAndConsonants()
    {
        String result=vowelConsonant.vowelConsonantCheck("navya");
        assertEquals(result,"ConsonantVowelConsonantConsonantVowel");
    }

    @Test
    public void tesGivenAStringShouldReturnVowels()
    {
        String result=vowelConsonant.vowelConsonantCheck("aei");
        assertEquals(result,"VowelVowelVowel");
    }
    @Test
    public void testGivenAStringShouldReturnConsonants()
    {
        String result=vowelConsonant.vowelConsonantCheck("bcd");
        assertEquals(result,"ConsonantConsonantConsonant");
    }

    @Test
    public void testGivenNumberShouldReturnError()
    {
        String result=vowelConsonant.vowelConsonantCheck("123");
        assertEquals(result,"Please enter a valid letter");
    }

}