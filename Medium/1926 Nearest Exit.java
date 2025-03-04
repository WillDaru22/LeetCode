// For the problem at https://leetcode.com/problems/nearest-exit-from-entrance-in-maze/description/

class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
        int rows = maze.length;
        int columns = maze[0].length;

        Queue<int[]> q = new LinkedList<>();  // using a queue as our tracker here
        q.add(entrance);
        maze[entrance[0]][entrance[1]] = '+';
        
        int[][] directions = new int[][] {{0,1},{0,-1},{1,0},{-1,0}};

        int step = 0;
        int x;
        int y;

        while(q.isEmpty() == false) {
            step++;

            int n = q.size();

            for(int i = 0; i < n; i++) {
                int[] curr = q.poll();

                for (int[] dir : directions) {
                    x = curr[0] + dir[0];
                    y = curr[1] + dir[1];

                    if (x < 0 || x >= rows || y < 0 || y >= columns) {
                        continue;
                    }
                    if (maze[x][y] == '+') {
                        continue;
                    }
                    if (x == 0 || x == rows - 1 || y == 0 || y == columns - 1) {
                        return step;
                    }

                    maze[x][y] = '+';
                    q.add(new int[]{x, y});
                }
            }
        }
        return -1;  // no path found
    }
}
