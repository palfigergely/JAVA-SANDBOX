package GFA.FinalExam;

import java.util.HashMap;
import java.util.Map;

/*    Create a function called mostCommonLetter that takes a string as an input, and returns the most common letter in it.

      If there are more than one most common letter in the string, return only one of them.

      Example case:

    mostCommonLetter("apple");
    Should return p.*/
public class Finder {
  public Character mostCommonLetter(String string) {
    if(string.length()==0){
      return null;
    }
    Character letter = 0;
    int max=0;
    Character currentLetter;
    int currentOccur;

    for (int i=0; i<string.length(); i++) {
      currentLetter = string.charAt(i);
      currentOccur = 0;

      for (int j=0; j<string.length(); j++) {
        if(string.charAt(j) == currentLetter) {
          currentOccur++;
        }
      }
      if(currentOccur>max) {
        max=currentOccur;
        letter=currentLetter;
      }
    }
    return letter;
  }
}
