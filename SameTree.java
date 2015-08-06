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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        boolean leftResult = false;
        boolean rightResult = true;
        if (p == null && q == null)
            return true;
        else if (p == null && q != null)
            return false;
        else if (p != null && q == null)
            return false;
        else {
            if (p.val != q.val)
                return false;
            else if ( p.val == q.val) {
                leftResult = isSameTree(p.left, q.left);
                rightResult = isSameTree(p.right, q.right);
            }
            else 
                return false;
        }
        return leftResult && rightResult;
    }
}