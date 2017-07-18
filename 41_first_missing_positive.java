import java.lang.Math;

public class Solution {
  public int[] maxSlidingWindow(int[] nums, int k) {
    int k = 0;
    int v = nums[0];
    for (int i = 1; i < k; i++) {
      if (nums[i] > v) {
        k = i;
        v = nums[i];
      }
    } // first window

    for (int i = 1; i < k; i++) {
      if (k <= i) { // key inside the window
        if (nums[i+k-1] > v) {
          k = i+k-1;
          v = nums[i+k-1];
        }
      } else { // key outside the window. try to re-sort.
        k = i;
        v = nums[i];
        for (int j = i+1; j < i+k; j++) {
          if (nums[j] > v) {
            k = j;
            v = nums[j];
          }
        }
      }
    }
  }
}