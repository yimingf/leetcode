public class Solution {
  public int searchInsert(int[] nums, int target) {
    for (int i = 0; i < nums.length; i++) {
      if (target <= nums[i]) {
        return i;
      }
    }
    return nums.length;
  }

  public static void main(String[] args) {
    Solution s = new Solution();
    System.out.println(s.searchInsert([3, 4, 5, 6], 2));
  }
}