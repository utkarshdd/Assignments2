package com.LinkedList;
import java.util.Stack;
//queue using 2 stack
public class Queue2 {
	
	 Stack<Integer> stack1 = new Stack<Integer>();  
     Stack<Integer> stack2 = new Stack<Integer>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue2 q2 = new Queue2();  
	    q2.enQueue(1);  
	    q2.enQueue(2);  
	    q2.enQueue(3);  
	    q2.enQueue(4);
	    q2.enQueue(5);
	    System.out.println(q2.deQueue());
	}

	private int deQueue() {
		// TODO Auto-generated method stub
		if (stack1.isEmpty())  
        {  
            System.out.println("Queue is Empty");  
        }  
      
       return stack1.pop();
			}

	private void enQueue(int i) {
		// TODO Auto-generated method stub
		while (!stack1.isEmpty()) 
        {  
            stack2.push(stack1.pop());  
        }
		  stack1.push(i); 
		  
        while (!stack2.isEmpty())  
        {  
            stack1.push(stack2.pop());  
        }  
	}

}
