// For the problem at https://leetcode.com/problems/reverse-words-in-a-string/

class Solution {
    public String reverseWords(String s) {
        ArrayList<String> strings = new ArrayList<String>();
        String curr_s = "";
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ') {
                if(curr_s.length() != 0) {
                    strings.add(curr_s);
                    curr_s = "";
                }
            }
            else {
                curr_s += s.charAt(i);
            }
        }
        if(curr_s.length() != 0) {
            strings.add(curr_s);
            curr_s = "";
        }
        for(int i = strings.size()-1; i >= 0; i-- ) {
            if(i != strings.size()-1) {
                curr_s += " ";
            }
            curr_s += strings.get(i);
        }
        return curr_s;
    }
}
