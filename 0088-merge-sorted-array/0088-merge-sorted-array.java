class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int mIndex = m - 1;
        int nIndex = n - 1;
        int kIndex = m + n - 1;

        while (nIndex >= 0) {
            if (mIndex >=0 && nums1[mIndex] >= nums2[nIndex]) {
                nums1[kIndex] = nums1[mIndex];
                mIndex--;
            } else {
                nums1[kIndex] = nums2[nIndex];
                nIndex--;
            }
            kIndex--;
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna