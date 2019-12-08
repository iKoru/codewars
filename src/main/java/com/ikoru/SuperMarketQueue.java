package com.ikoru;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SuperMarketQueue {
  public static int solveSuperMarketQueue(int[] customers, int n) {
    List<Integer> tills = new ArrayList<Integer>(Collections.nCopies(n, 0));
    int index = 0;
    int tillsIndex = 0;
    int result = 0;
    int flush = 0;
    while(index < customers.length){
      // wait the flush time
      result += flush;
      // distribute the customer
      tillsIndex = 0;
      while(tillsIndex < n){
        if(tills.get(tillsIndex) == flush && index < customers.length){
          tills.set(tillsIndex++, customers[index++]);
        }else{
          tills.set(tillsIndex, tills.get(tillsIndex++) - flush);
        }
      }
      // calculate flush minimal customer
      flush = Collections.min(tills);
    }
    // flush remaining maximal customer
    flush = Collections.max(tills);
    return result + flush;
  }

}