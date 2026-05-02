public class CountStrictBigValues {
  static int CountStrictBigValues(int arr[],int x){
    int count=0;
      for (int i = 0; i < arr.length; i++) {
       
        if (arr[i]>x) {
          count++;
        }
      }
      return count;
      
  }
  public static void main(String[] args) {
    System.out.println(CountStrictBigValues(new int[]{1,5,6,5,7,4}, 5));
    System.out.println(CountStrictBigValues(new int[]{1,5,6,5,7,4,8,9},6 ));
  }
}
