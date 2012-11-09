#include <iostream>
using namespace std;

class Node
{
	private:
		int value;
		
	public:
		Node* left;
		Node* right;

		Node(const int v);
				
		// Setting the value would require reordering the tree, so
		// I've commented out this method.
		// void setValue(int);
		int getValue();
};

Node::Node(const int v) : value(v), left(NULL), right(NULL) {}

int Node::getValue() {
	return value;
}

