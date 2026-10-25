/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] result = new int[m][n];
        for (int i = 0; i < m; i++) {
            Arrays.fill(result[i], -1);
        }
        // 4 pointer
        int top = 0;
        int bottom = m - 1;
        int left = 0;
        int right = n - 1;

        while (head != null) {
            // move left -> right
            for (int i = left; i <= right; i++) {
                if (head != null) {
                    result[top][i] = head.val;
                    head = head.next;
                }
            }
            top++;

            // move top -> bottom 
            for (int i = top; i <= bottom; i++) {
                if (head != null) {
                    result[i][right] = head.val;
                    head = head.next;
                }
            }
            right--;

            // move right -> left
            if (top <= bottom) { // if only 1 row is there, then it's already covered by left to right
                for (int i = right; i >= left; i--) {
                    if (head != null) {
                        result[bottom][i] = head.val;
                        head = head.next;
                    }
                }
                bottom--;
            }

            // move bottom -> top
            if (left <= right) { // if only 1 column is there, then it's already covered by top to bottom
                for (int i = bottom; i >= top; i--) {
                    if (head != null) {
                        result[i][left] = head.val;
                        head = head.next;
                    }
                }
                left++;
            }
        }

        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna