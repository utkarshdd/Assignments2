package com.bst;

public class printleaf {

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
	
	public static void printLeaf(Node root)  
    { 
        if (root == null) 
            return ; 
        if (root.left == null && root.right == null) 
            System.out.print(root.key +" "); 
        
             printLeaf(root.left);
             printLeaf(root.right); 
    }
	
	public static void printNonLeaf(Node root)  
	{  
	   	    if (root == null || (root.left == null &&root.right == null))  
	        return;    
	   	System.out.print(root.key +" ");    
	    printNonLeaf(root.left);
	    printNonLeaf(root.right);  
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*   
        10
        /\
       20 30
       /\   
      40 50   
		 */
		root=new Node(10);
		root.left=new Node(20);
		root.right=new Node(30);
		root.left.left=new Node(40);
		root.left.right=new Node(50);
		printLeaf(root);
		printNonLeaf(root);
	}

}
