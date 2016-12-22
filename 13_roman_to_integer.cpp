int romanToIntegerSingle(char roman) {
	if (roman == 'I') {
		return 1;
	}
	if (roman == 'V') {
		return 5;
	}
	if (roman == 'X') {
		return 10;
	}
	if (roman == 'L') {
		return 50;
	}
	if (roman == 'C') {
		return 100;
	}
	if (roman == 'D') {
		return 500;
	}
	if (roman == 'M') {
		return 1000;
	}
}

class Solution {
public:
    int romanToInt(string s) {
		int foo = 0;
		for (int i = 0; i < s.length(); i++) {
			if (i == s.length()-1) {
				foo += romanToIntegerSingle(s[i]);
				break;
			}
			else if ((s[i]=='I') & (s[i+1]=='V')) {
				foo += 4;
				i++;
			}
			else if ((s[i]=='I') & (s[i+1]=='X')) {
				foo += 9;
				i++;
			}
			else if ((s[i]=='X') & (s[i+1]=='L')) {
				foo += 40;
				i++;
			}
			else if ((s[i]=='X') & (s[i+1]=='C')) {
				foo += 90;
				i++;
			}
			else if ((s[i]=='C') & (s[i+1]=='D')) {
				foo += 400;
				i++;
			}
			else if ((s[i]=='C') & (s[i+1]=='M')) {
				foo += 900;
				i++;
			}
			else {
				foo += romanToIntegerSingle(s[i]);
			}
		}
		return foo;
    }
};