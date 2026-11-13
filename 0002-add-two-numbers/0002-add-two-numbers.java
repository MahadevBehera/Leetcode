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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode p = result;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int firstDigit = (l1 != null) ? l1.val : 0;
            int secondDigit = (l2 != null) ? l2.val : 0;

            int sum = firstDigit + secondDigit + carry;
            int digit = sum % 10;
            carry = sum / 10;

            ListNode node = new ListNode(digit);
            p.next = node;
            p = node;

            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }

        return result.next;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna