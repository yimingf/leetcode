public class Solution {
    public int addDigits(int num) {
        int foo = (int)Math.floor((num - 1) / 9);
        return num - 9 * foo;
        //return num - Math.floor((double)(num - 1) / 9);
    }
}