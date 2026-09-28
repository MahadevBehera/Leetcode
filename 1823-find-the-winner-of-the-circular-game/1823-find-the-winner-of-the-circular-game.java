class Solution {
    public int findTheWinner(int n, int k) {
        // formula for start with 1st --> josephus(n,k) = (josephus(n−1,k)+k−1) % n + 1
        // formula for start with 0th --> josephus(n,k) = (josephus(n−1,k)+k) % n
        /* The position returned by josephus(n - 1, k)
           is adjusted because the recursive call
           josephus(n - 1, k) considers the original
           position k%n + 1 as position 1 
        */
        if (n == 1)
            return 1;
        return ((findTheWinner(n - 1, k)) + (k - 1)) % n + 1;
        /*
        return josephus(n, k) + 1; // if we will use 0th based function to calculate then add 1.
        */
    }

    /* 
    Below function for 0th index based, start from 0th
    public int josephus(int n, int k) {
        if (n == 1)
            return 0;
        return ((josephus(n - 1, k)) + k) % n;
    }
    
    Logic :
    jos(5,3) = 3  jos(4,3) = 0  
    (k) % 5   3 <--- 0
    (k+1) % 5 4 <--- 1
    (k+2) % 5 0 <--- 2
    
    jos(n,k) = (jos(n-1, k) + k) % n
    */
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna