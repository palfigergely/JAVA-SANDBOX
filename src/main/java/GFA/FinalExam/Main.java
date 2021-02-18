package GFA.FinalExam;

public class Main {
  public static void main(String[] args) {
    Finder finder = new Finder();
    System.out.println(finder.mostCommonLetter("Apple"));
    System.out.println(finder.mostCommonLetter("Applllllllll"));
    System.out.println(finder.mostCommonLetter(""));
    System.out.println(finder.mostCommonLetter("A p p l e"));

  }
}
