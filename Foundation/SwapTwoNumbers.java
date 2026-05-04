public class SwapTwoNumbers {
  static void swap(int a , int b){

    System.out.println("Values before swap");

    System.out.println("a = "+ a);
    System.out.println("b = "+ b);

    int temp=a;
    a=b;
    b=temp;
    System.out.println("Values after swap");

    System.out.println("a = "+ a);
    System.out.println("b = "+ b);


   
  }
  public static void main(String[] args) {
    int a=1;
    int b=2;
    swap(a,b);
  
  }
}
