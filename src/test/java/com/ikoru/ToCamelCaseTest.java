package com.ikoru;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

public class ToCamelCaseTest {

  @Test
  public void toCamelCaseTest() {
    assertEquals("", ToCamelCase.toCamelCase(""), "디폴트 처리");
    assertNull(ToCamelCase.toCamelCase(null), "디폴트 처리 2");
    assertEquals("__", ToCamelCase.toCamelCase("__"), "디폴트 처리 3");
  }

  @Test
  public void testSomeUnderscoreLowerStart() {
    String input = "the_Stealth_Warrior";
    System.out.println("input: " + input);
    assertEquals("theStealthWarrior", ToCamelCase.toCamelCase(input));
  }

  @Test
  public void testSomeDashLowerStart() {
    String input = "the-Stealth-Warrior";
    System.out.println("input: " + input);
    assertEquals("theStealthWarrior", ToCamelCase.toCamelCase(input));
  }
}