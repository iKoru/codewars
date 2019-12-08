package com.ikoru;

import java.math.BigInteger;

public class SumFct {
  public static BigInteger perimeter(BigInteger n) {
    n = n.add(BigInteger.valueOf(2));
    BigInteger result = BigInteger.ONE.add(BigInteger.ONE);
    BigInteger number = BigInteger.ONE.add(BigInteger.ONE);
    BigInteger previous = BigInteger.ONE;
    BigInteger temp = null;
    while(number.compareTo(n) < 0){
      temp = result;
      result = result.add(previous);
      previous = temp;
      number = number.add(BigInteger.ONE);
    }
    return result.subtract(BigInteger.ONE).multiply(BigInteger.valueOf(4L));
  }

}