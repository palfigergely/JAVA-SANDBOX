package GFA.FinalExamRetake;

import java.util.Arrays;

public class Main {
  static String censure(String message, String[] badWords, String[]flowerWords){
    String[] words = message.split("[ ]" );
    return change(words, badWords, flowerWords);
  }

  static String change(String[] words, String[] badWord, String[]flowerWord){
    String result = "";
    for(String word:words){
      if(!Arrays.asList(badWord).contains(word)){
        result += " " + word;
      } else {
        result += " " + flowerWord[(int)(Math.random() * flowerWord.length)];
      }
    }
    return result;
  }

  public static void main(String[] args) {
    String[] badword = {"beautiful", "joyfull"};
    String[] flower = {"hated", "terribble", "bad", "ugly", "disgusting"};
    System.out.println(censure("This is the beginning of a beautiful friendship and a joyfull day.", badword, flower ));
  }
}