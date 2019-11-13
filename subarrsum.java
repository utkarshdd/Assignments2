import java.util.Scanner;

public class subarrsum {

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
		System.out.println("Enter sum");
		int k=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				int sum=0;
				for(int m=i;m<=j;m++) {
					sum=sum+arr[m];
				}
				if(sum==k) {
					System.out.print("starting index: "+i);
					System.out.println(" Ending index: "+j);
				}
			}
		}
		
		
	}
}
