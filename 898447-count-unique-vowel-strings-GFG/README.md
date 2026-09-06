# [Count Unique Vowel Strings](https://www.geeksforgeeks.org/problems/count-unique-vowel-strings/1)
## Medium
You are given a lowercase string s, find the total distinct strings that can be formed using the following rules:

Identify all unique vowels (a, e, i, o, u) present in the string.
For each distinct vowel, choose exactly one of its occurrences from s. If a vowel appears multiple times, each occurrence represents a unique selection choice.
Generate all possible permutations of the selected vowels. Each unique arrangement counts as a distinct string.

Return the total number of such distinct strings.
Examples:
Input: s = "aeiou"Output: 120Explanation: Each vowel appears once, so different strings are 5! = 120.
Input: s = "ae"Output: 2Explanation: Different strings are "ae" and "ea"
Input: s = "aacidf"Output: 4 Explanation: Vowels in s are 'a' and 'i', Pick each 'a' with an 'i' and make two arrangements of all pairs "ai", "ia", "ai", "ia".
Constraints:1 ≤ s.size() ≤ 100