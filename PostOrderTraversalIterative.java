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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if (root == null) return result;
        stack.push(root);
        while (!stack.empty()) {
            TreeNode node = stack.peek();
            if (node.left == null && node.right == null) {
                TreeNode toAdd = stack.pop();
                result.add(toAdd.val);
            } else if (node.left == null && node.right != null) {
                stack.push(node.right);
                node.right = null;
            } else {
                stack.push(node.left);
                node.left = null;
            }
        }
        return result;
    }
}