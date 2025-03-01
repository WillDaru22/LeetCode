// For https://leetcode.com/problems/find-the-highest-altitude/description/

class Solution {
    public int largestAltitude(int[] gain) {
        int alt = 0;
        int max_alt = alt;
        for(int i = 0; i < gain.length; i++) {
            alt += gain[i];
            if(alt > max_alt) {
                max_alt = alt;
            }
        }
        return max_alt;
    }
}
