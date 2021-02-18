package GFA.PRACTICE.OddAverage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    Calculator calc = new Calculator();
    List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
    List<Integer> list2 = new ArrayList<>(Arrays.asList(-5,-7));
    List<Integer> list3 = new ArrayList<>();

    System.out.println(calc.oddAverage(list1));
    System.out.println(calc.oddAverage(list2));
    System.out.println(calc.oddAverage(list3));

  }
}
