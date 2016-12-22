import java.lang.Math;

public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int result = 0;
        int abs = Integer.MAX_VALUE;
     
        if(nums == null) {
            return result;
        } else if (nums.length < 4) {
            for (int i = 0; i < nums.length; i++) {
                result += nums[i];
            }
            return result;
        }
     
        Arrays.sort(nums);
        int length = nums.length;
     
        for(int i = 0; i < length-2; i++){
            if (i != 0 && nums[i] == nums[i-1]) {
                continue;
            }
            int foo = nums[i];
            if (abs != Integer.MAX_VALUE && foo > target) { // no possible solutions anymore
                break;
            } else {
                int j = i+1;
                int k = length-1;
     
                while (j<k) {
                    int bar = foo+nums[j]+nums[k];
                    int baz = Math.abs(bar-target);
                    if (baz == 0) { // perfect solution
                        return bar;
                    } else if (baz < abs) {
                        result = bar;
                        abs = baz;
                    }
 
                    // cannot remove duplicate like 3sum does
                    // since a+b+b need to be considered
 
                    if (bar < target) {
                        j++;
                    } else if (bar > target) {
                        k--;
                    }
                }
            } // if
        } // for
     
        return result;
    }
}