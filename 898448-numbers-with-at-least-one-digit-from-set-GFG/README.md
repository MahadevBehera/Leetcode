# [Numbers With At Least One Digit from Set](https://www.geeksforgeeks.org/problems/count-numbers-containing-specific-digits/1)
## Medium
You are given an integer n representing the number of digits in a number, and an array arr[] containing digits from 0 to 9. You need to count how many n-digit positive integers can be formed such that at least one digit from the array arr[] appears in the number.
Examples:
Input: n = 1, arr[] = [1, 2, 3]Output: 3Explanation: Only the single-digit numbers [1, 2, 3] satisfy the condition.
Input: n = 2, arr[] = [3, 5]Output: 34Explanation: There are a total of 34  two digit numbers which contain at least  one out of  [3, 5].
Constraints:&nbsp; 1 ≤ n ≤ 9&nbsp; 1 ≤ arr.size() ≤ 10&nbsp; 0 ≤ arr[i] ≤ 9