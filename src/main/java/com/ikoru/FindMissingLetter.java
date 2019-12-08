package com.ikoru;

class FindMissingLetter{
  public static char findMissingLetter(char[] array) {
    char current = ++array[0];
    for(int i = 1;i < array.length; i++){
      if(current != array[i]){
        return current;
      }
      current++;
    }
    return current;
  }
}