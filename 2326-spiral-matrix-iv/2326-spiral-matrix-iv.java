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
        int[][] result = new int[m][];
        for (int i = 0; i < m; i++) {
            result[i] = new int[n];
            Arrays.fill(result[i], -1);
        }
        // 4 pointer
        int top = 0;
        int bottom = m - 1;
        int left = 0;
        int right = n - 1;

        while (head != null) {
            // move left -> right
            for (int i = left; i <= right && head != null; i++) {
                result[top][i] = head.val;
                head = head.next;
            }
            top++;

            // move top -> bottom 
            for (int i = top; i <= bottom && head != null; i++) {
                result[i][right] = head.val;
                head = head.next;
            }
            right--;

            // move right -> left
            for (int i = right; i >= left && head != null; i--) {
                result[bottom][i] = head.val;
                head = head.next;
            }
            bottom--;

            // move bottom -> top
            for (int i = bottom; i >= top && head != null; i--) {
                result[i][left] = head.val;
                head = head.next;
            }
            left++;
        }

        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna