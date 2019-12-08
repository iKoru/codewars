package com.ikoru;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class FindUnique {
  public static double findUnique(double[] arr) {
    Map<Double, Long> summary = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(number -> number, Collectors.counting()));
    for(Double key : summary.keySet()){
      if(summary.get(key) == 1){
        return key;
      }
    }
    return -1;
  }

}