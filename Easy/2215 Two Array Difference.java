// For the problem at https://leetcode.com/problems/find-the-difference-of-two-arrays/description/

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> answer = new ArrayList<List<Integer>>();
        answer.add(new ArrayList<Integer>());
        answer.add(new ArrayList<Integer>());
        int current = -1001;
        for(int i = 0; i < nums1.length; i++) {
            for(int j = 0; j < nums2.length; j++) {
                if(nums1[i] == nums2[j]) {
                    current = -1001;
                    break;
                }
                else {
                    current = nums1[i];
                }
            }
            if(current != -1001) {
                if(!answer.get(0).contains(current)) {
                    answer.get(0).add(current);
                    current = -1001;
                }
            }
        }
        for(int i = 0; i < nums2.length; i++) {
            for(int j = 0; j < nums1.length; j++) {
                if(nums2[i] == nums1[j]) {
                    current = -1001;
                    break;
                }
                else {
                    current = nums2[i];
                }
            }
            if(current != -1001) {
                if(!answer.get(1).contains(current)) {
                    answer.get(1).add(current);
                    current = -1001;
                }
            }
        }
        return answer;
    }
}
