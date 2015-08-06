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
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        if (root == null)
            return result;
       
        TreeNode temp = root;
        while(!stack.empty() || temp != null) {
            if (temp != null) {
                stack.push(temp);
                temp = temp.left;
            }
            else {
                TreeNode node = stack.pop();
                result.add(node.val);
                temp = node.right;
            }
        }
        return result;
    }
}