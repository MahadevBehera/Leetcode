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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> zigZagList = new ArrayList<>();
        if (root == null) {
            return zigZagList;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean reverse = false;

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> level = new ArrayList<>();
            Stack<Integer> reverseStack = new Stack<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();

                // check flag
                if (reverse) {
                    reverseStack.add(node.val);
                } else {
                    level.add(node.val);
                }

                if (node.left != null)
                    queue.add(node.left);
                if (node.right != null)
                    queue.add(node.right);
            }
            reverse = !reverse;

            while (!reverseStack.isEmpty()) {
                level.add(reverseStack.pop());
            }

            zigZagList.add(level);
        }

        return zigZagList;
    }

    /*
    Time : O(n)
    Space : O(n)
    */
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna