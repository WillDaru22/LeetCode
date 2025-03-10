// For the problem at https://leetcode.com/problems/house-robber/

class Solution {
    public int rob(int[] nums) {

        if(nums.length == 0) {
            return 0;
        }
        if(nums.length == 1) {
            return nums[0];
        }
        if(nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }
        int steal = 0;  
        int skip = 0;
        for(int i = 0; i < nums.length; i++) {
            int dp = steal;
            steal = Math.max(steal, skip + nums[i]);
            skip = dp;
        }
        return steal;
    }
}
