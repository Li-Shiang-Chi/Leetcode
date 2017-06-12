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
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0) return null;
        return convert(0 , nums.length-1,nums);
    }
    public TreeNode convert(int left , int right , int[] nums){
        if(left > right) return null;
        int middle = (left + right) / 2;
        TreeNode root = new TreeNode(nums[middle]);
        root.right = convert(middle+1 , right , nums);
        root.left = convert(left , middle-1 , nums);
        return root;
    }
}