{
//Initial Template for Java
import java.util.Scanner;
import java.util.*;
import java.util.HashSet;
class Driverclass
{
    // Driver Code
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t>0)
		{
			int n = sc.nextInt();
			int a[] = new int[n];
			
			for(int i=0; i<n; i++)
				a[i] = sc.nextInt();
		    
		    // Making object of GfG	
			Subseq g = new Subseq();
			
			System.out.println(g.findLongestConseqSubseq(a, n));
		
		t--;
		}
	}
}
}
/*This is a function problem.You only need to complete the function given below*/
//User function Template for Java
class Subseq
{   
    // Function to find Longest Consecutive Subsequence
	static int findLongestConseqSubseq(int arr[], int n)
	{
	   Arrays.sort(arr);
	   int c=1,max=1;
	   for(int i=1;i<n;i++){
	       if((arr[i]-1)==(arr[i-1])){
	           c++;
	       }else{
	           c=1;
	       }
	       max=Math.max(max,c);
	   }
	   return max;
	}
}