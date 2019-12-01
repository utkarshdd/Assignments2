package com.LinkedList;

import java.util.Scanner;

public class llpalindrome {
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
			newNode.next=null;
			
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
        if(ispalin(head)) {
        	System.out.println("is palindrome");
        }
        else
        	System.out.println("not palindrome");
		}
	
	private static boolean ispalin(Node head) {
		// TODO Auto-generated method stub
		//find no. of nodes
		Node temp=head;
		int n=0;
		while(temp!=null) {
			n++;
			temp=temp.next;
		}
		//find middle of LL
		int mid=n/2;
		if(mid==0) return true;
		Node curr=head;
		Node slow=null;
		while(mid!=0) {
			slow=curr;
			curr=curr.next;
			mid--;
		}
		Node prev=null,next=null;
		while(curr!=null) {
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		Node head2=prev;
		slow.next=prev;
		Node ptr=head;
		boolean b=false;
		while(ptr!=head2) {
			if(ptr.data==prev.data) {
				b=true;
			}
			else
				break;
			ptr=ptr.next;
			prev=prev.next;	
		}
		return b;
	}
}