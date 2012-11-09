///////////////////////////////////////////////////////////////////////////////
// selectionsort.cpp
///////////////////////////////////////////////////////////////////////////////
//
// This is a selection sort.
// 
///////////////////////////////////////////////////////////////////////////////
//
// $Id$
//

using namespace std;

#include <iostream>
#include <vector>
#include "selectionsort.h"

template <class element>
void selectionSort(vector<element> &list, int len) {
	// initialize variables
	int minPosition;
	element temp;

	// Make n-1 passes through smaller and smaller pieces of the list
	for (int outer = 0; outer < len - 1; ++outer) {
		minPosition = outer;
		// find index of smallest element
		for (int inner = outer + 1; inner < len; ++inner) {
			if (list[inner] < list[minPosition]) {
				minPosition = inner;
			}
		}
		if (minPosition != outer) {
			temp = list[minPosition]; // make exchange
			list[minPosition] = list[outer];
			list[outer] = temp;
		}

		cout << "iteration " << outer + 1 << ": ";

		for (int i = 0; i < 9; i++) {
			cout << list.at(i) << ",";
		}

		cout << endl;
	}
}

int main(int argc, char *argv[]) {
	vector<int> a;
	a.push_back(85);
	a.push_back(12);
	a.push_back(95);
	a.push_back(8);
	a.push_back(3);
	a.push_back(33);
	a.push_back(32);
	a.push_back(1);
	a.push_back(78);
	selectionSort(a, 9);
	for (int i = 0; i < 9; i++) {
		cout << a.at(i) << endl;
	}
}
