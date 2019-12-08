package com.ikoru;

public class IsIsogram {
  public static boolean isIsogram(String s) {
    if(s == null || s.length() < 1){
      return true;
    }
    return s.toLowerCase().chars().distinct().count() == s.length();
  }
}