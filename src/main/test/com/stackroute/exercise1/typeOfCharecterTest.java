package com.stackroute.exercise1;
  import org.junit.*;
  import static org.junit.Assert.*;

public class typeOfCharecterTest {
  typeOfCharecter checkCase;
  @Before
  public void setUp(){
    checkCase=new typeOfCharecter();
    System.out.println("before");
  }
  @After
  public void tearDown(){
    checkCase=null;
    System.out.println("after");
  }
  @Test
  public  void givenACharacterShouldReturnCapitalLetter()
  {
    String Result=checkCase.charType('A');
    assertEquals("Capital Letter",Result);

  }
  @Test
  public  void givenACharacterShouldReturnLowerCaseOrNot()
  {
    String Result=checkCase.charType('a');
    assertEquals("Small Letter",Result);

  }
  @Test
  public  void givenACharacterShouldReturnDigitOrNot()
  {
    String Result=checkCase.charType('1');
    assertEquals("Digit",Result);

  }
  @Test
  public  void givenACharacterShouldReturnSpecialSymbolOrNot()
  {
    String Result=checkCase.charType('@');
    assertEquals("Special Symbol",Result);

  }


}
