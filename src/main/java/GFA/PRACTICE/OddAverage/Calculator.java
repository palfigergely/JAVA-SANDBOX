package GFA.PRACTICE.OddAverage;

/*
Create a function called oddAverage that takes
a list of numbers as parameter and returns the
average value of the odd numbers in the list
Create basic unit tests for it with at least 3 different
test cases
*/

import java.util.List;

public class Calculator {
  public Integer oddAverage(List<Integer> list) throws NullPointerException {
    Integer sum = 0;
    Integer counter = 0;
    for (int i=0; i<list.size(); i++) {
      if (list.get(i) % 2 != 0) {
        counter++;
        sum+=list.get(i);
      }
    }
    if(counter == 0) {
      return null;
    }
    return sum / counter;
  }
}
