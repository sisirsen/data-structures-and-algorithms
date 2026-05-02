public class FrequencyOfX {

  static int FrequencyOfX(int arr[],int x){
    int count =0;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i]==x) {
        count++;
      }
    }
    return count;
  }

  public static void main(String[] args) {
    System.out.println(FrequencyOfX(new int[]{1,2,3,4,2,6,2},2));
    System.out.println(FrequencyOfX(new int[]{6,2,4,4,5,6,7},6));
  }
}