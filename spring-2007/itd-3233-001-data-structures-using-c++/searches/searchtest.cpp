///////////////////////////////////////////////////////////////////////////////
// searchtest.cpp
///////////////////////////////////////////////////////////////////////////////
//
// Tests searches.
// 
///////////////////////////////////////////////////////////////////////////////
//
// $Id$
//

#include <vector>
#include <iostream>

#include "searchtest.h"
#include "binarysearch.h"

using namespace std;

int main(int argc, char *argv[]) {
	vector<int> test1;
	test1.push_back(18);
	test1.push_back(40);
	test1.push_back(46);
	test1.push_back(50);
	test1.push_back(52);
	test1.push_back(58);
	test1.push_back(63);
	test1.push_back(70);
	test1.push_back(77);
	test1.push_back(90);
	
	bool retval;
	cout << "Looking for 43..." << endl;
	retval = binarySearch(test1, 43);
	cout << "Looking for 40..." << endl;
	retval = binarySearch(test1, 40);
	cout << "Looking for 90..." << endl;
	retval = binarySearch(test1, 90);
	return 0;
}
