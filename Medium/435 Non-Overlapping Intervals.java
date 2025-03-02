// For the problem at https://leetcode.com/problems/non-overlapping-intervals/

class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        if(intervals.length == 0) {
            return 0;
        }

        Arrays.sort(intervals, (a,b)->a[1] - b[1]);  // comparator used to compare for sorting
        int ans = 1;  // number of intervals to remove
        int end = intervals[0][1];

        for(int i = 1; i < intervals.length; i++) {
            int start = intervals[i][0];
            if(start >= end) {
                ans++;
                end = intervals[i][1];
            }
        }
        return intervals.length - ans;

    }
}
