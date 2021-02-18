package GFA.PRACTICE.TwoArrays;

import java.util.ArrayList;
import java.util.List;

/*
Create a function that takes two list of numbers and
returns a new list that only consists those numbers
that are in the first array but not in the second
*/
public class Selector {
  public static List<Integer> selector(List<Integer> listA, List<Integer> listB) {
    List<Integer> resultList = new ArrayList<>();
    for (int i=0; i< listA.size(); i++) {
      if (!listB.contains(listA.get(i)) && !resultList.contains(listA.get(i))) {
        resultList.add(listA.get(i));
      }
    }
    return resultList;
  }
}
