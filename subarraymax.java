import java.util.Scanner;

public class subarraymax {

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
		System.out.println("Enter integer k");
		int k=sc.nextInt();
		int count=0;
		System.out.println("Max elements in subarray are:");
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				int max=Integer.MIN_VALUE;
				for(int m=i;m<=j;m++) {
					if(arr[m]>max)
					max=arr[m];
				}
				System.out.println(max);
				if(max>k)
					count++;
			}
		}
		System.out.println("Max ele in subarrays greater than "+k);
		System.out.println(count);
	}

}
