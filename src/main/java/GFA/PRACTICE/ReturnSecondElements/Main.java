package GFA.PRACTICE.ReturnSecondElements;

// Create a function that takes a list as a parameter,
// and returns a new list with every second element from the orignal list
// example: [1, 2, 3, 4, 5] should produce [2, 4] - print this result

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    Selector selector = new Selector();
    List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
    List<Integer> list2 = new ArrayList<>(Arrays.asList(5));
    List<Integer> list3 = new ArrayList<>(Arrays.asList(0));
    List<Integer> list4 = new ArrayList<>();

    System.out.println(selector.pickSeconds(list1));
    System.out.println(selector.pickSeconds(list2));
    System.out.println(selector.pickSeconds(list3));
    System.out.println(selector.pickSeconds(list4));
  }
}
