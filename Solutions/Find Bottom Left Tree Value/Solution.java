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
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        TreeNode lastNodeSeen = root;
        // Perform a BFS that places right child first
        while(queue.peek() != null) {
            lastNodeSeen = queue.remove(); // Set our last node seen to the one at the top of the queue
            if(lastNodeSeen.right != null) queue.add(lastNodeSeen.right); // Add right first
            if(lastNodeSeen.left != null) queue.add(lastNodeSeen.left); // Add left last 
        }
        return lastNodeSeen.val; // lastNodeSeen will be the last node we saw in our RL BFS traversal
    }
}