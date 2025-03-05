// For the problem at https://leetcode.com/problems/successful-pairs-of-spells-and-potions/submissions/

class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {  // bit of a slow but memory efficient solution
        int n = spells.length;
        int m = potions.length;
        int[] pairs = new int[n];
        Arrays.sort(potions);
        for(int i = 0; i < n; i++) {
            int spell = spells[i];
            int left = 0;
            int right = potions.length-1;
            while(left <= right) {
                int mid = left + (right - left) /2;
                long goal = (long)spell * potions[mid];
                if(goal >= success) {
                    right = mid -1;
                }
                else {
                    left = mid + 1;
                }
            }
            pairs[i] = m - left;

        }
        return pairs;
    }
}
