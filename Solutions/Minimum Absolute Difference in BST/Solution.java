/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    int minimumAbsoluteDifference = Integer.MAX_VALUE;
    int lastSeen = Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        inorderTraversal(root);
        return minimumAbsoluteDifference;
    }
    
    public void inorderTraversal(TreeNode node) {
        if(node == null) return;
        inorderTraversal(node.left);
        minimumAbsoluteDifference = Math.min(minimumAbsoluteDifference, Math.abs(lastSeen - node.val));
        lastSeen = node.val;
        inorderTraversal(node.right);
        return;
    }
}