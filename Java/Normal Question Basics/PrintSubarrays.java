public class PrintSubarrays {
  public static void PrintSubarrays(int arr[]){
    int ts=0;
    
    for (int i = 0; i < arr.length; i++) {
      for (int j = i; j < arr.length; j++) {
        for (int k = i; k <=j; k++) {
          System.out.print(arr[k]+" ");
        }
        ts++;
        System.out.println();
      }
        System.out.println();
    }
  System.out.println("Total subarrays : " + ts);
  } 
  public static void main(String[] args) {
    PrintSubarrays(new int[]{1,2,3,4,5,6,7,8,9,10});
  }
}
