// by ccpizzadaisuki, written 141121

#include <iostream>
#include <string>
#include <cstdlib>

using namespace std;


class MinStack {

private:

    int stack[70000];
    int stackMin[70000];

    int size;
    int sizeMin;

public:

    MinStack() {
	size = 0;
	sizeMin = 0;
    }
    
    void push(int op) {
	stack[size] = op;
	size++;
	if (!sizeMin) {
	    stackMin[0] = op;
	    sizeMin++;
	}
	else if (op <= stackMin[sizeMin-1]) {
	    stackMin[sizeMin] = op;
	    sizeMin++;
	}
    }

    void pop() {
	if (stack[size-1] == stackMin[sizeMin-1]) {
	    sizeMin--;
	}
	size--;
    }

    int top() {
	return stack[size-1];        
    }


    int getMin() {
	return stackMin[sizeMin-1];
    }
};