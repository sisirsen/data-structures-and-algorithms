// Input: arr[] = [1, 4, 3, 2, 6, 5]  
// Output:  [5, 6, 2, 3, 4, 1]
// Explanation: The first element 1 moves to last position, the second element 4 moves to second-last and so on.

// Input: arr[] = [4, 5, 1, 2]
// Output: [2, 1, 5, 4]
// Explanation: The first element 4 moves to last position, the second element 5 moves to second last and so on.
import java.util.Arrays;
public class ReverseAnArray {
  public static int[] reversed(int arr[]) {

     
    // Arrays.sort(arr); // only if you want to sort

    int first = 0, last=arr.length-1;
    
     while (first<last) {
      int temp=arr[last];
      arr[last]=arr[first];
      arr[first]=temp;

      first++;
      last--;
     }
     return arr;
     }
  

  public static void main(String[] args) {
   
    System.out.println(Arrays.toString(reversed(new int[]{1, 4, 3, 2, 6, 5})));
    System.out.println(Arrays.toString(reversed(new int[]{4, 5, 1, 2})));
  }
  }

