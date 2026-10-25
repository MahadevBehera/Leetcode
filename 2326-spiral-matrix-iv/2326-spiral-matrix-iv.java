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
        // 4 pointer
        int top = 0;
        int bottom = m - 1;
        int left = 0;
        int right = n - 1;

        while (top <= bottom && left <= right) {
            // move left -> right
            for (int i = left; i <= right; i++) {
                int data = -1;
                if (head != null) {
                    data = head.val;
                    head = head.next;
                }
                result[top][i] = data;
            }
            top++;

            // move top -> bottom 
            for (int i = top; i <= bottom; i++) {
                int data = -1;
                if (head != null) {
                    data = head.val;
                    head = head.next;
                }
                result[i][right] = data;
            }
            right--;

            // move right -> left
            if (top <= bottom) { // if only 1 row is there, then it's already covered by left to right
                for (int i = right; i >= left; i--) {
                    int data = -1;
                    if (head != null) {
                        data = head.val;
                        head = head.next;
                    }
                    result[bottom][i] = data;
                }
                bottom--;
            }

            // move bottom -> top
            if (left <= right) { // if only 1 column is there, then it's already covered by top to bottom
                for (int i = bottom; i >= top; i--) {
                    int data = -1;
                    if (head != null) {
                        data = head.val;
                        head = head.next;
                    }
                    result[i][left] = data;
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