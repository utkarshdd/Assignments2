package com.LinkedList;

import java.util.LinkedList;
import java.util.Queue;
//stack using 2 queue
public class Stack2 {
	
	 Queue<Integer> q1 = new LinkedList<Integer>(); 
     Queue<Integer> q2 = new LinkedList<Integer>(); 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack2 s2 = new Stack2();  
	    s2.push(1);  
	    s2.push(2);  
	    s2.push(3);  
	    s2.push(4);
	    s2.push(5);
	    System.out.println(s2.pop());
	}

	private int pop() {
		// TODO Auto-generated method stub
		if (q1.isEmpty())  
        {  
            System.out.println("Stack is Empty");  
        }  
      
       return q1.remove();
		
	}

	private void push(int i) {
		// TODO Auto-generated method stub
		while (!q1.isEmpty()) 
        {  
            q2.add(q1.remove());  
        }
		  q1.add(i); 
		  
        while (!q2.isEmpty())  
        {  
            q1.add(q2.remove());  
        }
	}
}
