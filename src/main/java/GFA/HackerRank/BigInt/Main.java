package GFA.HackerRank.BigInt;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println("Please type two numbers and hit 'Enter'!");

    Scanner scan = new Scanner(System.in);
    BigInteger a = scan.nextBigInteger();
    BigInteger b = scan.nextBigInteger();

    System.out.println(a.add(b));
    System.out.println(a.multiply(b));
  }
}
