package main;

public class BinarySearchTreeTraversal {

	public static void preOrderTraversal(Node root) {
		
		if(root==null) return;
		
		System.out.print(root.getData()+" ");
		preOrderTraversal(root.leftchild);
		preOrderTraversal(root.rightchild);
	}
	
	public static void inOrderTraversal(Node root) {
		
		if(root==null) return;
		
		inOrderTraversal(root.leftchild);
		System.out.print(root.getData()+" ");
		inOrderTraversal(root.rightchild);
	}
	
	public static void postOrderTraversal(Node root) {
		
		if(root==null) return ;
		
		postOrderTraversal(root.leftchild);
		postOrderTraversal(root.rightchild);
		System.out.print(root.getData()+" ");
	}
	
	public static void main(String[] args) {
	
		BST bst=new BST();
		bst.add(7);
		bst.add(1);
		bst.add(0);
		bst.add(3);
		bst.add(2);
		bst.add(5);
		bst.add(4);
		bst.add(6);
		bst.add(9);
		bst.add(8);
		bst.add(10);
		System.out.println("preorder traversal : ");
		preOrderTraversal(bst.root);
		System.out.println();
		System.out.println("inorder traversal : ");
		inOrderTraversal(bst.root);
		System.out.println();
		System.out.println("postorder traversal : ");
		postOrderTraversal(bst.root);
	}
}