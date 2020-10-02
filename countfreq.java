import java.util.*;
public class countfreq {
	public static void countFreq(int arr[],int n)
	{
		int count=1;
		for(int i=0;i<n;i++)
        {
			count=1;
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                	count++;
                    arr[j]=0;
                }
            }
            if(arr[i]!=0)
            {
            	System.out.println(arr[i]+" occurs "+ count+" times");
            }
			System.out.println("Array:-");
			for(int w=0;w<arr.length;w++)
			{
				System.out.println(arr[w]);
			}
        }
	}
	
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
		countFreq(arr,n);
	}
}
