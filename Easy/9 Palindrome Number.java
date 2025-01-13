// For https://leetcode.com/problems/palindrome-number/

class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) {  // negative numbers cannot be palindromes according to the prompt
            return false;
        }
        int reversed = 0;
        for (int i = x; i !=0; i /= 10) {  // Reverse the digits of the number here by adding each digit to the reversed number
            reversed = reversed * 10 + i % 10;
        }
        if(reversed != x) {
            return false;
        }
        else {
            return true;   
        }
    }
}
