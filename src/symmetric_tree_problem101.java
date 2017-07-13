/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return isMirror(root.right , root.left);
    }
    public boolean isMirror(TreeNode right , TreeNode left){
        if(right == null && left == null) return true;
        if(right == null || left == null) return false;
        return (right.val==left.val) && isMirror(right.left , left.right) && isMirror(left.left , right.right);
    }
}