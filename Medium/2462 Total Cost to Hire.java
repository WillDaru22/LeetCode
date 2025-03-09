// For the file at https://leetcode.com/problems/total-cost-to-hire-k-workers/

class Solution {
    public long totalCost(int[] costs, int k, int candidates) {
        long cost = 0;
        int n = candidates;
        int trackStart = 0;
        int trackEnd = costs.length -1;
        PriorityQueue<Integer> half1 = new PriorityQueue<>();
        PriorityQueue<Integer> half2 = new PriorityQueue<>();
        for(int i = 0; i < k; i++) {
            while(half1.size() < n && trackStart <= trackEnd) {
                half1.add(costs[trackStart++]);
            }
            while(half2.size() < n && trackStart <= trackEnd) {
                half2.add(costs[trackEnd--]);
            }

            int top1 = 0;  // top of first half pq
            int top2 = 0;  // top of 2nd half pq

            if(half1.size() > 0) {
                top1 = half1.peek();
            }
            else {
                top1 = Integer.MAX_VALUE;
            }
            if(half2.size() > 0) {
                top2 = half2.peek();
            }
            else {
                top2 = Integer.MAX_VALUE;
            }
            if(top1 > top2) {
                cost += top2;
                half2.poll();
            }
            else if(top1 <= top2){
                cost += top1;
                half1.poll();
            }
            else {
            }
        }
        return cost;
    }
}
