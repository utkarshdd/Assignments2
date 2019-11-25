package com.LinkedList;

import java.util.Stack;
import java.util.Scanner;

public class prefixtopostfix {

	public static void prefixtopost(String exp) {
		
		 Stack<String> stack=new Stack<String>();
		 String s3="";
		 for(int i=exp.length()-1;i>=0;i--) 
	        { 
	            char c=exp.charAt(i); 
	            
	            if(c=='+'||c=='-'||c=='*'||c=='/') {
	            	String c1=stack.pop();
	            	String c2=stack.pop();
	            	s3=c1+c2+c;//c1+c+c2(prefix to Infix)
	            	stack.push(s3);
	            }
	            else {
	            	stack.push(c+"");
	            }
	        }
		System.out.println(stack.pop());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String s=sc.nextLine();
		prefixtopost(s);
	}

}
