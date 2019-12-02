import java.util.*;
public class chocolatedistribution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter Array elements");

		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter number of students");
		int m=sc.nextInt();
		Arrays.sort(arr);
		int min=Integer.MAX_VALUE;
		for(int i=0;i<n;i++) {
			if(i==(n-m+1)) break;
			int temp=arr[i+m-1]-arr[i];
			if((temp)<min) {
				min=temp;	
			}
		}
		System.out.println(min);
	}

}
