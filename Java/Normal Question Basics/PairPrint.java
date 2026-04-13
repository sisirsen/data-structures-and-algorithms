public class PairPrint {

  public static void PairPrint (int arr[]){
    for (int i = 0; i < arr.length-1; i++) {
      for(int j=1;j<arr.length-1;j++){

        System.out.print("("+ arr[i] +","+ arr[j]+")");
      }
      System.out.println();
    }
   
  }
  public static void main(String[] args) {
   PairPrint(new int[]{1,2,3,4,5,6,7,8,9});
  }
}
