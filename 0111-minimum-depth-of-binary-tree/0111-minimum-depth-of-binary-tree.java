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
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        // BFS
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int depth = 1; // as already have seen first node means minimum depth is 1 for root node.

        while (!queue.isEmpty()) {
            int size = queue.size();
            // traverse level by level
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                // if the node is a leaf node 
                if (node.left == null && node.right == null) {
                    return depth; // return the depth till this node as its answer;
                }

                if (node.left != null)
                    queue.add(node.left);

                if (node.right != null)
                    queue.add(node.right);
            }

            depth++; // after traversing the nodes of a level increase the depth to move for next level
        }

        return depth;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna