import java.util.Scanner;

public class TreeApp4 {

	public static void main(String[] args) {
		
		BinaryTree tree = new BinaryTree();
		tree.createTree6();
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter data to search: ");
		int search_data = input.nextInt();
		
		tree.searchNode(search_data);
		
		tree.printTree(tree.getRoot(), 0);
		System.out.println("--------------------------------");
		
		// call method search
		
		
		if (tree.getSearchNode() == null) {
			System.out.println("Cannot found Node(data=" + search_data + ")");
		} else {
			if (tree.getSearchNode().left != null) {
				System.out.println("Left  Child: " + tree.getSearchNode().left.data);
			} else {
				System.out.println("Left  Child: No Left Child");
			}
			if (tree.getSearchNode().right != null) {
				System.out.println("Right Child: " + tree.getSearchNode().right.data);
			} else {
				System.out.println("Right Child: No Right Child");
			}
			if (tree.getSearchNode().left == null && tree.getSearchNode().right == null) {
				System.out.println(search_data + " is Left Node");
			} else {
				System.out.println(search_data + " is NOT Left Node");
			}
		}
		
		input.close();
	}

}
