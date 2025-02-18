// For the problem at https://leetcode.com/problems/count-and-say/

public class Solution {
    public string CountAndSay(int n) {
        if(n == 1) {  // base case
            return "1";
        }

        string rec = CountAndSay(n-1);
        return RunLength(rec, rec.Length-1, 1);  // default of 1 count digit
    }

    public string RunLength(string rec, int len, int count) {
        if(len == 0) {  // just 1 digit with len being length -1
            return count.ToString() + rec[0];  // base case return
        }
        if(rec[len] == rec[len-1]) {
            return RunLength(rec, len-1, count+1);
        }
        return RunLength(rec, len-1, 1) + count.ToString() + rec[len];
    }
}
