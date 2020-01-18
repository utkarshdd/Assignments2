import java.util.*;
public class PythagoreanTriplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++) {
			int n=sc.nextInt();
			int arr[]=new int[n];
			for(int j=0;j<n;j++) {
				arr[j]=sc.nextInt();
			}
			
			int count=0;
			for(int j=0;j<n;j++) {
				for(int k=j+1;k<n;k++) {
					for(int m=k+1;m<n;m++) {
						if((arr[j]^2)==(arr[k]^2+arr[m]^2) || (arr[k]^2)==(arr[j]^2+arr[m]^2) ||
								(arr[m]^2)==(arr[k]^2+arr[j]^2)) {
							count++;
						}
					}
				}
			}
			if(count>0) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
			
		}
		
	}

}
