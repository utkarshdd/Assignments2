import java.util.*;
//reversing string  without affecting special characters
public class RevStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String you want to reverse");
		String str=sc.nextLine();
		char[] chararr = str.toCharArray();
		reverse(chararr);
		String s=new String(chararr);
		System.out.println("After Reversing String :");
		System.out.println(s);
		  
	}

	private static void reverse(char[] chararr) {
		// TODO Auto-generated method stub
		int l=0;
		int r=chararr.length-1;
		while(l<r) {
			if (!(chararr[l]>='a'&& chararr[l]<='z'  || chararr[l]>='A'&& chararr[l]<='Z')) 
                l++; 
            else if(!(chararr[r]>='a'&& chararr[r]<='z'  || chararr[r]>='A'&& chararr[r]<='Z')) 
                r--; 
            else 
            { 
                char temp = chararr[l]; 
                chararr[l] = chararr[r]; 
                chararr[r] = temp; 
                l++; 
                r--; 
            }
			
			}
		}
	}
