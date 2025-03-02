// For the problem at https://leetcode.com/problems/sqrtx/

class Solution {
    public int mySqrt(int x) {
        long left = 0;  // using long here for both to prevent issues with integer math overflows
        long right = x;
        while(left <= right) {
            long mid = (left + right)/2;
            if((mid * mid) > x) {  // needed to use long to prevent this issue here from causing problems
                right = mid - 1;
            }
            else if((mid * mid) < x) {
                left = mid + 1;
            }
            else {
                return (int)mid;
            }
        }
        return (int)right;
    }
}
