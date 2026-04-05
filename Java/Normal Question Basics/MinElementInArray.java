class MinElementInArray {

public static int arr(int[] nums){

  if (nums.length==0 || nums==null) {
    throw new IllegalArgumentException("array is empty");
  }

int min=nums[0];

for(int i=0;i<nums.length;i++){

if(nums[i]<min){

min=nums[i];

}

}
return min;
}

public static void main (String[] args){

System.out.println(arr(new int[]{3,2,5,7,1,3,6,9}));
System.out.println(arr(new int[]{}));
}

}
