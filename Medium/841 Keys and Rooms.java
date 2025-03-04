// For the problem at: https://leetcode.com/problems/keys-and-rooms/

class Solution {
    public void dfs(List<List<Integer>> n_rooms, boolean[] visits, int roomkey) {  // usings a recursive DFS approach to solve this problem
        for(int room : n_rooms.get(roomkey)) {
            if(!visits[room]) {
                visits[room] = true;
                dfs(n_rooms, visits, room);
            }
        }
    }

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] room_visited = new boolean[rooms.size()];
        room_visited[0] = true;
        dfs(rooms, room_visited, 0);
        for(int i = 0; i < rooms.size(); i++) {
                if(!room_visited[i]) {
                    return false;
                }
        }
        return true;
    }
}
