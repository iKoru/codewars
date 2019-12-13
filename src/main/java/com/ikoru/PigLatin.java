package com.ikoru;

import java.util.Arrays;

public class PigLatin {
  public static String pigIt(String str) {
    return String.join(" ", Arrays.stream(str.split(" ")).map(string -> string.matches("[\\w]+") ? string.substring(1) + string.substring(0, 1) + "ay" : string).toArray(String[]::new));
  }

}