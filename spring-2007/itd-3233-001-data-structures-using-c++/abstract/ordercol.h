///////////////////////////////////////////////////////////////////////////////
// ordercol.h
///////////////////////////////////////////////////////////////////////////////
//
// An ordered collection. Not that it's actually kept in order (i.e. sorted),
// but it's in the order you ask it to be in.
// 
///////////////////////////////////////////////////////////////////////////////
//
// $Id$
//

#include <vector>
#include <iostream>
#include <assert.h>

#ifndef ORDERCOL_H
#define ORDERCOL_H
using namespace std;

const int MaxVectorSize = 2^32; // this should be sufficient! :)

int main(int argc, char *argv[]);

template <class E> class OrderedCollection {
	protected:
		vector<E> data;
		int cLength;
	
	public:
		
		// Constructors
		OrderedCollection();						// Default constructor
		OrderedCollection(const OrderedCollection &oc);	// Copy constructor
		
		// Member functions
		int length();
		int indexOf(E element);
		
		// Assignment operator
		OrderedCollection& operator = (const OrderedCollection &oc);

		//ostream& operator << (ostream& out);
		template <class X> friend ostream& operator << (ostream& out, const OrderedCollection<X>& oc);

		// Index operator
		E& operator [ ] (int index);
		
		// Collection modifiers
		void addLast(E element);
		E removeLast();
		
		void addFirst(E element);
		E removeFirst();
		
		bool remove(E element);

		// sort function
		void sort();

		const string inspect();
};


template <class E> 
OrderedCollection<E>::OrderedCollection() 
	: data(MaxVectorSize)
{
	cLength=0;
}

template <class E> 
OrderedCollection<E>::OrderedCollection(const OrderedCollection &oc) 
	: data(MaxVectorSize)
{
	for (int j=0; j<oc.cLength; ++j)
	{
		data[j] = oc.data[j];
	}
	cLength = oc.cLength;
}

template <class E> 
int OrderedCollection<E>::length()
{
	return cLength;
}

template <class E> 
E& OrderedCollection<E>::operator [ ] (int index)
{
	assert( (index >= 0) && (index < cLength) );
	return data[index];
}

template <class E> 
void OrderedCollection<E>::addLast(E element)
{
	assert(cLength < MaxVectorSize);
	data[cLength] = element;
	++cLength;
}

template <class E> 
E OrderedCollection<E>::removeLast()
{
	assert(cLength > 0);
	--cLength;
	E removedItem = data[cLength];
	return removedItem;
}

template <class E> 
void OrderedCollection<E>::addFirst(E element)
{
	assert(cLength < MaxVectorSize);
	for(int i=cLength; i>0; --i)
	{
		data[i] = data[i-1];
	}
	data[0] = element;
	++cLength;
}
		
template <class E> 
E OrderedCollection<E>::removeFirst()
{
	assert(cLength > 0);
	E removedItem = data[0];
	for (int i=0; i<cLength; ++i)
	{
		data[i] = data[i+1]; 
	}
	--cLength;
	return removedItem;
}

template <class E>
bool OrderedCollection<E>::remove(E element) {
	bool removedItem = false;
	for (int i=0; i < cLength; ++i) {
		if (data[i] == element && !removedItem) {
			// i = index of item to remove
			// shift the list up by one for
			// everything after i
			for (int j=i; j < cLength; ++j) {
				data[j] = data[j+1];
			}
			--cLength;
			removedItem = true;
		}
		// the side effect now is that if we find the item, we run through
		// the rest of the list... this can be done with a while loop
		// but I didn't feel like writing it that way
	}

	return removedItem;
}

template <class E>
int OrderedCollection<E>::indexOf(E element) {
	// this is a linear search
	// I should probably do a binary search here.
	for (int i=0; i < cLength; ++i) {
		if (data[i] == element) {
			return i;
		}
	}
	
	// uh-oh!
	return -1;
}

template <class E>
void OrderedCollection<E>::sort() {
	// initialize variables
	int minPosition;
	E temp;

	// Make n-1 passes through smaller and smaller pieces of the list
	for (int outer = 0; outer < cLength - 1; ++outer) {
		minPosition = outer;
		// find index of smallest element
		for (int inner = outer + 1; inner < cLength; ++inner) {
			if (data[inner] < data[minPosition]) {
				minPosition = inner;
			}
		}
		if (minPosition != outer) {
			temp = data[minPosition]; // make exchange
			data[minPosition] = data[outer];
			data[outer] = temp;
		}
	}
}

template <class E>
ostream& operator << (ostream& out, const OrderedCollection<E>& oc) {
	string tmp;
	char tmpNum[32];
	tmp = "[";
	for (int i=0; i < oc.cLength; ++i) {
		sprintf(tmpNum,"%d",oc.data[i]);
		tmp = tmp + tmpNum;
		if (i != oc.cLength - 1) {
			tmp = tmp + ","; // append a comma, to look purty
		}
	}
	tmp = tmp + "]";

	out << tmp;
	return out;
}

#endif
