// For the problem at https://leetcode.com/problems/binary-tree-right-side-view/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public void bfs(TreeNode root, List<Integer> ls, int depth) {  // basically use breadth first search checking from the right
        if(root == null) {
            return;
        }
        if(depth == ls.size()) {
            ls.add(root.val);
        }
        bfs(root.right, ls, depth+1);
        bfs(root.left, ls, depth+1);
        return;
    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        bfs(root, list, 0);
        return list;
    }
}
