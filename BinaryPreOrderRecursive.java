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
    
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root != null)
            preOrderHelper(root);

        return result;
    }
    
    public void preOrderHelper(TreeNode node) {
        result.add(node.val);
        
        if (node.left != null)
            preOrderHelper(node.left);
        
        if (node.right != null)
            preOrderHelper(node.right);
    }
}