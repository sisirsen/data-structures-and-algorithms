function isPalindrome(n) {
  let str = n.toString();                 
  let reversed = str.split('').reverse().join(''); 
  let backToNumber = Number(reversed);   

  return n === backToNumber;
}

console.log(isPalindrome(121));  
console.log(isPalindrome(10));    
console.log(isPalindrome(-121));  
