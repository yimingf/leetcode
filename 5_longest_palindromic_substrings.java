public class Solution {
    public String longestPalindrome(String s) {
        int length = s.length();
        if (length == 0 || length == 1) {
            return s;
        } // trivial cases

        int foo = 0, bar = 0, left = 0, right = 0, pivot = 0;
        while (true) {
            if (foo == bar) { // start case
                if (foo == length - 1) { // right bound
                    break;
                } else { // find the common words
                    for (int i = foo; i < length; i++) {
                        if (s.charAt(foo) != s.charAt(i)) {
                            break;
                        }
                        bar = i;
                    } // for
                    pivot = bar + 1;
                } // if 2
            } // if 1

            if (foo == -1 || bar == length || s.charAt(foo) != s.charAt(bar)) { // end case
                int size = bar - foo - 2;
                if (size > right - left) {
                    left = foo + 1;
                    right = bar - 1;
                }
                if (bar == length) { // reaches the end, no longer palindromes will be detected
                    break;
                } else {
                    foo = pivot;
                    bar = pivot;
                }
            } else {
                foo--;
                bar++;
            }
        }

        //System.out.println(right);
        return s.substring(left, right+1);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.longestPalindrome(new String("a")));
    }
}