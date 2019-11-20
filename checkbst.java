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

	}

	private static boolean checkbstree(Node root) {
		// TODO Auto-generated method stub
		if(root==null)
			return true;
		if(root.left!=null && root.key<=maxvalue(root.left))
			return false;
		else if(root.right!=null && root.key>=minvalue(root.right))
			return false;
		return checkbstree(root.left) && checkbstree(root.right);	}
	//min value
	public static int minvalue(Node root) {     
		Node current = root; 
        /* loop down to find the leftmost leaf */
        while (current.left != null) { 
            current = current.left; 
        } 
        return (current.key); 
    }
	//max value
	public static int maxvalue(Node root) {    
		Node current = root; 
        /* loop down to find the leftmost leaf */
        while (current.right != null) { 
            current = current.right; 
        } 
        return (current.key); 
    }

}
