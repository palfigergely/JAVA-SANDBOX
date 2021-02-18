package GFA.PRACTICE.Anagram;

// Create a function what takes two strings as input, compare them if
// they could be each-other anagrams, and return how many characters
// should be deleted to be perfect anagrams.

import java.util.HashMap;
import java.util.Map;

public class Main {
  static HashMap<Character, Integer> createHashMap(String s){
    HashMap<Character, Integer> map = new HashMap<Character, Integer>();
    for(int i=0; i<s.length(); i++){
      if(!map.containsKey(s.charAt(i))){
        map.put(s.charAt(i), 0);
      }
      map.put(s.charAt(i), map.get(s.charAt(i))+1);
    }
    return map;
  }

  static int anagram(String s1, String s2){
    HashMap<Character, Integer> map1 = createHashMap(s1);
    HashMap<Character, Integer> map2 = createHashMap(s2);
    Integer counter = 0;
    for(Map.Entry<Character,Integer> entry: map1.entrySet()){
      Character c = entry.getKey();
      Integer i = entry.getValue();
      if(!map2.containsKey(c)){
        counter += i;
        continue;
      } else if(i > map2.get(c)) {
        counter += i-map2.get(c);
      }
    }
    for(Map.Entry<Character,Integer> entry: map2.entrySet()){
      Character c = entry.getKey();
      Integer i = entry.getValue();
      if(!map1.containsKey(c)){
        counter += i;
        continue;
      } else if(i > map1.get(c)) {
        counter += i-map1.get(c);
      }
    }
    return counter;
  }

  public static void main(String[] args) {
    System.out.println(anagram("IamFirstString", "IamSecondString"));
  }
}
