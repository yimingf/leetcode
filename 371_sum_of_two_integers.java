import java.lang.Math;

public class Solution {
  public static int getSum (int a, int b){
    int foo = 0;
    while (b != 0) {
      foo = (a & b);
      a = a^b;
      b = foo<<1;
    }
    return a;
  }
}