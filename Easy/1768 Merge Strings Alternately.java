// For https://leetcode.com/problems/merge-strings-alternately/description/

class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder str = new StringBuilder();  // solution using StringBuilder
        for(int i = 0; i < word1.length(); i++) {
            str = str.append(word1.charAt(i));  // add char of word 1 first
            if(i < word2.length()) {  // add char of word 2 next if there is still word 2 to add
                str = str.append(word2.charAt(i));
            }
        }
        for(int i = word1.length(); i < word2.length(); i++) {  // adding rest of word 2 to our str at the end if its longer
            str = str.append(word2.charAt(i));
        }
        return str.toString();  // return a string from our stringbuilder
    }
}

/*  Another initial much slower solution not using Stringbuilder, same idea as the above faster solution

class Solution {
    public String mergeAlternately(String word1, String word2) {
        String str = new String();
        for(int i = 0; i < word1.length(); i++) {
            str = str + word1.charAt(i);
            if(i < word2.length()) {
                str = str + word2.charAt(i);
            }
        }
        for(int i = word1.length(); i < word2.length(); i++) {
            str = str + word2.charAt(i);
        }
        return str;
    }
}

*/
