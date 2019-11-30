package com.LinkedList;
import java.util.*;

public class sum2LL {

	Node head;
	static class Node {
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	//insert
	public static sum2LL insert(sum2LL l,int data)
	{
		Node newNode = new Node(data);
		newNode.next=null;

		if(l.head==null)
			l.head=newNode;
		else {
			Node last=l.head;
			while(last.next!=null)
			{
				last=last.next;
			}
			last.next=newNode;	
		}
		return l;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		sum2LL l1=new sum2LL();
		sum2LL l2=new sum2LL();
		System.out.println("Enter number of nodes in List1");
		int n=sc.nextInt();
		System.out.println("Enter elements of List1");
		for(int i=0;i<n;i++) {
			insert(l1,sc.nextInt());
		}
		System.out.println("Enter number of nodes in List2");
		int m=sc.nextInt();
		System.out.println("Enter elements of List2");
		for(int i=0;i<m;i++) {
			insert(l2,sc.nextInt());
		}
		sum(l1,l2);


	}

	private static void sum(sum2LL l1, sum2LL l2) {
		// TODO Auto-generated method stub
		Node p1=l1.head;
		Node p2=l2.head;
		int sum =0;
		int carry=0;
		while(p1!=null || p2!=null) {
			if(p2!=null) {
				if(p1!=null)
					sum=p1.data+p2.data+carry;
				else
					sum=p2.data+carry;
			}
			else
				sum=p1.data+carry;

			int temp =sum%10;
			System.out.print(temp+" ");
			carry=sum/10;
			if(p1!=null)
			p1=p1.next;
			if(p2!=null)
			p2=p2.next;
		}
		if(carry!=0) {
			System.out.print(carry);
		}
	}
}
