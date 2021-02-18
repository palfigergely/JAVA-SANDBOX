package GFA.PRACTICE.RotateMatrix;

public class Rotor {
  public Integer[][] rotateMatrix(Integer[][] matrix, int n) {
    int c = n % 4;
    if (c==0) {return matrix; }
    Integer[][] result = new Integer[matrix.length][matrix.length];

    for (int x = 1; x <= c; x++) {
      for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix.length; j++) {
          result[j][matrix.length-(1+i)] = matrix[i][j];
        }
      }
      //set base position for the next iteration
      for(int q=0; q<matrix.length; q++){
        for(int w=0; w<matrix.length;w++){
          matrix[q][w] = result[q][w];
        }
      }
    }
    return result;
  }
}