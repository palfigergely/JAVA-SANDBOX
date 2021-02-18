package GFA.HackerRank.BalancedBrackets;

public class Main {
  public static boolean evaluate(String s){
    int i = -1;
    while(s.length() != i){
      i = s.length();
      s = s.replace("()","");
      s = s.replace("{}","");
    }
    return s.length() == 0;
  }

  public static String test(int result){
    if(result == 0) return "OK";
    else return "Not OK!";
  }

  public static void main(String[] args) {
    System.out.println(test(Boolean.compare(evaluate("{}(())"),true)));
    System.out.println(test(Boolean.compare(evaluate("{()}"),true)));
    System.out.println(test(Boolean.compare(evaluate("{})"),false)));
    System.out.println(test(Boolean.compare(evaluate("({(){})"),false)));
  }
}
