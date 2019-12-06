package hashing;
import java.util.Scanner;
import java.util.HashMap;
public class phonebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of entries");
		int n=sc.nextInt();
		sc.nextLine();
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		for(int i=0;i<n;i++) {
			String name=sc.nextLine();
			int num=sc.nextInt();
			sc.nextLine();
			hm.put(name,num);
		}
		while(sc.hasNext()) {
			String s=sc.nextLine();
			if(hm.containsKey(s)) {
				System.out.println(hm.get(s));
			}
			else {
				System.out.println("Not found");
			}
		}
	}

}
