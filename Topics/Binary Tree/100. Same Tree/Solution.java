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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Queue<TreeNode> pque = new LinkedList<>();
        Queue<TreeNode> qque = new LinkedList<>();
        pque.add(p);
        qque.add(q);
        while(!pque.isEmpty() && !qque.isEmpty()) {
            TreeNode pn = pque.poll();
            TreeNode qn = qque.poll();
            if(pn == null && qn != null || pn != null && qn == null) {
                return false;
            }
            if(pn != null && qn != null){
                if (pn.val != qn.val){
                    return false;
                }else{
                    pque.add(pn.left);
                    pque.add(pn.right);
                    qque.add(qn.left);
                    qque.add(qn.right);
                }
            }
        }
        return true;
    }
}