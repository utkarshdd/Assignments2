package string;
import java.util.*;
public class anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String s2=sc.nextLine();
		s=s.toLowerCase();
		s2=s2.toLowerCase();
		char arr[]=s.toCharArray();
		char arr2[]=s2.toCharArray();
		Arrays.sort(arr);
		Arrays.sort(arr2);
		if(arr.equals(arr2)){
			System.out.println("Anagrams");
		}else {
			System.out.println("Not Anagrams");
		}
	}

}
