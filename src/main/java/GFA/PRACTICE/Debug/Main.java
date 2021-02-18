package GFA.PRACTICE.Debug;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    Debug debug = new Debug();
    List<Integer> numbers = new ArrayList<>(Arrays.asList(1,4,0,3,5,0,6,7));
    List<Integer> numbers2 = new ArrayList<>(Arrays.asList(1,4,0,3,5,0,6,7));
    List<Integer> numbers3 = new ArrayList<>(Arrays.asList(1,4,0,3,5,0,6,7));

    System.out.println(numbers);
    System.out.println(debug.contentFilter(numbers));

    System.out.println(numbers2);
    System.out.println(debug.contentFilter2(numbers2));

    System.out.println(numbers3);
    System.out.println(debug.contentFilter3(numbers3));
  }
}
