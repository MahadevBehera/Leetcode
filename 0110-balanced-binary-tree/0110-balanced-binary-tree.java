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
    public boolean isBalanced(TreeNode root) {
        // Base case, when no node then return true
        /*
        if (root == null) {
            return true;
        }
        
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        
        if (Math.abs(leftHeight - rightHeight) > 1) {
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
        */
        return height(root) != -1;
    }

    private int height(TreeNode root) {
        // Base case, if there is no node then height is zero
        if (root == null) {
            return 0;
        }
        int leftHeight = height(root.left);
        if (leftHeight == -1) {
            return -1;
        }
        int rightHeight = height(root.right);
        if (rightHeight == -1) {
            return -1;
        }

        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        }

        return Math.max(leftHeight, rightHeight) + 1; // +1 for adding current node also 
    }

    // Time => O(n^2) // for each node we do work on (n-1),
    // so work => n, (n-1), (n-2), (n-3),.....1 
    // till 1, so sum of n natural numbers = (n*(n+1))/2 => O(n^2)
    // Space => O(h) => h is max height of Tree
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna