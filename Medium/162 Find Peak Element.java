// For the problem at https://leetcode.com/problems/find-peak-element/

class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length == 1) {  // check for single element
            return 0;
        }
        if(nums[0] > nums[1]) {  // check first peak at beginning
            return 0;
        }
        if(nums[nums.length-1] > nums[nums.length-2]) {  // check peak at end
            return nums.length-1;
        }

        // checking for other peak options
        int begin = 1;
        int finish = nums.length-2;

        while(begin <= finish) {
            int middle = begin + (finish-begin) /2;  // standard middle index
            if(nums[middle] > nums[middle-1] && nums[middle] > nums[middle+1]) {
                return middle;
            }
            else if(nums[middle] < nums[middle-1]) {
                finish = middle - 1;
            }
            else if(nums[middle] < nums[middle+1]) {
                begin = middle + 1;
            }
            else {
            }
        }
        return -1;  // no peak found
    }
}
