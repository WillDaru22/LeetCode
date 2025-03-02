// For the problem at https://leetcode.com/problems/maximum-depth-of-binary-tree/description/

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
    public int maxDepth(TreeNode root) {  // using a recursive solution
        if(root == null) {  // base case
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        if(left > right) {
            return left + 1;
        }
        else {
            return right + 1;
        }
    }
}
