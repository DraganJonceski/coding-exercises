class Palindrome Number {
    public boolean isPalindrome(int x) {
        // Negative numbers are not palindromes
        if (x < 0) {
            return false;
        }
        
        int original = x;
        int reversed = 0;
        
        while (x != 0) {
            int digit = x % 10;
            // Check for integer overflow? But since input is integer, and we are reversing, 
            // if it is a palindrome it won't overflow. But for general reversal, we should check.
            reversed = reversed * 10 + digit;
            x /= 10;
        }
        
        return original == reversed;
    }
}