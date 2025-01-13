// For https://leetcode.com/problems/search-insert-position/description/

class Solution {
    public int searchInsert(int[] nums, int target) {
        int l = 0;
        int r = nums.length-1;
        while(l <= r) {  //  Searching with binary search for this problem
            int m = (l+r)/2;  // find the middle of our initial indexes
            if(nums[m] < target) {  //  Increaase the index if we are below our target
                l = m+1;
            }
            else if(nums[m] > target) {  // decrease the index if we are above our target
                r = m-1;
            }
            else {  // return our index where the number we found would be
                return m;
            }
        }
        return r+1;
    }
}
