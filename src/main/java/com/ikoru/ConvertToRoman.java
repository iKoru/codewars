package com.ikoru;

class ConvertToRoman{
  public static String convertToRoman(int n) {
    StringBuilder builder = new StringBuilder();
    // 4th digit
    int currentDigit = n / 1000;
    n %= 1000;
    if(currentDigit != 0){
      builder.append(new String(new char[currentDigit]).replace("\0", "M"));
    }
    // 3rd digit
    currentDigit = n / 100;
    n %= 100;
    handleDigit(builder, currentDigit, "C", "D", "M");
    // 2nd digit
    currentDigit = n / 10;
    n %= 10;
    handleDigit(builder, currentDigit, "X", "L", "C");
    // 1st digit
    currentDigit = n;
    handleDigit(builder, currentDigit, "I", "V", "X");
    return builder.toString();
  }

  private static void handleDigit(StringBuilder builder, int currentDigit, String baseLetter, String mediumLetter, String nextLetter){
    if(currentDigit == 0){
      return;
    }
    if(currentDigit > 8){
      builder.append(baseLetter + nextLetter);
    }else if(currentDigit > 5){
      builder.append(mediumLetter).append(new String(new char[currentDigit - 5]).replace("\0", baseLetter));
    }else if(currentDigit > 3){
      builder.append(new String(new char[5 - currentDigit]).replace("\0", baseLetter)).append(mediumLetter);
    }else{
      builder.append(new String(new char[currentDigit]).replace("\0", baseLetter));
    }
  }
}