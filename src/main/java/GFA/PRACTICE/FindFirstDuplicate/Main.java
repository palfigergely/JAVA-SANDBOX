package GFA.PRACTICE.FindFirstDuplicate;

import java.util.ArrayList;
import java.util.List;

//Write a function what finds the first repeating character in a string.
public class Main {
  static Character findFirst(String string){
    List<Character> c = new ArrayList<>();
    for(int i=0; i<string.length(); i++){
      if(!c.contains(string.charAt(i))){
        c.add(string.charAt(i));
      } else {
        return string.charAt(i);
      }
    }
    return null;
  }

  public static void main(String[] args) {
    String a = "ABCDEFGHIJKLBAMNOPQR";
    System.out.println(findFirst(a));
  }
}
