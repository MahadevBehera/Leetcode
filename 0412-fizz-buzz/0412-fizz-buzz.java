class Solution {
    public List<String> fizzBuzz(int n) {
        String fizz = "Fizz";
        String buzz = "Buzz";
        String fizzBuzz = fizz + buzz;
        List<String> result = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            boolean isFizz = (i % 3 == 0);
            boolean isBuzz = (i % 5 == 0);

            if (isFizz && isBuzz)
                result.add(fizzBuzz);
            else if (isFizz)
                result.add(fizz);
            else if (isBuzz)
                result.add(buzz);
            else
                result.add(i + "");
        }
        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna