import java.util.*;
public class pairsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of 1st array");
		int n=sc.nextInt();
		int arr1[]=new int[n];
		System.out.println("Enter length of 2st array");
		int m=sc.nextInt();
		int arr2[]=new int[m];
		System.out.println("Enter value of sum of pairs");
		int k=sc.nextInt();
		System.out.println("Enter values of 1st array");
		for(int i=0;i<n;i++) {
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter values of 2nd array");
		for(int i=0;i<m;i++) {
			arr2[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if((arr1[i]+arr2[j])==k) {
					System.out.print(arr1[i]+" "+arr2[j]+","+" ");
				}
			}
		}

	}

}
