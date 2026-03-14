const isPalindrome = function(s) {
  let newinp=s.toLowerCase().replace(/[^a-z0-9]/g, "");
    let left = 0;
    let right = newinp.length - 1;

    while (left < right) {
        if (newinp[left] !== newinp[right]) {
            return false;
        }
        left++;
        right--;
    }

    return true;
};
console.log( isPalindrome("A man, a plan, a canal: Panama"));
console.log(isPalindrome("race a car"));
console.log(isPalindrome(" "));