import java.lang.Math;

public class Solution {
  public int majorityElement(int[] nums) {
    int ths = (int)Math.floor(nums.length/2);
    HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();

    for (int i = 0; i < nums.length; i++) {
      int foo = nums[i];
      if (!m.containsKey(foo)) {
        m.put(foo, 1);
      } else {
        m.put(foo, m.get(foo)+1);
      }

      if (m.get(foo) > ths) {
        return foo;
      }
    }
    return -1;
  }
}