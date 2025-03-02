// For the problem located at https://leetcode.com/problems/add-binary/description/

class Solution {
    public String addBinary(String a, String b) {
        int i = a.length()-1;
        int j = b.length()-1;
        int carry = 0;
        StringBuilder binary = new StringBuilder();
        while(i >= 0 && j >= 0) {
            if(a.charAt(i) == '1') {  // a = 1
                if(b.charAt(j) == '1') {
                    if(carry > 0) {  // add a '1' to string, dont change carry
                        binary.append('1');
                        
                    }
                    else {  // add a '0' to string, increment carry
                        binary.append('0');
                        carry++;
                    }
                }
                else {
                    if(carry > 0) {  // add a 0 to string, dont change carry
                        binary.append('0');
                    }
                    else {  // add a 1 to string, dont change carry
                        binary.append('1');
                    }
                }
            }
            else {  // a = 0
                if(b.charAt(j) == '1') {
                    if(carry > 0) {  // add a '0' to string, dont change carry
                        binary.append('0');
                    }
                    else {  // add a '1' to string, dont change carry
                        binary.append('1');
                    }
                }
                else {
                    if(carry > 0) {  // add a 1 to string, decrement change carry
                        binary.append('1');
                        carry--;
                    }
                    else {  // add a 0 to string, dont change carry
                        binary.append('0');
                    }
                }
            }
            i--;
            j--;
        }
        if(i >= 0) {  // if a is left
            while(i >= 0) {
                if(a.charAt(i) == '1') {
                    if(carry > 0) {
                        binary.append('0');
                    }
                    else {
                        binary.append('1');
                    }
                }
                else {
                    if(carry > 0) {
                        binary.append('1');
                        carry--;
                    }
                    else {
                        binary.append('0');
                    }
                }
                i--;
            }
        }
        if(j >= 0) {  // if b is left
            while(j >= 0) {
                if(b.charAt(j) == '1') {
                    if(carry > 0) {
                        binary.append('0');
                    }
                    else {
                        binary.append('1');
                    }
                }
                else {
                    if(carry > 0) {
                        binary.append('1');
                        carry--;
                    }
                    else {
                        binary.append('0');
                    }
                }
                j--;
            }
        }
        while(carry > 0) {
            binary.append('1');
            carry--;
        }
        binary = binary.reverse();  // reverse since we inserted in reverse order
        return binary.toString();
    }
}
