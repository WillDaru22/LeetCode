// For the problem at https://leetcode.com/problems/climbing-stairs/

class Solution {
    public int climbStairs(int n) {
        int first = 1;
        int second = 2;  // another base case
        int third = 0;
        if (n == 1) {  // base case here
            return first;
        }
        for(int i = 3; i <= n; i++) {  // went with an dp solution instead of a recursive this time
            third = first + second;  // third depends on the result of the previous two so we can use DP to solve
            first = second;
            second = third;
        }
        return second;
    }
}
