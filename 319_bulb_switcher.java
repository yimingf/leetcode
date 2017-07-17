import java.lang.Math;

public class Solution {
  public int bulbSwitch(int n) {
    return (int)Math.floor(Math.sqrt(n));
  }

  public static void main(String[] args) {
    Solution s = new Solution();
    System.out.println(s.myPow(3.0, 2));
  }
}