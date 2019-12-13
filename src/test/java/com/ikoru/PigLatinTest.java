package com.ikoru;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PigLatinTest {

  @Test
  public void pigLatinTest() {
    assertEquals("igPay atinlay siay oolcay", PigLatin.pigIt("Pig latin is cool"));
    assertEquals("hisTay siay ymay tringsay", PigLatin.pigIt("This is my string"));
  }

  @Test
    public void FixedTests() {
      assertEquals("igPay atinlay siay oolcay", PigLatin.pigIt("Pig latin is cool"));
      assertEquals("elloHay orldway !", PigLatin.pigIt("Hello world !"));
    }
}