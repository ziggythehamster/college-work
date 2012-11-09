///////////////////////////////////////////////////////////////////////////////
// binarysearch.h
///////////////////////////////////////////////////////////////////////////////
//
// Header file for binary search algorithm
// 
///////////////////////////////////////////////////////////////////////////////
//
// $Id$
//

#ifndef _BINARYSEARCH_H
#define _BINARYSEARCH_H

using namespace std;

#include <vector>
#include <iostream>

// template functions

template <class Any>
bool binarySearch(vector<Any> &list, Any target)
{
	cout << "binary search - len=" << list.size() << endl;
	int low, middle, high;
	bool found = false;
	int iterations = 0;
	
	low = 0;
	high = list.size() - 1;
	while ((low <= high) && !found)
	{
		iterations++;
		middle = (low + high) / 2;
		cout << iterations << "(idx): l=" << low << ",m=" << middle << ",h=" << high << "\t";
		cout << iterations << "(val): l=" << list[low] << ",m=" << list[middle]
			<< ",h=" << list[high] << endl;

		if (list[middle] == target) {
			found = true;
		} else if (list[middle] < target) { // working with the high slice here.
			low = middle + 1;
		} else { // working with the low slice.
			high = middle - 1;
		}
	}
	if (found) {
		cout << "found target (" << target << ")" << endl;
	} else {
		cout << "failed to find target (" << target << ")" << endl;
	}
	return found;
}

#endif
