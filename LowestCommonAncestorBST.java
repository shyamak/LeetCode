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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode temp = root;
        if (temp.val > p.val && temp.val < q.val) {
            return temp;  
        } else if (temp.val > p.val && temp.val > q.val){
            return lowestCommonAncestor(root.left, p, q);
        } else if (temp.val < p.val && temp.val < q.val){
            return lowestCommonAncestor(root.right, p, q);
        }
        return root;
    }
}