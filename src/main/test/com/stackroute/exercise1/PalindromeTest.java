package com.stackroute.exercise1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {
    Palindrome palindrome;
    @Before
    public void setUp()
    {
        palindrome=new Palindrome();
    }
    @After
    public void tearDown()
    {
        palindrome=null;
    }
    @Test
    public void givenANumberShouldCheckIfItIsAPalindrome()
    {
      String result=palindrome.isPalindrome(1221);
      assertEquals(result,"Palindrome");
    }
    @Test
    public void givenPalindromeShouldReturnTrueIfSumOfEvenIsGreaterThan25ornot()
    {
      String result=palindrome.sum(121);
      assertEquals(result,"false");
    }
    @Test
    public void givenANumberShouldReturnPalindrome()
    {
      String result=palindrome.isPalindrome(234432);
      assertEquals(result,"Palindrome");
    }

  }

