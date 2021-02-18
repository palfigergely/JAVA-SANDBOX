package GFA.PRACTICE.ReturnSecondElements;

import java.util.ArrayList;
import java.util.List;

// Create a function that takes a list as a parameter,
// and returns a new list with every second element from the orignal list
// example: [1, 2, 3, 4, 5] should produce [2, 4] - print this result

public class Selector {
  public List<Integer> pickSeconds(List<Integer> list) {
    List<Integer> result = new ArrayList<>();
    if (list.size()==1) { return result; }
    for(int i=1; i <= list.size(); i+=2) {
      result.add(list.get(i));
    }
    return result;
  }
}
