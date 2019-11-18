package com.LinkedList;
import java.util.*;

public class RemoveDuplicate {
	static Node head;
	static class Node {
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	public static Node insert(Node head,int data)
	{
		Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
        }
        else{
            Node current=head;
            while(current.next!=null)
            {
            	current=current.next;
            }
            current.next=newNode;
        }
		return head;
	}
	
	public static Node removedup(Node head) {
		Node current=head;
        Node o=null;
        Node w=null;
        while(current != null){
        	
        	o = current;
        	w = current.next;
        	
        	while(w != null) {
        		if(current.data == w.data) {
        			
        			o.next = w.next;
        		}
        		else
        		{
        			o=w;
        		}
        		 	w=w.next;
        	}
        	current=current.next;
        	}
		
		return head;
	}
	public static void display(Node head) {
		Node ptr = head; 
		System.out.println("Linked list is as follows");
		while(ptr != null) {
			
            System.out.print(ptr.data+" ");  
            ptr = ptr.next;  
        }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
			Scanner sc=new Scanner(System.in);
	        System.out.println("enter the no. of nodes");
	        n=sc.nextInt();
	        System.out.println("enter data");
	        for(int i=0;i<n;i++)
	        {
	            int d=sc.nextInt();
	            head=insert(head,d);          
	        }
	        head=removedup(head);
	        display(head);    
	}
}