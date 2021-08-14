package main;

public class BST {

	public Node root;
	
	public BST() {
		root=null;
	}
	
	public boolean isEmpty() {
		return root==null;
	}
	
	public void add(int value) {
		root=add(root,value);
	}
	
	private Node add(Node root ,int value) {
		
		if(root==null) {
		root=new Node(value);
		}
		else if (root.getData()>value) {
			root.leftchild=add(root.leftchild,value);
		}
		else if (root.getData()<value) {
			root.rightchild=add(root.rightchild,value);
		}
		return root;
	}
	
	public boolean search(int x) {
		return search(root,x);
	}
	
	private boolean search(Node node,int x) {
		boolean found=false;
		
		while(node!=null && !found) {
			if(node.getData()>x)
				node=node.leftchild;
			else if (node.getData()<x) {
				node=node.rightchild;
			}
			else {
				found=true;
				break;
			}
			found=search(node,x);
		}
		return found;
	}
}