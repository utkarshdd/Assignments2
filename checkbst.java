package com.bst;

public class checkbst {
	
	static class Node
	{
		int key;
		Node left,right;
		public Node(int data)
		{
			key=data;
			left=right=null;
		}
	}
	static Node root;
	
	checkbst()
	{
		root=null;
	}
	
	checkbst(int n)
	{
		root=new Node(n);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
	       100
	       /\
	      90 110
	      /     
	     60
	     /\
	    6  70
	    \
	     8
	 */
		checkbst bt=new checkbst(100);
		root.left=new Node(90);
		root.right=new Node(110);
		root.left.left=new Node(60);
		root.left.left.left=new Node(6);
		root.left.left.right=new Node(70);
		root.left.left.left.right=new Node(6);
		
		if(checkbstree(root)) {
			System.out.println("bst");
		}
		else {
			System.out.println("not a bst");
		}

	}

	private static boolean checkbstree(Node root) {
		// TODO Auto-generated method stub
		if(root==null)
			return true;
		if(root.left!=null && root.key<root.left.key)
			return false;
		else if(root.right!=null && root.key>root.right.key)
			return false;
		return checkbstree(root.left) && checkbstree(root.right);	}

}
