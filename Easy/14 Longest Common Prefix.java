// For https://leetcode.com/problems/longest-common-prefix/description/

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs[0].length() == 0) {
            return "";
        }
        String comm = "";  //common value to check
        String longestcomm = "";  // longest common prefix
        for(int a = 0; a < strs[0].length(); a++) {  //just going off the first string for ease of use purposes.
            comm = comm.concat(String.valueOf(strs[0].charAt(a)));  // add next letter to comm check
            //System.out.println(comm);
            for(int i = 0; i < strs.length; i++) {  //go through list of strings
                if(strs[i].length() == 0) {  // instant return if any length 0 strings
                    return "";
                }
                for(int j = 0; j < comm.length(); j++) {  // iterate through string based on comm value
                    if(comm.length() > strs[i].length()) {  // check if our comm is longer than string.  if so we are done.
                        //System.out.println("longer");
                        return longestcomm;
                    }
                    if(String.valueOf(comm.charAt(j)).equals(String.valueOf(strs[i].charAt(j)))){  //if common
                    // do nothing if common         
                    }
                    else {  //if not common, return what we have so far as longest
                        //System.out.println("not common");
                        return longestcomm;
                    }
                }
            }
            longestcomm = comm;  //update longest comm since we have passed this round
            //System.out.println(comm.length());
        }    
        return longestcomm;
    }
}
