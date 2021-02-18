package GFA.PRACTICE.DoubleItems;

// - Create an array variable named `drinks` with the following content:
//   `['Gin', 'Whiskey', 'Wine', 'Beer']`
// - Double all the strings in the array, use a built in array method instead of
//   a loop
// - It should print: ['GinGin', 'WhiskeyWhiskey', 'WineWine', 'BeerBeer']`

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

  static List<String> doubler(List<String> list) {
    for(int i=0; i<list.size(); i++) {
      list.set(i, list.get(i)+list.get(i));
    }
    return list;
  }

  public static void main(String[] args) {
    List<String> list = new ArrayList<>(Arrays.asList("Gin", "Whiskey", "Wine", "Beer"));
    System.out.println(doubler(list));
  }
}
