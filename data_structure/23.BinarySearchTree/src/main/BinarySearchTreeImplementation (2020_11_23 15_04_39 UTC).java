package main;

public class BinarySearchTreeImplementation {

	public static void main(String[] args) {
	
		BST bst=new BST();
		bst.add(5);
		bst.add(2);
		bst.add(18);
		bst.add(-4);
		bst.add(3);
		
		System.out.println(bst.search(1));
	}
}
