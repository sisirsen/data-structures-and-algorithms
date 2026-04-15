// import java.util.Arrays;
// public class ContainsDuplicate {

//   public static Boolean ConDup(int arr[]){

//     Arrays.sort(arr);

//     if (arr.length==0 || arr==null) {
//       throw new IllegalArgumentException("Array is empty");
//     }

//     for (int i = 0; i < arr.length; i++) {
//       for (int j = i+1; j < arr.length; j++) {
//         if (arr[i]==arr[j]) {
//           return true;
//         }
//       }
//     }
//     return false;


//   }

//   public static void main(String[] args) {
//     System.out.println(ConDup(new int[]{1,2,3,1}));
//     System.out.println(ConDup(new int[]{1,2,3,4}));
//     System.out.println(ConDup(new int[]{1,1,1,3,3,4,3,2,4,2}));
//     System.out.println(ConDup(new int[]{}));
//   }
// }



import java.util.Arrays;
public class ContainsDuplicate {

  public static Boolean ConDup(int arr[]){

    Arrays.sort(arr);

    if (arr==null|| arr.length==0 ) {
      throw new IllegalArgumentException("Array is empty");
    }

for (int i = 0; i < arr.length-1; i++) {
  if (arr[i]==arr[i+1]) {
    return true;
  }
}
return false;
  }

  public static void main(String[] args) {
    System.out.println(ConDup(new int[]{1,2,3,1}));
    System.out.println(ConDup(new int[]{1,2,3,4}));
    System.out.println(ConDup(new int[]{1,1,1,3,3,4,3,2,4,2}));
    System.out.println(ConDup(new int[]{}));
  }
}