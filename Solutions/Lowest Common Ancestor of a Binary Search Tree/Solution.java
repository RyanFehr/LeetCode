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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode PSearch = root;
        TreeNode QSearch = root;
        TreeNode SharedAncestor = root;
        while(PSearch.val == QSearch.val) {
            if(PSearch.val < p.val) {
                PSearch = PSearch.right;
            }
            else if(PSearch.val == p.val){
                break;
            }
            else {
                PSearch = PSearch.left;
            }
            if(QSearch.val < q.val) {
                QSearch = QSearch.right;
            }
            else if(QSearch.val == q.val){
                break;
            }
            else {
                QSearch = QSearch.left;
            }
            if(PSearch == null || QSearch == null) break;
            if(PSearch.val == QSearch.val) {
                SharedAncestor = PSearch;
            } 
        }
        return SharedAncestor;
    }
}