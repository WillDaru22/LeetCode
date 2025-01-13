// For https://leetcode.com/problems/valid-parentheses/
class Solution {
    public boolean isValid(String s) {
        char prev = s.charAt(0);
        ArrayList<Integer> order = new ArrayList<Integer>();  //track order of open.  ( = 0 { = 1 [ = 2
        for(int i = 0; i < s.length(); i++) {
            if((s.charAt(i)) == ('(')) {
                order.add(0);
            }
            else if((s.charAt(i)) == ('{')) {
                order.add(1);
            }
            else if((s.charAt(i)) == ('[')) {
                order.add(2);
            }
            else {
                if(prev == ('(')) {
                    if((s.charAt(i)) == (')')) {
                        order.remove(order.size()-1);
                    }
                    else {
                        //System.out.println("Invalid )");
                        return false;
                    }
                }
                else if(prev == ('{')) {
                    if((s.charAt(i)) == ('}')) {
                        order.remove(order.size()-1);
                    }
                    else {
                        //System.out.println("Invalid }");
                        return false;
                    }
                }
                else if(prev == ('[')) {
                    if((s.charAt(i)) == (']')) {
                        order.remove(order.size()-1);
                    }
                    else {
                        //System.out.println("Invalid ]");
                        return false;
                    }
                }
                else {
                    if(order.size() < 1) {
                        return false;
                    }
                    //System.out.println(s.charAt(i));
                    if(order.get(order.size()-1) == 0) {
                        if((s.charAt(i)) == (')')) {
                            order.remove(order.size()-1);
                        }
                        else {
                            //System.out.println("Invalid ) order");
                            return false;
                        }
                    }
                    else if(order.get(order.size()-1) == 1) {
                        if((s.charAt(i)) == ('}')) {
                            order.remove(order.size()-1);
                        }
                        else {
                            //System.out.println("Invalid } order");
                            return false;
                        }
                    }
                    else if(order.get(order.size()-1) == 2) {
                        if((s.charAt(i)) == (']')) {
                            order.remove(order.size()-1);
                        }
                        else {
                            //System.out.println("Invalid ] order");
                            return false;
                        }
                    }
                    else {
                        //System.out.println("Invalid area reached");
                        return false;
                    }
                }
            }
            prev = s.charAt(i);
        }
        if(order.size() > 0) {
            return false;
        }
        return true;
    }
}
