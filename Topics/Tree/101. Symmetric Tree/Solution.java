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
    public boolean isSymmetric(TreeNode root) {
        if(root == null) {
            return true;
        }
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root.left);
        que.add(root.right);
        while(!que.isEmpty()){
            TreeNode left = que.poll();
            TreeNode right = que.poll();
            if(left == null && right != null || left != null && right == null) {
                return false;
            }
            if(left != null && right != null){
                if (left.val != right.val){
                    return false;
                }else{
                    que.add(left.left);
                    que.add(right.right);
                    que.add(left.right);
                    que.add(right.left);
                }
            }
        }
        return true;
    }
}