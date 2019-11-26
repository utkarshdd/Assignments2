package string;
import java.util.Scanner;
public class RemAdj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String s=sc.next();
		int n=s.length();
		String s2="";
		int count=0;
		for(int i=0;i<n;i++) {
			if(i==n-1) { 
				if(count==0)
				s2=s2+s.charAt(n-1);
				break;}
			
			if(s.charAt(i)!=s.charAt(i+1) ) {
				if(count>0)
				count=0;
				else
				s2=s2+s.charAt(i);
			}
			else {
				count++;
			}
		}
		System.out.println("After removing Adjecent Duplicates");
		System.out.println(s2);

	}

}
