package com.ikoru;

public class ToCamelCase{
  public static String toCamelCase(String s) {
    if(s == null || s.length() < 1){
      return s;
    }
    StringBuilder builder = new StringBuilder();
    char[] array = s.toCharArray();
    for(int i = 0;i<array.length;i++){
      if((array[i] == '-' || array[i] == '_') && (i < array.length - 1)){
        i++;
        if(array[i] >= 'a' && array[i] <= 'z'){
          builder.append((char) (array[i] - 32));
        }else if(array[i] >= 'A' && array[i] <= 'Z'){
          builder.append(array[i]);
        }else{
          builder.append(array[--i]);
        }
      }else{
        builder.append(array[i]);
      }
    }
    return builder.toString();
  }
}