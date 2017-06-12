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
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        Queue<TreeNode> nodes = new LinkedList<TreeNode>();
        nodes.add(root);
        
        int depth = 0;
        while(!nodes.isEmpty()){
            int size = nodes.size();
            depth++;
            while(size > 0){
                TreeNode cur = nodes.poll();
                if(cur.right == null && cur.left == null) return depth;
                if(cur.left != null) nodes.add(cur.left);
                if (cur.right != null) nodes.add(cur.right);
                size--;
            }
        }
        
        return -1;
        
    }
}