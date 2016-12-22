public class Solution {
    public int reverse(int x) {
        long result = 0;
        while (x != 0) {
            result = result * 10 + x % 10;
            x /= 10;
        }
        if (result >= 2147483647 || result <= -2147483647) {
            return 0;
        } else {
            return (int)result;
        }
    }

    public static void main (String[] args) {
        Solution s = new Solution();
        System.out.println(s.reverse(-321));
    }
};