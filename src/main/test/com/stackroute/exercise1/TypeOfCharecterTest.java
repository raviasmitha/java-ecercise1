package com.stackroute.exercise1;
  import org.junit.*;
  import static org.junit.Assert.*;

public class TypeOfCharecterTest {
  TypeOfCharecter checkCase;
  @Before
  public void setUp(){
    checkCase=new TypeOfCharecter();
  }
  @After
  public void tearDown(){
    checkCase=null;
  }
  @Test
  public  void testGivenACharacterShouldReturnCapitalLetter()
  {
    String Result=checkCase.charType('A');
    assertEquals("Capital Letter",Result);

  }
  @Test
  public  void testGivenACharacterShouldReturnLowerCaseOrNot()
  {
    String Result=checkCase.charType('a');
    assertEquals("Small Letter",Result);

  }
  @Test
  public  void testGivenACharacterShouldReturnDigitOrNot()
  {
    String Result=checkCase.charType('1');
    assertEquals("Digit",Result);

  }
  @Test
  public  void testGivenACharacterShouldReturnSpecialSymbolOrNot()
  {
    String Result=checkCase.charType('@');
    assertEquals("Special Symbol",Result);

  }

}
