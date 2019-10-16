{
/*package whatever //do not write package name here */
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	    Scanner in = new Scanner(System.in);
	    int t = in.nextInt();
	    while(t-->0)
	    {
	        int n = in.nextInt();
	        int arr[] = new int[n];
	        
	        for(int i = 0; i<n; ++i)
	            arr[i] = in.nextInt();
	        
	        new solve().minCost(arr, n);
	    }
	 }
}

}
/*This is a function problem.You only need to complete the function given below*/
class solve{
    void minCost(int arr[], int n){
    PriorityQueue <Integer> pq = new PriorityQueue <Integer>();
        for(int i=0;i<n;i++){
            pq.add(arr[i]);
        }
        long sum=0;
        while(pq.size() != 1){
            int a = pq.poll();
            int b = pq.poll();
            sum+= (a+b);
            pq.add(a+b);
    
        }
        System.out.println(sum);
        
    }
}