import java.util.Scanner;

public class KthSmallestKthLargest {

  static void array(int arr[]) {
    Scanner sc = new Scanner(System.in);

    int KthElement=sc.nextInt();

    // SecondLargest;

    int Secondlargest = arr[arr.length - KthElement];

    // secondSmallest;

    int seconeSmallest = arr[KthElement-1];

    System.out.println(seconeSmallest);
    System.out.println(Secondlargest);
    // System.out.println(smallest);
    // System.out.println(largest);

  }

  public static void main(String[] args) {

    array(new int[] { 1, 2, 3, 4, 5, 6, 7, 8 });
  }
}
