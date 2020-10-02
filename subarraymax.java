import java.util.Scanner;

public class subarraymax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println(n);
		 int [] a = {-2, -3, 4, -1, -2, 1, 5, -3}; 
		 System.out.println("Maximum contiguous sum is " + 
                                       maxSubArraySum(a)); 
		System.out.println("EnterInput in array");
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
	static int maxSubArraySum(int a[]) 
    { 
        int size = a.length; 
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0; 
  
        for (int i = 0; i < size; i++) 
        { 
            max_ending_here = max_ending_here + a[i]; 
            if (max_so_far < max_ending_here) 
                max_so_far = max_ending_here; 
            if (max_ending_here < 0) 
                max_ending_here = 0; 
        } 
        return max_so_far; 
    } 

}
