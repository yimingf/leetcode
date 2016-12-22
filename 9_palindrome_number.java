public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) { // negative number
            return false;
        } else if (x < 10) {
            return true;
        } else {
            int div = 1;
            while (x / div >= 10) {
                div *= 10;
            }
            while (x != 0) {
                int l = x / div;
                int r = x % 10;
                if (l != r) {
                    return false;
                }
                x = (x % div) / 10;
                div /= 100;
            }
            
            return true;
        }
    }
};