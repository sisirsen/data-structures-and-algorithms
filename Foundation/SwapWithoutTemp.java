public class SwapWithoutTemp {
  static void swap(int a , int b){

    System.out.println("Values before swap");

    System.out.println("a = "+ a);
    System.out.println("b = "+ b);

    a=a+b;
    b=a-b;
    a=a-b;

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
