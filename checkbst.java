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
		root.left.left.left.right=new Node(8);
		
		if(checkbstree(root)) {
			System.out.println("bst");
		}
		else {
			System.out.println("not a bst");
		}
		
		checkbst bt1=new checkbst(3);
		root.left=new Node(2);
		root.right=new Node(5);
		root.left.left=new Node(1);
		root.left.right=new Node(4);
		
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
		if(root.left!=null && root.key<=maxvalue(root.left))//root.left.key
			return false;
		else if(root.right!=null && root.key>=minvalue(root.right))//root.right.key
			return false;
		return checkbstree(root.left) && checkbstree(root.right);	}
	//min value
	private static int minvalue(Node root) {
	    int min= root.key;
	    if(root.left != null) {
	        min = Math.min(min, minvalue(root.left));
	    }
	    if(root.right != null) {
	        min = Math.min(min, minvalue(root.right));
	    }
	    return min;
	}
	//max value
	private static int maxvalue(Node root) {
	    int max= root.key;
	    if(root.left != null) {
	        max = Math.max(max, minvalue(root.left));
	    }
	    if(root.right != null) {
	        max = Math.max(max, minvalue(root.right));
	    }
	    return max;
	}
}
