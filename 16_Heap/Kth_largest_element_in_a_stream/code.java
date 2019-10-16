{
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args) throws IOException
	 {
	 
	    Scanner scan=new Scanner(System.in);
	    int t=scan.nextInt();
	    while(t-- > 0){
	        int k=scan.nextInt();
	        int n=scan.nextInt();
	        int a[] = new int[n];
	        for(int i=0;i<n;i++)
	            a[i]=scan.nextInt();
	        
	        new solve().kthLargest(a, n, k);
	        System.out.println();
	    }
	 }
}
}
/*This is a function problem.You only need to complete the function given below*/
class solve{
    public void kthLargest(int arr[], int n, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
 
        for(int l=0;l<k;l++){
            if(l != k-1)
            System.out.print("-1 ");
            pq.add(arr[l]);
         
        }
          
        for(int i=k;i<n;i++){
            
            System.out.print(pq.peek()+" ");
            
            if(pq.peek()<arr[i]){
                
                pq.poll();
                pq.add(arr[i]);
            }
            
            
        }
        System.out.print(pq.peek()+" ");
    }
}