public class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n == 1 || n == 2) {
            return true;
        } else if (n%2 == 1 || n == 0) {
            return false;
        } else {
            return isPowerOfTwo(n/2);
        }
    }
}