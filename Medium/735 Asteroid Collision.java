// For the problem at https://leetcode.com/problems/asteroid-collision/

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>(); // approaching this with a stack and list of remaining asteroids
        ArrayList<Integer> remain = new ArrayList<Integer>();
        for(int a : asteroids) {
            if(a > 0) {
                stack.push(a);
            }
            else {
                while(!stack.isEmpty() && a + stack.peek() < 0) {
                    stack.pop();
                }
                if(stack.isEmpty()) {
                    remain.add(a);
                }
                else if(a + stack.peek() == 0) {
                    stack.pop();
                }
                else {
                }
            }
        }
        int e = stack.size();
        int j = remain.size();
        for(int i = 0; i < e; i++) {
            remain.add(j, stack.pop());
        }
        int[] newAsteroids = new int[remain.size()];
        for(int i = 0; i < newAsteroids.length; i++) {
            newAsteroids[i] = remain.get(i);
        }
        return newAsteroids;
    }
}
