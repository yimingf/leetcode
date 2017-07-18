import java.lang.Math;

public class Solution {
  public int search(int[] nums, int target) {
    if (nums.length == 0) {
      return -1;
    }
    int foo = nums[0];
    if (target == foo) {
      return 0;
    } else if (target > foo) { // target > nums[0].
      for (int i = 1; i < nums.length; i++) {
        if (target == nums[i]) {
          return i;
        } else if (target < nums[i]) {
          return -1;
        }
      }
    } else { // target < nums[0].
      for (int i = nums.length-1; i > 0; i--) {
        if (target == nums[i]) {
          return i;
        } else if (target > nums[i]) {
          return -1;
        }
      }
       
    }

    return -1;
  }
}