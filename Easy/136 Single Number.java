// For the problem at https://leetcode.com/problems/single-number/description/

class Solution {
    public int singleNumber(int[] nums) {
        int xor = 0;
        for(int i = 0; i < nums.length; i++) {
            xor ^= nums[i];  // We get to use exclusive OR! XOR!  Logic operators!
        }
        return xor;
    }
}
