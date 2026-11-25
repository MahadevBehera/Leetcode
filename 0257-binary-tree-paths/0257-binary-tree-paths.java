/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        traverse(root, new StringBuilder(), result);
        return result;
    }

    public void traverse(TreeNode root, StringBuilder path, List<String> result) {
        if(root == null) {
            return;
        }

        int len=path.length();
        path.append(root.val);

        if (root.left == null && root.right == null) {
            result.add(path.toString());
        }

        path.append("->");
        traverse(root.left, path, result);
        traverse(root.right, path, result);

        // Backtrack: remove current node from path
        path.setLength(len);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna