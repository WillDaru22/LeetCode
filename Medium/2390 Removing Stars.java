// For the problem at https://leetcode.com/problems/removing-stars-from-a-string/description/

class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();  // approaching this by using a stack to solve this
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '*') {  // check for a star
                stack.pop();  // remove the last item from the stack since we found a star
            }
            else {  // no star
                stack.push(c);  // add to the stack
            }
        }
        String new_s = "";
        int size_st = stack.size();
        for(int i = 0; i < size_st; i++) {
            new_s = stack.pop() + new_s;  // reverse the stack here to reconstruct the string
        }
        return new_s;
    }
}
