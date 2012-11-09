#include "node.h"

// Declare a pointer to the head of the list.
Node *head = NULL;

// Insert the Node in ascending order.
void insertInOrder(Node* n) {
	if (head == NULL) {
		cout << "created head=" << n->getValue() << endl;
		head = n;
	} else {
		// actually go through the list linearily.
		Node* tmp = head;
		Node* tmpprev = NULL;
		bool abortLoop = false;

		// special case: one item
		if (head->getNext() == NULL) {
			cout << "getNext() = NULL (firstitem)" << endl;
			if (head->getValue() > n->getValue()) {
				cout << "inserting " << n->getValue() << " before " << head->getValue() << "...";
				// insert before
				n->setNext(head);
				head->setNext(NULL);
				head = n;
				cout << "OK!" << endl;
			} else {
				cout << "inserting after...";
				// insert after
				head->setNext(n);
				n->setNext(NULL);
				cout << "OK!" << endl;
			}
		} else {
			if (n->getValue() < head->getValue()) {
				n->setNext(head);
				head = n;
			} else {
				while (!abortLoop && tmp->getNext() != NULL) {
					Node* tmpNext = tmp->getNext();

					if (tmpNext->getValue() > n->getValue()) {
						// if the next point in the list is bigger than the item we want to insert...
						// ...insert after this node!
						cout << "insert " << n->getValue() << " after " << tmp->getValue() << endl;
						n->setNext(tmpNext);
						tmp->setNext(n);
						abortLoop = true;
					} else {
						//cout << "next item not bigger" << endl;
						tmp = tmp->getNext();
					}
				}
			}
		}
	}
}

// Insert the given node at the head of the list.
void insertHead(Node* n)
{
	if (head == NULL)
	{
		head = n;
	}
	else
	{
		n->setNext(head);
		head = n;
	}
}

// Insert the given node at the tail of the list.
void insertTail(Node* n)
{
	if (head == NULL)
		head = n;
	else
	{
		Node* tmp = head;
		while(tmp->getNext() != NULL)
			tmp = tmp->getNext();
		tmp->setNext(n);
	}
}

// Main function
int main()
{
	// Add some new items to the list.
	insertInOrder(new Node(44));
	insertInOrder(new Node(9));
	insertInOrder(new Node(22));
	insertInOrder(new Node(4));

	Node* tmp = head;
	
	while(tmp != NULL)
	{
		printf("addr=%x, value=%d, next=%x\n", tmp, tmp->getValue(), tmp->getNext());
		
		// Store the node so it can be freed.
		Node *deleteme = tmp;
		
		// Move to the next node in the list.
		tmp = tmp->getNext();
		
		// Free the previous node.
		delete deleteme;
	}
}
