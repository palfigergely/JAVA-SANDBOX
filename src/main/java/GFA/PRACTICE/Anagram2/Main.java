package GFA.PRACTICE.Anagram2;

public class Main {
  static boolean isAnagram(String a, String b){
    if(a.length() != b.length()) return false;

    a = a.toLowerCase();
    b = b.toLowerCase();
    for(int i=0; i<a.length(); i++){
      if(b.contains(String.valueOf(a.charAt(i)))){
        b=b.replaceFirst(String.valueOf(a.charAt(i)),"");
      } else {
        return false;
      }
    }
    return b.length() == 0;
  }

  public static void main(String[] args) {
    System.out.println(isAnagram("Anagram", "Margana"));
    System.out.println(isAnagram("Anagram", "Anagrama"));
  }
}
