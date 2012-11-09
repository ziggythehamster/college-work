#include <iostream>
using namespace std;

class Node
{
	private:
		Node* next;
		int value;

	public:
		Node(const int v);
		void setNext(Node*);
		Node* getNext();
			
		void setValue(int);
		int getValue();
};

Node::Node(const int v) : value(v), next(NULL) {}

void Node::setNext(Node* n)
{
	next = n;
}
Node* Node::getNext()
{
	return next;
}

void Node::setValue(int v)
{
	value=v;
}
int Node::getValue()
{
	return value;
}

