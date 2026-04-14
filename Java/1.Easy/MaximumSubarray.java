public class MaximumSubarray {
  public static int kadane(int arr[]){
    int maxSum=Integer.MIN_VALUE;
    int currSum=0;

    for (int i = 0; i < arr.length; i++) {
      currSum=currSum+arr[i];

      if (currSum>maxSum) {
        maxSum=currSum;
      }

      if (currSum<0) {
        currSum=0;
      }
    }
    return maxSum;
  }
  public static void main(String[] args) {
    System.out.println(kadane(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    System.out.println(kadane(new int[]{1}));
    System.out.println(kadane(new int[]{5,4,-1,7,8}));
  }
}