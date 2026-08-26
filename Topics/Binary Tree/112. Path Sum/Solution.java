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
import java.util.*;
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) {
            return false;
        }
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);
        while(!que.isEmpty()) {
            TreeNode node = que.poll();
            int n_val = node.val;
            if(node.left == null && node.right == null) {
                if(n_val == targetSum) {
                    return true;
                }
                continue;
            }
            if(node.left != null) {
                node.left.val += n_val;
                que.add(node.left);
            }
            if(node.right != null) {
                node.right.val += n_val;
                que.add(node.right);
            }
        }
        return false;
    }
}