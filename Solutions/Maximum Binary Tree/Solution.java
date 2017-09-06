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
    public TreeNode constructMaximumBinaryTree(int[] nums) {      
        return buildTree(0, nums.length, nums);
    }
    
    public static TreeNode buildTree(int start, int end, int[] nums) {
        if(start >= end) {
          return null;  
        } 
            
        // Find the max in the array
        int maxIndex = start;
        int maxValue = nums[start];
        for(int i = start; i < end; i++) {
            if(nums[i] > maxValue) {
                maxIndex = i;
                maxValue = nums[i];
            }
        }
        // Make it the root and return
        TreeNode root = new TreeNode(maxValue);
        root.left = buildTree(start, maxIndex, nums);
        root.right = buildTree(maxIndex+1, end, nums);
        return root;
    }
}