///////////////////////////////////////////////////////////////////////////////
// insertionsort.cpp
///////////////////////////////////////////////////////////////////////////////
//
// This is a insertion sort
// 
///////////////////////////////////////////////////////////////////////////////
//
// $Id$
//

using namespace std;

#include <iostream>
#include <vector>
#include "insertionsort.h"

template <class element>
void insertionSort(vector<element> &list, int len) {
	// initialize variables
	int outer, inner;
	element itemToInsert;
	bool stillLooking;

	// insert the item specified by outer into its correct place among
	// the other sorted ones
	for (int outer = 1; outer < len; ++outer) {
		// walk backwards through the list
		itemToInsert = list[outer];
		inner = outer - 1;
		stillLooking = true;
		
		while ((inner >= 0) && stillLooking) {
			if (itemToInsert < list[inner]) {
				list[inner + 1] = list[inner];
				--inner;
			} else {
				stillLooking = false;
			}
		}

		// inner+1 is the new index where the new item belongs
		list[inner+1] = itemToInsert;

		cout << "iteration " << outer << ": ";

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
	insertionSort(a, 9);
	for (int i = 0; i < 9; i++) {
		cout << a.at(i) << endl;
	}
}
