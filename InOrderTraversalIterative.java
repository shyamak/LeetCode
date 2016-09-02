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
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if (root == null) return result;
        TreeNode l = root;
        while (!stack.empty() || l != null) {
            if (l != null) {
                stack.push(l);
                l = l.left;
            } else {
                TreeNode toAdd = stack.pop();
                result.add(toAdd.val);
                l = toAdd.right;
            }
        }
        return result;
    }
}