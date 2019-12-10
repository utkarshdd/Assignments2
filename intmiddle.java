package com.LinkedList;
import java.util.*;

public class intmiddle {
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
	//insertion at end
		public static Node insert(Node head,int data)
		{
			Node newNode = new Node(data);
			
			if(head==null)
				head=newNode;
			else {
				Node last=head;
				while(last.next!=null)
				{
					last=last.next;
				}
				last.next=newNode;	
			}
			return head;
		}
		
		//display
		public static void display(Node head)
		{
			if(head==null)
			{
				System.out.println("linked list does not exist");
			}
			else
			{
			Node current =head; 
			System.out.println("Linked list is as follows");
			while(current != null) {
	            System.out.println(current.data);  
	            current = current.next;  
	        }
			}
		}
		
		//insert at middle
		public static Node insertmid(Node head,int data)
		{
			int count=0;
			Node curr=head;
			while(curr!=null) {
				count++;
				curr=curr.next;
			}
			int pos=(int)Math.ceil((double)count/2);
			Node newNode = new Node(data);
			if(head==null)
				head=newNode;
			else
			{
			Node o=head;
	        Node w=head;
	        while(pos!=0)
	        {
	            o=w;
	            w=w.next;
	            pos--;
	        }
	        newNode.next= w;
	        o.next=newNode;
			}
	        return head;	
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
        System.out.println("Enter data to be inserted in middle");
        head=insertmid(head,sc.nextInt());
        display(head);  
	}
}
