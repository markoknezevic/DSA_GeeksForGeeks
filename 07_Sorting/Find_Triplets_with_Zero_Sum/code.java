{
import java.util.*;
class Triplets{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int[] a=new int[n];
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
			}
			Triplet g=new Triplet();
			if(g.findTriplets(a,n))
				System.out.println("1");
			else
				System.out.println("0");
			
		}
	}
}
}
/*This is a function problem.You only need to complete the function given below*/
/*Complete the function below*/
class Triplet
{
    // Function to check if triplet is present 
    // arr[]: input array
    // n: size of the array
	public boolean findTriplets(int arr[] , int n)
    {
          long c=0;
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
           for(int j=n-1;j>i;j--){
               for(int k=i+1;k<j;k++){
                   if(arr[i]+arr[k]+arr[j]==0)
                        return true;
               }
           }
        }
        
        return false;
    }
}