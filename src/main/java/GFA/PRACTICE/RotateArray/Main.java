package GFA.PRACTICE.RotateArray;

import java.util.Arrays;

public class Main {
  // Complete the circularArrayRotation function below.
  static int[] circularArrayRotation(int[] a, int k) {
    int x = k % a.length;
    if(x==0) {return a;}
    int[] result = new int[a.length];
    for(int i=1; i<=x; i++){
      for(int j=1; j<a.length; j++){
        result[0] = a[a.length-1];
        result[j] = a[j-1];
      }
      //for(int p=0; p<a.length; p++){
      //    a[p] = result[p];
      //}
      a = Arrays.copyOf(result, result.length);
    }
    return result;
  }

  public static void main(String[] args) {
    int[] a = {1,2,3,4,5,6,7,8,9,10};
    System.out.println(Arrays.toString(circularArrayRotation(a,5)));
  }
}
