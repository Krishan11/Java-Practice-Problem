public class BinaryTree {

	Node root; // The only data field in Tree
	// ========================== FIND ==================================

	public Node find(int key) {

		Node current = root;
		/*
		 * 1. If key is less than the data on the node move to left child
		 * 
		 * 2. Else If key is more than the data on the node move to the right
		 * child.
		 * 
		 * 3. If the the tree is empty just return the empty tree 4. Other wise
		 * return the current node.
		 */

		while (current.iData != key) {
			if (key < current.iData) {
				current = current.leftChildren;
			} else if (key > current.iData) {
				current = current.rightChildren;
			}
			if (current == null) {
				return null;
			}
		}

		return current;
	} // end of find method

	// =============================== INSERTIONS
	// ======================================
	public void insert(int key) {
		Node newNode = new Node();
		newNode.iData = key;

		// 1. If the root node is empty add the item in the root node.
		if (root == null) {
			root = newNode;
		}
		// 2. If the root is not empty look for children to insert.
		else {
			// Set the current to the root and create the parent
			Node current = root;
			Node parent;
			// 3. Go on until you find a place to insert the element
			while (true) {
				// 4. Set the parent reference to current
				parent = current;
				// 5. If the key is less then the currents data
				if (key < current.iData) {
					// 6. Move to left child
					current = current.leftChildren;
					// 7. If the left child is empty add the newNode to the left
					// child
					if (current == null) {
						parent.leftChildren = newNode;
						return;
					}
					// 8. If the key is greater than the currents nodes data
				} else if (key > current.iData) {
					// 9. Move to right child
					current = current.rightChildren;
					// 10. If the right child is empty
					if (current == null) {
						// 11. Add the newNode to the rightChild
						parent.rightChildren = newNode;
						return;
					}
				}
			}
		}

	}// end of insert method
		// =========================== DELETE =================================

	public void delete(int key) {
		Node current = root;
		Node parent = root;
		boolean isLeftChild = true;

		while (current.iData != key) {
			parent = current;
			if (key < current.iData) {
				isLeftChild = true;
				current = current.leftChildren;
			} else {
				isLeftChild = false;
				current = current.rightChildren;
			}
			if (current == null) // didn't find the key
			{
				return;
			}

			// ===================== DELETING NODE WITH NO CHILDREN
			// ==============
			if (current.leftChildren == null && current.rightChildren == null) {
				if (current == root) {
					root = null;
				} else if (isLeftChild) {
					parent.leftChildren = null;
				} else {
					parent.rightChildren = null;
				}
			}
			// DELETING NODE WITH NO CHILDREN ENDS HERE.......
			// ===================== DELETING A NODE WITH ONE CHILD
			// ========================
			else if (current.rightChildren == null) {
				if (current == root) {
					root = current.leftChildren;
				} else if (isLeftChild) {
					parent.leftChildren = current.leftChildren;
				} else {
					parent.rightChildren = current.leftChildren;
				}
			} else if (current.leftChildren == null) {
				if (current == root) {
					root = current.rightChildren;
				} else if (isLeftChild) {
					parent.leftChildren = current.rightChildren;
				} else {
					parent.rightChildren = current.rightChildren;

				}
			}// DELETING A NODE WITH ONE CHILD END HERE
//=================== DELETING A NODE WITH TWO CHILDREN ===================
			else
			{
				// get Succesor of the node to be deleted
				Node successor = getSuccessor(current);
				if(current == root)
				{
					root = successor;
				}
				else if(isLeftChild)
				{
					parent.leftChildren = successor;
				}
				else
				{
					parent.rightChildren = successor;
					successor.leftChildren = current.leftChildren;
				}
			}
		}
		
		

	} // end of delete method
	
//=========================== getSuccessor
	private Node getSuccessor(Node delNode)
	{
		Node successorParent = delNode;
		Node successor = delNode;
		Node current = delNode.rightChildren;
		
		while(current!= null)
		{
			successorParent = successor;
			successor = current;
			current = current.leftChildren;
		}
		
		if(successor != delNode.rightChildren)
		{
			successorParent.leftChildren = successor.rightChildren;
			successor.rightChildren = delNode.rightChildren;
		}
		
		
		return successor;
	}

	// =========================== TRAVERSALS =============================
	public void inOrder(Node localRoot) {
		if (localRoot != null) {
			inOrder(localRoot.leftChildren);
			System.out.print(localRoot.iData + " ");
			inOrder(localRoot.rightChildren);
		}
	}

	public void preOrder(Node localRoot) {
		if (localRoot != null) {
			System.out.print(localRoot.iData + " ");
			inOrder(localRoot.leftChildren);
			inOrder(localRoot.rightChildren);
		}
	}

	public void postOrder(Node localRoot) {
		if (localRoot != null) {
			inOrder(localRoot.leftChildren);
			inOrder(localRoot.rightChildren);
			System.out.print(localRoot.iData + " ");
		}
	}

	public int minValue() {
		Node current = root;
		Node parent = null;
		while (current != null) {
			parent = current;
			current = current.leftChildren;
		}

		return parent.iData;
	}

	public int maxValue() {
		Node current = root;
		Node parent = null;
		while (current != null) {
			parent = current;
			current = current.rightChildren;
		}

		return parent.iData;
	}

} // end BinaryTree class