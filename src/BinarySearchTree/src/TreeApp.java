public class TreeApp {

	public static void main(String[] args) {
		
		BinaryTree tree = new BinaryTree();
		

		tree.insert(50);
		tree.insert(25);
		tree.insert(65);
		tree.insert(12);
		tree.insert(30);
		tree.insert(60);
		tree.insert(70);
		
		
		tree.delete(70);
		
		tree.inOrder(tree.root);
		

	} // end main
	
	

} // end class