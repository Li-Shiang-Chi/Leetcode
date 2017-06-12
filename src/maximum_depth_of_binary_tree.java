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
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        Queue<TreeNode> nodes = new LinkedList<TreeNode>();
        nodes.add(root);
        
        int count = 0;
        while(!nodes.isEmpty())
        {
            int size = nodes.size();
            while(size > 0){
                TreeNode current = nodes.poll();
                if(current.left != null) nodes.add(current.left);
                if(current.right != null) nodes.add(current.right);
                size--;
            }
            count++;
        }
        return count;
    }
}