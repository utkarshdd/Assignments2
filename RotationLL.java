package com.LinkedList;
import java.util.*;

public class RotationLL {
	
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
	public static Node rotate(Node head)
	{
		Node current =head; 
		while(current.next.next!=null)
		{
			current = current.next; 
		}
		Node temp=current.next;
		
		current.next=null;
		
		temp.next=head;
		head=temp;
		
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
		Scanner sc=new Scanner(System.in);
        System.out.println("enter the no. of nodes");
        int n=sc.nextInt();
        System.out.println("enter data");
        for(int i=0;i<n;i++)
        {
            int d=sc.nextInt();
            head=insert(head,d);          
        }
        System.out.println("Enter number of times you want to rotate LL");
        int k=sc.nextInt();
        for(int i=0;i<k;i++) {
        	head=rotate(head);
        }
        display(head);

	}

}
