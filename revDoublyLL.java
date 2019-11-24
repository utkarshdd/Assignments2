package com.LinkedList;

import java.util.Scanner;

public class revDoublyLL {

	static Node head;
	static class Node {
		int data;
		Node prev;
		Node next;
		Node(int d)
		{
			data=d;
			prev=null;
			next=null;
		}
	}
	
	private static Node insert(Node head,int data)
	{
		Node newNode = new Node(data);

		if(head==null)
			head=newNode;
		else
		{
			Node current = head; 
			while(current.next!=null)
			{
				current = current.next; 
			}
			current.next=newNode;
			newNode.prev=current;
			newNode.next=null;
		}	
		return head;
	}



	private static Node reverse(Node head) {
		// TODO Auto-generated method stub
		Node curr=head;
		while(curr!=null) {
			Node temp=curr.prev;
			curr.prev=curr.next;
			curr.next=temp;
			head=curr;
			curr=curr.prev;
		}
		return head;	
	}
	
	private static void display(Node head)
	{
		if(head==null)
		{
			System.out.println("linked list does not exist");
		}
		else
		{
		Node current = head; 
		System.out.println("Linked list is as follows");
		while(current != null) {
			
            System.out.println(current.data);  
            current = current.next;  
        }
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
        head=insert(head,sc.nextInt());
        }
        
       head= reverse(head);
        display(head);
	}
}
