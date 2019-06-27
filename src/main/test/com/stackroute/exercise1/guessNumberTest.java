package com.stackroute.exercise1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class guessNumberTest {
  guessNumber guessNumber;
  @Before
  public void setUp()
  {
    System.out.println("Before");
    guessNumber=new guessNumber();
  }

  @Test
  public void givenTwoNumbersShouldReturnGreaterthanOriginalNumber(){
    String result=guessNumber.compare(23,3);
    assertEquals("number guessed is more than original number",result);
  }
  @Test
  public void givenTwoNumbersShouldReturnLessthanOriginalNumber(){
    String result=guessNumber.compare(3,23);
    assertEquals("number guessed is less than original number",result);
  }
  @Test
  public void givenTwoNumbersShouldReturnEqualsToOriginalNumber(){
    String result=guessNumber.compare(3,3);
    assertEquals("number guessed is matches original number",result);
  }

}
