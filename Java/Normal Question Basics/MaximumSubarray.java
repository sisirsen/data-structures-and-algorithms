public class MaximumSubarray {
  public static void PrintSubarrays(int arr[]){
    int sum=0;
    int ts=0;
    for (int i = 0; i < arr.length; i++) {
      for (int j = i; j < arr.length; j++) {
       for (int j2 = i; j2 <=j; j2++) {
          System.out.print(arr[j2]+ " ");
       } 
       ts++;
       
       System.out.println();
      }
      System.out.println();
    }
    System.out.println("Total Arrays Are : "+ts);
  }
  public static void main(String[] args) {
    PrintSubarrays(new int[]{1,2,3,4,5,6});
  }
}
