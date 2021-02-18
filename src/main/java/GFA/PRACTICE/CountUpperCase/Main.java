package GFA.PRACTICE.CountUpperCase;

//Write  afunction what counts the uppercase characters in the input string

public class Main {
  static int camelCase(String word){
    int counter = 0;
    for(int i=0; i<word.length(); i++){
      if(Character.isUpperCase(word.charAt(i))){
        counter++;
      }
    }
    return counter;
  }

  public static void main(String[] args) {
    System.out.println(camelCase("acvBgdfGdgdrgGdrgdD"));
  }

}
