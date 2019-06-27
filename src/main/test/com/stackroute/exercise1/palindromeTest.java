package com.stackroute.exercise1;

import org.junit.Test;

import static org.junit.Assert.*;

public class palindromeTest {
    @Test
    public void givenANumberShouldCheckIfItIsAPalindrome()
    {
      palindrome palindrome=new palindrome();
      String result=palindrome.isPalindrome(1221);
      assertEquals(result,"Palindrome");
    }
    @Test
    public void givenPalindromeShouldReturnTrueIfSumOfEvenIsGreaterThan25ornot()
    {
      palindrome palindrome=new palindrome();
      String result=palindrome.sum(121);
      assertEquals(result,"false");
    }
    @Test
    public void givenANumberShouldReturnPalindrome()
    {
      palindrome palindrome=new palindrome();
      String result=palindrome.isPalindrome(234432);
      assertEquals(result,"Palindrome");
    }

  }

