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
        
        int leftDepth = 1;
        int rightDepth = 1;
        if (root == null)
            return 0;
        else if (root.left == null && root.right == null)
            return 1;
        else {
                leftDepth += maxDepth(root.left);
                rightDepth += maxDepth(root.right);
        }
        return leftDepth > rightDepth ? leftDepth : rightDepth;
    }
}