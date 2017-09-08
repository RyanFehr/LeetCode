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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Stack<TreeNode> stack = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        if(p != null) stack.push(p);
        if(q != null) stack2.push(q);
        if(stack.size() != stack2.size()) return false;
        while(!stack.isEmpty() && !stack2.isEmpty()) {
            TreeNode current = stack.pop();
            TreeNode current2 = stack2.pop();
            if(current.val != current2.val) return false;
            if(current.left != null) stack.push(current.left);
            if(current2.left != null) stack2.push(current2.left);
            if(stack.size() != stack2.size()) return false;
            if(current.right != null) stack.push(current.right);
            if(current2.right != null) stack2.push(current2.right);
            if(stack.size() != stack2.size()) return false;
        }
            return true;
    }
}