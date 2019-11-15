import java.util.*;
public class balparen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Parentheses");
		String s=sc.nextLine();
		Stack<Character> st=new Stack<Character>();
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='(' ||s.charAt(i)=='{' ||s.charAt(i)=='[')
			{
				st.push(s.charAt(i));
			}
			else if(s.charAt(i)==')'&& st.peek()=='(' || s.charAt(i)=='}'&& st.peek()=='{' || s.charAt(i)==']'&& st.peek()=='[')
			{
				st.pop();
			}
		}
		if(st.isEmpty())
			System.out.println("Balanced");
			else
				System.out.println("Unbalanced");
		}
	}