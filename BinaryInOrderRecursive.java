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
    ArrayList<Integer> result = new ArrayList<Integer>();
    
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root != null)
            inOrderHelper(root);    
        return result;
    }
    
    public void inOrderHelper(TreeNode node) {
        if (node.left != null)
            inOrderHelper(node.left);
            
        result.add(node.val);
        
        if (node.right != null)
            inOrderHelper(node.right);
    }
}