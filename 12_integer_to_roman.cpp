class Solution {
public:
    string intToRoman(int num) {
        int foo = 0;
        string str;
        if (num >= 1000) {
        	foo = num / 1000;
        	num -= foo * 1000;
        	if (foo == 1) {
        		str.append("M");
        	}
        	if (foo == 2) {
        		str.append("MM");
        	}
        	if (foo == 3) {
        		str.append("MMM");
        	}
        }
        if (num >= 100) {
        	foo = num / 100;
        	num -= foo * 100;
        	if (foo == 1) {
        		str.append("C");
        	}
        	if (foo == 2) {
        		str.append("CC");
        	}
        	if (foo == 3) {
        		str.append("CCC");
        	}
        	if (foo == 4) {
        		str.append("CD");
        	}
        	if (foo == 5) {
        		str.append("D");
        	}
        	if (foo == 6) {
        		str.append("DC");
        	}
        	if (foo == 7) {
        		str.append("DCC");
        	}
        	if (foo == 8) {
        		str.append("DCCC");
        	}
        	if (foo == 9) {
        		str.append("CM");
        	}
        }
        if (num >= 10) {
        	foo = num / 10;
        	num -= foo * 10;
        	if (foo == 1) {
        		str.append("X");
        	}
        	if (foo == 2) {
        		str.append("XX");
        	}
        	if (foo == 3) {
        		str.append("XXX");
        	}
        	if (foo == 4) {
        		str.append("XL");
        	}
        	if (foo == 5) {
        		str.append("L");
        	}
        	if (foo == 6) {
        		str.append("LX");
        	}
        	if (foo == 7) {
        		str.append("LXX");
        	}
        	if (foo == 8) {
        		str.append("LXXX");
        	}
        	if (foo == 9) {
        		str.append("XC");
        	}
        }
    	foo = num;
    	if (foo == 1) {
    		str.append("I");
    	}
    	if (foo == 2) {
    		str.append("II");
    	}
    	if (foo == 3) {
    		str.append("III");
    	}
    	if (foo == 4) {
    		str.append("IV");
    	}
    	if (foo == 5) {
    		str.append("V");
    	}
    	if (foo == 6) {
    		str.append("VI");
    	}
    	if (foo == 7) {
    		str.append("VII");
    	}
    	if (foo == 8) {
    		str.append("VIII");
    	}
    	if (foo == 9) {
    		str.append("IX");
    	}
        return str;
    }
};