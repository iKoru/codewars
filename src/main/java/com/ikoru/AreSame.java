package com.ikoru;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AreSame{
  public static boolean comp(int[] a, int[] b) {
    if(a == null || b == null || a.length != b.length){
      return false;
    }
    List<Integer> bList = Arrays.stream(b).boxed().collect(Collectors.toList());
    return IntStream.of(a).map(number -> number * number).allMatch(number -> bList.remove((Integer) number));
  }
}