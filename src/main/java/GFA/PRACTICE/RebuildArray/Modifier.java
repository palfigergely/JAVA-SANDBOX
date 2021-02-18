package GFA.PRACTICE.RebuildArray;

import java.util.List;

// Write a function which takes two parameters,
// a list of integers (arr) and an integer (n).
// The function should return a new array.
// The return value should be built from arr
// but each n-th value must be replaced with its
// value times the maximum value from the arr.
//  Do not use the built-in sort() and max()
//  method to find the maximum value.

public class Modifier {
  public List<Integer> rebuild(List<Integer> arr, Integer n) {
    if(n > arr.size()) { return arr; }
    Integer max = maxVal(arr);
    for (int i=1; i<=arr.size(); i++) {
      if (i%n == 0) {
        arr.set(i-1, arr.get(i-1)*max);
      }
    }
    return arr;
  }

  public Integer maxVal(List<Integer> arr) {
    Integer max = Integer.MIN_VALUE;
    for (int i=0; i<arr.size(); i++) {
      if(arr.get(i)>max) {
        max = arr.get(i);
      }
    }
    return max;
  }
}
