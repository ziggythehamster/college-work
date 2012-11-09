///////////////////////////////////////////////////////////////////////////////
// bubblesort.cpp
///////////////////////////////////////////////////////////////////////////////
//
// This is a bubble sort. It sorts by "bubbling-up" the lowest number.
// 
///////////////////////////////////////////////////////////////////////////////
//
// $Id$
//

using namespace std;

#include <iostream>
#include <vector>
#include "bubblesort.h"

template <class element>
void bubbleSort(vector<element> &list, int len) {
	// currentItem stores the index of the current item you're working with
	// exchangeMade is true if any switch had to be made in a pass.
	// element temp is a temporary element to store our temporary number
	
	int iterator, currentItem;
	bool exchangeMade;
	element temp;
	currentItem = 0;
	exchangeMade = true; // set initially so that our loop _actually_ runs
	
	// continue as long as we're not working with the last two items and as
	// long as we've made changes. logic: the vector will be sorted in, at
	// most, len iterations. if we made no exchanges, we're complete with
	// the loops.
	while ((currentItem < len - 1) && exchangeMade) {
		// we have not yet made a change now that we're in a loop
		exchangeMade = false;
		// increase the current item index
		++currentItem;
		
		// loop over the known unsorted length of the vector
		// specifically, len - currentItem ensures we don't check
		// the last item(s) as they're already sorted.
		for (iterator = 0; iterator < len - currentItem; ++iterator) {
			// if the current item is greater than next item, move
			// it down the list
			if (list[iterator] > list[iterator+1]) {
				// swap them!
				temp = list[iterator];
				list[iterator] = list[iterator+1];
				list[iterator+1] = temp;
				
				// set the exchangeMade flag
				exchangeMade = true;
			}
		}

		cout << "iteration " << currentItem << ": ";

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
	bubbleSort(a, 9);
	for (int i = 0; i < 9; i++) {
		cout << a.at(i) << endl;
	}
}

