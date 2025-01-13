// For https://leetcode.com/problems/remove-duplicates-from-sorted-array/

class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0 || nums.length == 1) {
            return nums.length;
        }
        //Arrays.sort(nums);  // not needed here
        int e = 0;
        int[] nums2 = new int[nums.length];  // new array without the duplicates
        for(int i = 0; i < nums.length-1; i++) {
            if(nums[i] != nums[i+1]) {  // array is sorted so we can just check if the next 
                nums2[e++] = nums[i];  // iterate our unique elements as well as use it for array tracking
            }
        }   
        nums2[e++] = nums[nums.length-1];
        for (int i = 0; i < e; i++) {
            //System.out.print(nums2[i] + " ");
            nums[i] = nums2[i];  // adding the duplicate free array back into our original array
        }
        return e;  // return the number of unique elements
    }
}
