public class Solution {
  public int islandPerimeter(int[][] grid) {
    ArrayDeque<Integer> foo = new ArrayDeque<Integer>();
    ArrayDeque<Integer> bar = new ArrayDeque<Integer>();
    int lf = grid.length;
    int lb = grid[0].length;
    boolean[][] m = new boolean[lf][lb];
    int result = 0;
    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[0].length; j++) {
        if (grid[i][j] == 1) {
          foo.addLast(i);
          bar.addLast(j);
          m[i][j] = true;
          break; // found an initial point.
        }
      }
    } // for 1

    while (!foo.isEmpty()) {
      int hoge = foo.pollFirst();
      int piyo = bar.pollFirst();
      if (hoge > 0) {
        if (grid[hoge-1][piyo] == 1) {
          if (!m[hoge-1][piyo]) {
            foo.addLast(hoge-1);
            bar.addLast(piyo);
            m[hoge-1][piyo] = true;  
          }
        } else {
          result++;
        }
      } else {
          result++;
      }
      if (hoge < lf-1) {
        if (grid[hoge+1][piyo] == 1) {
          if (!m[hoge+1][piyo]) {
            foo.addLast(hoge+1);
            bar.addLast(piyo);
            m[hoge+1][piyo] = true;  
          }
        } else {
          result++;
        }
      } else {
          result++;
      }
      if (piyo > 0) {
        if (grid[hoge][piyo-1] == 1) {
          if (!m[hoge][piyo-1]) {
            foo.addLast(hoge);
            bar.addLast(piyo-1);
            m[hoge][piyo-1] = true;  
          }
        } else {
          result++;
        }
      } else {
          result++;
      }
      if (piyo < lb-1) {
        if (grid[hoge][piyo+1] == 1) {
          if (!m[hoge][piyo+1]) {
            foo.addLast(hoge);
            bar.addLast(piyo+1);
            m[hoge][piyo+1] = true;  
          }
        } else {
          result++;
        }
      } else {
          result++;
      }
    }

    return result;
  }
}