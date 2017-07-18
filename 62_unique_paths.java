import java.lang.Math;

public class Solution {
  public int uniquePaths(int m, int n) {
    if (m == 1 || n == 1) {
      return 1;
    } else if (m == 2 && n == 2) {
      return 2; // trivial cases.
    }

    // non-trivial cases.
    int sht = 0; // short
    int lng = 0; // long
    int foo = 0;
    int bar = 0;
    if (m <= n) {
      sht = m;
      lng = n;
    } else {
      sht = n;
      lng = m;
    }
    int[][] a = new int[lng][sht]; // array for storing unique paths.
    for (int i = 0; i < lng; i++) {
      a[i][0] = 1;
    }
    a[1][1] = 2;

    for (int i = 2; i < sht; i++) {
      for (int j = 1; j <= i; j++) {
        if (i-1>j) {
          foo = a[i-1][j];
        } else {
          foo = a[j][i-1];
        }

        if (j-1>i) {
          bar = a[j-1][i];
        } else {
          bar = a[i][j-1];
        }

        a[i][j] = foo+bar;
      }
    } // short path.

    for (int i = sht; i < lng; i++) {
      for (int j = 1; j < sht; j++) {
        if (i-1>j) {
          foo = a[i-1][j];
        } else {
          foo = a[j][i-1];
        }

        if (j-1>i) {
          bar = a[j-1][i];
        } else {
          bar = a[i][j-1];
        }

        a[i][j] = foo+bar;
      }
    }

    return a[lng-1][sht-1];
  }
}