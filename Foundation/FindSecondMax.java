class FindSecondMax {
  
  static int Max(int arr[]){
    int max=Integer.MIN_VALUE;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i]>max) {
        max=arr[i];
      }
    }
    return max;
  }
  


  static int SecondMax(int arr[]){

    int max2=Max(arr);

    for (int i = 0; i < arr.length; i++) {
      if (arr[i]==max2) {
        arr[i]=Integer.MIN_VALUE;
      }
    }
    int secondMax=Max(arr);
    return secondMax;

  }

  public static void main(String[] args) {
    System.out.println(SecondMax(new int[]{1,2,3,4,5,6,7,8,9}));
  }
}