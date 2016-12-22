import java.lang.Math;

public class Solution {
    public int maxArea(int[] height) {
        int l = 0, r = height.length - 1, area = 0;

        while (l < r) {
            int foo = height[l];
            int bar = height[r];
            area = Math.max(area, (r - l) * Math.min(foo, bar));
            if (foo < bar) {
                l++;
            } else {
                r--;
            }
        }

        return area;
    }
};