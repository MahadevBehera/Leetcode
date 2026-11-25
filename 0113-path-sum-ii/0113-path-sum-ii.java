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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        hasPathSum(root, targetSum, result, path);
        return result;
    }

    public void hasPathSum(TreeNode root, int targetSum, List<List<Integer>> result, List<Integer> path) {
        if (root == null) {
            return;
        }

        // Add current node's value to path
        path.add(root.val);

        // If it's a leaf and node's value equals targetSum, add path to result
        if (root.left == null && root.right == null && targetSum == root.val) {
            result.add(new ArrayList<>(path));
        }

        hasPathSum(root.left, targetSum - root.val, result, path);
        hasPathSum(root.right, targetSum - root.val, result, path);

        // Backtrack: remove current node from path
        path.remove(path.size() - 1);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna