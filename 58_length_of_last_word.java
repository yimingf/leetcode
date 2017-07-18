import java.lang.Math;

public class Solution {
  public int lengthOfLastWord(String s) {
    int result = 0;
    boolean flag = false;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == ' ') {
        flag = true;
      } else {
        if (flag) {
          result = 1;
          flag = false;
        } else {
          result++;
        }
      }
    }
    return result;
  }
}