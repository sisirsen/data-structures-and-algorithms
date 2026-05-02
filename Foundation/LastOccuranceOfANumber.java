public class LastOccuranceOfANumber {

  static int LastOccuranceOfANumber(int arr[],int x){
      int lastIndex=0;

      for (int i = 0; i < arr.length; i++) {
        if(arr[i]==x){
          lastIndex=i;
        }
      }
      return lastIndex;
  }
  public static void main(String[] args) {
    System.out.println(LastOccuranceOfANumber(new int[]{1,2,3,2,3,4,5,2},2));
    System.out.println(LastOccuranceOfANumber(new int[]{1,2,3,2,3,4,5,2},3));
  }
}
