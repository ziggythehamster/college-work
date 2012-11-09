///////////////////////////////////////////////////////////////////////////////
// ordercol.cpp
///////////////////////////////////////////////////////////////////////////////
//
// This program tests the OrderedCollection class.
// 
///////////////////////////////////////////////////////////////////////////////
//
// $Id$
//

#include "ordercol.h"
#include <iostream>
using namespace std;

int main(int argc, char *argv[]) {
	OrderedCollection<int> list;
	int choice, value, index, k;
	cout
		<< "[1]  add first" << endl
		<< "[2]  add last" << endl
		<< "[3]  remove first" << endl
		<< "[4]  remove last" << endl
		<< "[5]  remove arbitrary" << endl
		<< "[6]  inspect index" << endl
		<< "[7]  change index" << endl
		<< "[8]  show collection" << endl
		<< "[9]  sort" << endl
		<< "[10] show collection via stream output" << endl
		<< "[0] quit program" << endl;

	do {
		cout << ">> ";
		cin >> choice;
		switch (choice) {
			case 1:
				cout << "Enter value >> ";
				cin >> value;
				list.addFirst(value);
				break;
			case 2:
				cout << "Enter value >> ";
				cin >> value;
				list.addLast(value);
				break;
			case 3:
				cout << " * " << list.removeFirst() << " has been removed." << endl;
				break;
			case 4:
				cout << " * " << list.removeLast() << " has been removed." << endl;
				break;
			case 5:
				cout << "Value (not index!) to remove >> ";
				cin >> value;
				if (list.remove(value))
					cout << " * " << value << " has been removed." << endl;
				else
					cout << " ! " << value << " was not found!" << endl;
				break;
			case 6:
				cout << "Enter index >> ";
				cin >> index;
				cout << " * Value at index " << index << " is " << list[index] << "." << endl; // the book made a mistake here and left off endl
				break;
			case 7:
				cout << "Enter index >> ";
				// I'm doing these two separate so it's easier to figure out what to do
				cin >> index;
				cout << "New value >> ";
				cin >> value;
				list[index] = value;
				break;
			case 8:
				for (k = 0; k < list.length(); k++) {
					cout << list[k] << " ";
				}
				cout << endl;
				break;
			case 9:
				list.sort();
				cout << " * List sorted." << endl;
				break;
			case 10:
				cout << list << endl;
				break;
			case 0:
				break;
			default:
				cout << " ! Invalid choice, please choose another." << endl;
				break;
		}
	} while (choice != 0);

	return 0;
}

