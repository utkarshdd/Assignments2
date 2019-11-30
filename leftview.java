package com.bst;

public class leftview {

static Node root;
static int maxlv=0;
	
	leftview()
	{
		root=null;
	}
	
	leftview(int n)
	{
		root=new Node(n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		   1
		  / \
		 2   3
		/\    \
	   4  5    6
	      /
	     7
	     \
	      8	      	  
		 */
		leftview bt=new leftview(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		root.right.right=new Node(6);
		root.left.right.left=new Node(7);
		root.left.right.left.right=new Node(8);
		lview(root);
	}

	private static void lview(Node root) {
		// TODO Auto-generated method stub
		lviewutil(root,1);
	}

	private static void lviewutil(Node root, int lv) {
		// TODO Auto-generated method stub
		if(root==null)
			return;
		if(maxlv<lv) {
			System.out.print(root.key+" ");
			maxlv++;
		  }
			lviewutil(root.left,lv+1);
			lviewutil(root.right,lv+1);	
	  }
}
