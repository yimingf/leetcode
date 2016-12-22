public class Solution {
    public int myAtoi(String str) {
        double result = 0;
        int flag = 0;
        boolean sign = false, isMinus = false;
        str = str.trim();

        for (int i = 0; i < str.length(); i++) {
            if (!sign) {
                if (Character.isDigit(str.charAt(i))) {
                    result = result * 10 + Character.getNumericValue(str.charAt(i));
                } else if (str.charAt(i) == '-') { // minus sign
                    isMinus = true;
                } else if (str.charAt(i) != '+') { // no plus sign, means no valid conversions
                    return 0;
                }
                sign = true;
                continue;
            }
            
            if (Character.isDigit(str.charAt(i))) {
                result = result * 10 + Character.getNumericValue(str.charAt(i));
            } else {
                break;
            }
        }

        result = isMinus ? -result : result;
        if (isMinus) {
            return (result < Integer.MIN_VALUE) ? Integer.MIN_VALUE : (int)result;
        } else {
            return (result > Integer.MAX_VALUE) ? Integer.MAX_VALUE : (int)result;
        }
    }
};