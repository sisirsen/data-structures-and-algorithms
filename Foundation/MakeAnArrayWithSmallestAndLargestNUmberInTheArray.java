import java.util.Arrays;

public class MakeAnArrayWithSmallestAndLargestNUmberInTheArray {
  static int[] array(int arr[]){

    Arrays.sort(arr);
    System.out.println (Arrays.toString((arr)));
    int newArr[]={0,arr[arr.length-1]};
    return newArr;



  }
  public static void main(String[] args) {
    System.out.println (Arrays.toString((array(new int[]{1,2,1,9,3,6,5,7,4}))));
  }
}
