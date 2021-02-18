package GFA.PRACTICE.TwoArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Create a function that takes two list of numbers and
returns a new list that only consists those numbers
that are in the first array but not in the second
*/
public class Main {
  public static void main(String[] args) {
    Selector selector = new Selector();
    List<Integer> listA = new ArrayList<Integer>(Arrays.asList(1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8,9,9));
    List<Integer> listB = new ArrayList<Integer>(Arrays.asList(2,4,6,8,10));
    System.out.println(selector.selector(listA, listB).toString());
  }

}
