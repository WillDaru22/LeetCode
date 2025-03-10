// For the problem at https://leetcode.com/problems/kth-largest-element-in-an-array/description/

class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b - a);
        for(int i : nums) {
            pq.add(i);
        }
        while(k > 1) {
            pq.poll();
            --k;
        }
        return pq.poll();
    }
}
