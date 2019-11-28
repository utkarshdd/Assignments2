import java.util.*;
public class Lcabt {
	
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
	
	Lcabt()
	{
		root=null;
	}
	
	Lcabt(int n)
	{
		root=new Node(n);
	}

	
	public static Node lca(Node root, int a, int b) {
		
		if(root == null || root.key == a || root.key == b )
			return root;
 
		Node left=lca(root.left,a,b);
		Node right=lca(root.right,a,b);
 
		if(left!=null && right!=null)
			return root;
		if(left== null)
			return right;
		else
			return left;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		        /*   
		         1
		        / \
		        2  3
		       /\  /\ 
		      4  5 6 7 
		        */
		Lcabt bt=new Lcabt(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		root.right.left=new Node(6);
		root.right.right=new Node(7);
		System.out.println("Enter two nodes");
		int a=sc.nextInt();
		int b=sc.nextInt();
		Node res=lca(root,a,b);
		System.out.println("Lowest common ancestor of two nodes:");
		System.out.println(res.key);
		
	}

}
