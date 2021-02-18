package GFA.PRACTICE.Debug;

import java.util.ArrayList;
import java.util.List;

public class Debug {

/*  Create a function that takes a number array / list (numbers)
    and return a new array / list that has the original numbers
     without all the zeros and any numbers between after a zero
     until you find another zero.
*/
public List<Integer> contentFilter(List<Integer> numbers) {
    for (int i = 0; i < numbers.size(); i++) {
      if (numbers.get(i) == 0) {
        numbers.remove(i);

        for (int j = i + 1; j < numbers.size(); j++) {
          if (numbers.get(j) == 0) {
            numbers.remove(j);
            break;
          }
          numbers.remove(j);
        }
      }
    }
    return numbers;
  }

  //REFACTOR #1
  public List<Integer> contentFilter2(List<Integer> numbers) {
    for (int i = 0; i < numbers.size(); i++) {
      if (numbers.get(i) == 0) {
        numbers.remove(i);

        for (int j = i; j < numbers.size();) {
          if (numbers.get(j) == 0) {
            numbers.remove(j);
            break;
          }
          numbers.remove(j);
        }
      }
    }
    return numbers;
  }

  //REFACTOR #2
  public List<Integer> contentFilter3(List<Integer> numbers) {
    List<Integer> results = new ArrayList<>();
    boolean keep = true;
    for (int i = 0; i < numbers.size(); i++) {
      if (numbers.get(i) != 0 && keep == true) {
        results.add(numbers.get(i));
      } else if (numbers.get(i) == 0 && keep == false) {
        keep = true;
      } else {
        keep = false;
      }
    }
    return results;
  }
}
