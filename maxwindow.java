import java.util.*;
public class maxwindow {

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
		System.out.println("Enter Window Size");
		int k=sc.nextInt();
		for(int i=0;i<n;i++) {
			if(i==(n-k+1)) break;
			int max=Integer.MIN_VALUE;
			for(int j=i;j<i+k;j++) {
				if(arr[j]>max)
					max=arr[j];
			}
			System.out.print(max+" ");
		}
		

	}

}
