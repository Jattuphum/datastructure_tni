
public class NumberList {

	public static void main(String[] args) {

		LinkedList numlist = new LinkedList();

		numlist.insert(0, 37);
		numlist.insert(0,  7);
		numlist.insert(0,  4);
		numlist.insert(0,  16);
		System.out.println("All element = " + numlist.traversal());
		
		numlist.insert(2, 20);
		System.out.println("Insert 20 to index 2 = " + numlist.traversal());
		
		numlist.insert(25);
		System.out.println("Append 25 into list  = " + numlist.traversal());
		
		numlist.remove(0);
		System.out.println("Delete the first element = " + numlist.traversal());
		
		numlist.remove(2);
		System.out.println("Delete element index2    = " + numlist.traversal());
		
		numlist.removeLastElement();
		System.out.println("Delete the last element  = " + numlist.traversal());
		
		System.out.println("\nLength of element in list = " + numlist.length());
		System.out.println("Element in index 1        = " + numlist.get(1));
		
		numlist.set(1,  100);
		System.out.println("Update index 1 to 100     = " + numlist.traversal());
		
		numlist.clear();
		System.out.println("Clear Linked List = " + numlist.traversal());
	}

}
