package GFA.PRACTICE.CommonPart;

/*Given two strings, determine if they share a common substring.
A substring may be as small as one character.*/

import java.util.HashSet;
import java.util.Set;

public class Main {

  static boolean hasCommonPart(String s1, String s2){
    boolean ans = false;
    Set<Character> letters1 = new HashSet<Character>();
    Set<Character> letters2 = new HashSet<Character>();
    for (Character i:s1.toCharArray()){
      letters1.add(i);
    }
    for (Character i:s2.toCharArray()){
      letters2.add(i);
    }
    for(Character c:letters1){
      for(Character d: letters2){
        if(c==d){
          ans = true;
        }
      }
    }
    return ans;
  }

  static boolean hasCommonPart2(String s1, String s2){
    boolean ans = false;
    for(Character i: s1.toCharArray()){
      for(Character j: s2.toCharArray()){
        if(i==j){
          ans=true;
        }
      }
    }
    return ans;
  }

  public static void main(String[] args) {
    String a = "aaaaa";
    String b = "bbbdf";
    System.out.println(hasCommonPart(a,b));
    System.out.println(hasCommonPart2(a,b));
  }

}
