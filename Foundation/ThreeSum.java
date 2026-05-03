import java.util.Arrays;

public class ThreeSum {

  static int[] ThreeSum(int arr[],int target){

    int n=arr.length;

    for (int i = 0; i < n; i++) {
      for (int j = i+1; j < n; j++) {
        for (int k = j+1; k< arr.length; k++) {
          if (arr[i]+arr[j]+arr[k]==target) {
            return new int []{arr[i],arr[j],arr[k]};
          }
        }
      }
    }
    return new int[]{-1,-1,-1};
  }
  public static void main(String[] args) {
    System.out.println(Arrays.toString(ThreeSum(new int[]{1,3,4,3,6,5},11)));
  }
}
