import java.lang.Math;

public class Solution {
  public int rangeBitwiseAnd(int m, int n) {
    if (m == n || m == 0) { // assume m <= n
      return m;
    }
    int foo = 0;
    while (m != n) {
      m = m>>1;
      n = n>>1;
      foo++;
    }
    return m<<foo;
  }
}