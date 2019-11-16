import java.util.*;
public class substringpalin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String s=sc.nextLine();
		char arr[]=s.toCharArray();
		int n=arr.length;
		String s2="";
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				String temp="";
				for(int m=i;m<=j;m++) {
					temp=temp+arr[m];
				}
				if(checkpalindrome(temp) ) {
					if(temp.length()>s2.length())
						s2=temp;
				}
				
			}
		}
		System.out.println("Largest palindromic substring");
		System.out.println(s2);

	}

	private static boolean checkpalindrome(String original) {
		// TODO Auto-generated method stub
		String reverse="";
		int length = original.length();   
	      for ( int i = length - 1; i >= 0; i-- )  
	         reverse = reverse + original.charAt(i);  
	      if (original.equals(reverse)) 
	    	  return true;
	      
	      return false;
	        
		
	}

}
