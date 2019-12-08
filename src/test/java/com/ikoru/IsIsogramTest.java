package com.ikoru;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class IsIsogramTest {

  @Test
  public void isIsogramTest() {
    assertEquals(true, IsIsogram.isIsogram(""), "디폴트 처리");
    assertEquals(true, IsIsogram.isIsogram(null), "디폴트 처리 2");
    assertEquals(false, IsIsogram.isIsogram("__"), "디폴트 처리 3");
  }

  @Test
    public void FixedTests() {
        assertEquals(true, IsIsogram.isIsogram("Dermatoglyphics"));
        assertEquals(true, IsIsogram.isIsogram("isogram"));
        assertEquals(false, IsIsogram.isIsogram("moose"));
        assertEquals(false, IsIsogram.isIsogram("isIsogram"));
        assertEquals(false, IsIsogram.isIsogram("aba"));
        assertEquals(false, IsIsogram.isIsogram("moOse"));
        assertEquals(true, IsIsogram.isIsogram("thumbscrewjapingly"));
        assertEquals(true, IsIsogram.isIsogram(""));
    }
}