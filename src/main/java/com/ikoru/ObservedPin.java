package com.ikoru;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class ObservedPin {
  private static final HashMap<String, String[]> available = new HashMap<String, String[]>(){

    private static final long serialVersionUID = 1L;
    {
      put("0", new String[]{"0", "8"});
      put("1", new String[]{"1", "2", "4"});
      put("2", new String[]{"2", "1", "3", "5"});
      put("3", new String[]{"3", "2", "6"});
      put("4", new String[]{"4", "1", "5", "7"});
      put("5", new String[]{"5", "2", "4", "6", "8"});
      put("6", new String[]{"6", "3", "5", "9"});
      put("7", new String[]{"7", "4", "8"});
      put("8", new String[]{"8", "5", "7", "9", "0"});
      put("9", new String[]{"9", "8", "6"});
    }
  };

  public static List<String> getPINs(String observed) {
    List<String[]> availables = Arrays.stream(observed.split("")).map(available::get).collect(Collectors.toList());
    List<String> result = new ArrayList<String>();
    iterateAvailables(availables, 0, result, "");
    return result.stream().distinct().collect(Collectors.toList());
  }

  private static void iterateAvailables(List<String[]> availables, int index, List<String> result, String currentString){
    if(availables.size() == index + 1){
      String[] candidates = availables.get(index);
      for(String candidate : candidates){
        result.add(currentString + candidate);
      }
    }else{
      String[] candidates = availables.get(index);
      for(String candidate : candidates){
        iterateAvailables(availables, index + 1, result, currentString + candidate);
      }
    }
  }
}