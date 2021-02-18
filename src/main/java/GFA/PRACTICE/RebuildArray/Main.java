package GFA.PRACTICE.RebuildArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Write a function which takes two parameters,
// a list of integers (arr) and an integer (n).
// The function should return a new array.
// The return value should be built from arr
// but each n-th value must be replaced with its
// value times the maximum value from the arr.
//  Do not use the built-in sort() and max()
//  method to find the maximum value.
public class Main {
  public static void main(String[] args) {
    Modifier modifier = new Modifier();
    List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
    List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
    List<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
    List<Integer> list4 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
    List<Integer> list5 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

    System.out.println(modifier.rebuild(list, 3).toString());
    System.out.println(modifier.rebuild(list2, 1).toString());
    System.out.println(modifier.rebuild(list3, 10).toString());
    System.out.println(modifier.rebuild(list4, 15).toString());
    System.out.println(modifier.rebuild(list5, 0).toString());
  }
}
