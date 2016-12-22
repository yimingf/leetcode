import java.lang.Math;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0 || strs[0].length() == 0) {
            return "";
        } else if (strs.length == 1) {
            return strs[0];
        }

        String s = strs[0];
        for (int i = 1; i < strs.length; i++) {
            int foo = 0;
            while (foo < strs[i].length() && foo < s.length() && s.charAt(foo) == strs[i].charAt(foo)) {
                foo++;
            }
            s = s.substring(0, foo);
        }
        return s;
    }
};