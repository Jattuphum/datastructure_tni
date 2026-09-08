
public class BSTApp1 {

	public static void main(String[] args) {
		
		BinarySearchTree tree = new BinarySearchTree();
		tree.sampleTree1();
		tree.printTree(tree.getRoot(), 0);
			
		System.out.println("Minimum Node is " + tree.findMinimum(tree.getRoot()).data);
		// NO.3
		System.out.println("Maximum Node is " + tree.findMaximum(tree.getRoot()).data);
		//Display the data of Maximum Node
		
		// NO.5
		int target = 40;
		System.out.println("Is 40 in BST => " + tree.findSpecificData(target));
		//tree.findSpecificData(target);
		
		// NO.7
		int delNode = 60;
		tree.searchDeleteNode(delNode);
		//Display the data in parent 
		System.out.println("Parent is "+ tree.getParent().data);
		System.out.println("Delete Node is " + tree.getDeleteNode().data);
		
		// NO.9
		tree.delete(delNode);
		tree.printTree(tree.getRoot(), 0);
		
	}

}
