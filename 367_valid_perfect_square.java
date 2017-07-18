import java.lang.Math;

public class Solution {
  public boolean isPerfectSquare(int num) {
    return (num == (int)Math.pow((int)Math.sqrt(num), 2));
  }
}