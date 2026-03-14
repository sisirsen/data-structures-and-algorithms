const plusOne = function(digits) {
    for(let i=digits.length-1;i>=0;i--){
      if(digits[i]==9){
        digits[i]= 0;
      }
      else{
        digits[i]++;
        return digits;
      }
    }
    let newDigit=new Array(digits.length+1);
    newDigit[0]=1;
      for(let i = 1; i < newDigit.length; i++){
      newDigit[i] = 0;
      return newDigit;
    }
};
console.log(plusOne([1,2,3]));
console.log(plusOne([4,3,2,1]));
console.log(plusOne([8,9,9,9]));
