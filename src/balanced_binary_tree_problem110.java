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
    private boolean result = true;
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        depth(root);
        return result;
    }
    public int depth(TreeNode root){
        if(root == null) return 0;
        int rightDepth = depth(root.right);
        int leftDepth = depth(root.left);
        if(Math.abs(rightDepth-leftDepth) > 1){
            result = false;
        } 
        return 1+Math.max(rightDepth , leftDepth);
    }
}
public class Solution {
    private boolean result = true;
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        int rightDepth = depth(root.right);
        int leftDepth = depth(root.left);
        
        return Math.abs(rightDepth-leftDepth) <=1 && isBalanced(root.right) && isBalanced(root.left);
    }
    public int depth(TreeNode root){
        if(root == null) return 0;
        int rightDepth = depth(root.right);
        int leftDepth = depth(root.left);
        return 1+Math.max(rightDepth , leftDepth);
    }
}