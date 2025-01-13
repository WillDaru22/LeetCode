// For https://leetcode.com/problems/length-of-last-word/description/

class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;  // length of last word
        for(int i = s.length()-1; i >=0; i--) {  // start at end
            if(s.charAt(i) != ' ') {  // found a non space
                count++;  // increment length
            }
            else {  // found a space
                if(count > 0) {  //if already found a non space
                    return count;
                }
            }
        }
        return count;
    }
}
