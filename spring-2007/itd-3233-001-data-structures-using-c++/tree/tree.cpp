#include "node.h"

// Declare a pointer to the root of the tree.
Node *root = NULL;

// Insert the given node
void insert(Node* &treeRoot, Node* newNode) {
	if (treeRoot == NULL) {
		// the node goes here then!
		treeRoot = newNode;
		return;
	} else if (newNode->getValue() < treeRoot->getValue()) {
		// insert on the left then
		insert(treeRoot->left, newNode);
	} else {
		// insert on the right
		insert(treeRoot->right, newNode);
	}
}

void preorderPrint(Node* treeRoot) {
	if (treeRoot != NULL) {
		cout << treeRoot->getValue() << " ";
		preorderPrint(treeRoot->left);
		preorderPrint(treeRoot->right);
	}
}

void inorderPrint(Node* treeRoot) {
	if (treeRoot != NULL) {
		inorderPrint(treeRoot->left);
		cout << treeRoot->getValue() << " ";
		inorderPrint(treeRoot->right);
	}
}

void postorderPrint(Node* treeRoot) {
	if (treeRoot != NULL) {
		postorderPrint(treeRoot->left);
		postorderPrint(treeRoot->right);
		cout << treeRoot->getValue() << " ";
	}
}

// Main function
int main(int argc, char* argv[])
{
	// Add some new items to the list.
	insert(root, new Node(44));
	insert(root, new Node(9));
	insert(root, new Node(22));
	insert(root, new Node(4));
	insert(root, new Node(42));
	insert(root, new Node(61));
	insert(root, new Node(23));
	insert(root, new Node(50));
	insert(root, new Node(2));

	cout << "Preorder : ";
	preorderPrint(root);
	cout << endl;
	cout << "Inorder  : ";
	inorderPrint(root);
	cout << endl;
	cout << "Postorder: ";
	postorderPrint(root);
	cout << endl;
}
