package com.ikoru;

import java.util.ArrayList;

public class DirReduction {
  public static String[] dirReduc(String[] arr) {
    ArrayList<String> list = new ArrayList<String>();
    if(arr.length < 2){
      return arr;
    }
    String previous = arr[0];
    int index = 1, listIndex = 0;
    list.add(previous);
    while(index < arr.length){
      if(listIndex >= 0 && isResolved(arr[index], list.get(listIndex))){
        list.remove(listIndex--);
        index++;
      }else{
        list.add(arr[index++]);
        listIndex++;
      }
    }
    return list.toArray(new String[list.size()]);
  }

  private static boolean isResolved(String a, String b){
    return ("NORTH".equals(a) && "SOUTH".equals(b)) || ("NORTH".equals(b) && "SOUTH".equals(a)) || ("EAST".equals(a) && "WEST".equals(b)) || ("EAST".equals(b) && "WEST".equals(a));
  }
}