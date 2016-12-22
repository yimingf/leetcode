class Solution {

public:
    vector<int> getRow(int rowIndex) {
	    vector<int> solution;
		//if (!rowIndex) { return solution; }
		solution.push_back(1);
		if (!rowIndex) { return solution; }

		for (int i = 1; i <= rowIndex; i++) {
			vector<int> foo;
			// codes goes here.
			foo.push_back(1);
			for (int j = 1; j < i; j++) {
				int bar = solution[j-1];
				int baz = solution[j];
				foo.push_back(bar+baz);
				cout << "inserting " << bar+baz << endl;
			}
			foo.push_back(1);
			solution = foo;
		}
		cout << "solution's size: " << solution.size() << endl;
		return solution;
    }
	
};