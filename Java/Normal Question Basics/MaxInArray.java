class MaxInArray {

public static int arr(int[] nums){

  if (nums.length==0) {
    return -1;
  }

int max=nums[0];

for(int i=0;i<nums.length;i++){

if(nums[i]>max){

max=nums[i];

}

}
return max;
}

public static void main (String[] args){

System.out.println(arr(new int[]{1,3,2,5,7,3,6,9}));
System.out.println(arr(new int[]{}));
}

}
