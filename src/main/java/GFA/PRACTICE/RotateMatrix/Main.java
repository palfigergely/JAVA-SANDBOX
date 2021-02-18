package GFA.PRACTICE.RotateMatrix;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Rotor rotor = new Rotor();
    Integer[][] matrix = {
      {1,2,3,4,5},
      {1,2,3,4,5},
      {1,2,3,4,5},
      {1,2,3,4,5},
      {1,2,3,4,5}
    };

    Integer[][] matrix2 = {
      {1,2,3,4,5},
      {6,7,8,9,10},
      {11,12,13,14,15},
      {16,17,18,19,20},
      {21,22,23,24,25}
    };

    System.out.println(Arrays.deepToString(rotor.rotateMatrix(matrix,0)));
    System.out.println(Arrays.deepToString(rotor.rotateMatrix(matrix,1)));
    System.out.println(Arrays.deepToString(rotor.rotateMatrix(matrix,1)));
    System.out.println(Arrays.deepToString(rotor.rotateMatrix(matrix,1)));
    System.out.println(Arrays.deepToString(rotor.rotateMatrix(matrix,1)));

    System.out.println(Arrays.deepToString(rotor.rotateMatrix(matrix2,5)));
  }
}
