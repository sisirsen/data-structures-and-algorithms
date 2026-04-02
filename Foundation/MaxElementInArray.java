package Foundation;

public class MaxElementInArray{

public static int maxElement(int[] arr) {

int max=arr[0];

for(int i=1;i< arr.length;i++){

	if (arr[i]>max) {
		max=arr[i];
	}

}
return max;
}
	
public static void main(String[] args){

System.out.println(maxElement(new int[]{1,3,5,2,6,1,7}));
}

}