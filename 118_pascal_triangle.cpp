class Solution {
public:
    vector<vector<int> > generate(int numRows) {
	    vector<vector<int> > solution;
		if (!numRows) { return solution; }
		vector<int> vectFoo;
		vectFoo.push_back(1);
		solution.push_back(vectFoo);
		if (numRows <= 1) { return solution; }

		for (int i = 1; i < numRows; i++) {
			vector<int> foo;
			// codes goes here.
			foo.push_back(1);
			for (int j = 1; j < i; j++) {
				int bar = solution[i-1][j-1];
				int baz = solution[i-1][j];
				foo.push_back(bar+baz);
				cout << "inserting " << bar+baz << endl;
			}
			foo.push_back(1);
			solution.push_back(foo);
		}
		cout << "solution's size: " << solution.size() << endl;
		return solution;
    }
	
};
