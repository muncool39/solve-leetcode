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
    int max = 0;
    public int maxDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        findMaxDepth(root, 0);
        return max;
    }

    private void findMaxDepth(TreeNode root, int depth) {
        if(root == null) {
            max = (depth > max) ? depth : max;
            return;
        }
        findMaxDepth(root.left, depth + 1);
        findMaxDepth(root.right, depth + 1);
    }
}