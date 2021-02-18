package GFA.PRACTICE.DiagonalMatrix;


// -  Create (dynamically*) a two dimensional list
//    with the following matrix**. Use a loop!
//
//    0 0 0 1
//    0 0 1 0
//    0 1 0 0
//    1 0 0 0
//
// -  Print this two dimensional list to the console
//
// * size should depend on a variable
// ** Relax, a matrix is just like an array

import java.util.Arrays;

public class Main {
  static Integer[][] makeMatrix(int i) {
    Integer[][] matrix = new Integer[i][i];
    for(int a=0; a<matrix.length; a++){
      for(int b=0; b<matrix.length; b++){
        if(a+b==i-1){
          matrix[a][b] = 1;
        } else {
          matrix[a][b] = 0;
        }
      }
    }
    return matrix;
  }

  public static void main(String[] args) {
    System.out.println(Arrays.deepToString(makeMatrix(4)));
  }
}
