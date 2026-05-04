public class FirstRepeatedNumber {

  static int FirstRepeatNo(int arr[]){

    for (int i = 0; i < arr.length; i++) {
      for (int j = i+1; j < arr.length; j++) {
        if (arr[i]==arr[j]) {
        return arr[i];
        }
      }
    }
    return -1;

  }
  public static void main(String[] args) {
    System.out.println(FirstRepeatNo(new int[]{1,2,3,1,4,5,3}));
    System.out.println(FirstRepeatNo(new int[]{1,2,3,5,4,5,3}));
    System.out.println(FirstRepeatNo(new int[]{1,2,3,4,5,6,7,8}));
  }
}

