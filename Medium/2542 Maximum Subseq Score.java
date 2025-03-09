// For the problem at https://leetcode.com/problems/maximum-subsequence-score/description/

class Solution {  // kind of a slow solution but its memory efficient at least, supposedly
    public long maxScore(int[] nums1, int[] nums2, int k) {
        long score = 0;
        long workingsum = 0;
        Pair<Integer, Integer>[] pairs = new Pair[nums1.length];
        for(int i = 0; i < nums1.length; i++) {
            pairs[i] = new Pair<>(nums2[i], nums1[i]);
        }
        Arrays.sort(pairs, (a, b) -> Integer.compare(b.getKey(), a.getKey()));  // do our big sort here.  Trying a lambda expression here, hopefully I did this right.
        // sorting out pairs and then using our comparator
      
        Queue<Integer> pq = new PriorityQueue<>();

        for (Pair<Integer, Integer> par : pairs) {
            int num1 = par.getKey();
            int num2 = par.getValue();  // value of pair
            pq.offer(num2);  // enqueue latest pair
            workingsum += num2;
            if(pq.size() > k) {
                workingsum -= pq.poll();  // dequeue oldest pair
            }
            if(pq.size() == k) {
                score = Math.max(score, workingsum * num1);
            }
        }

        return score;
    }
}
