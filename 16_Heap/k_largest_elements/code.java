{
import java.util.*;
import java.lang.*;
import java.io.*;
class gfg
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            
            int arr[] = new int[n];
            for(int i = 0; i<n; ++i)
                arr[i] = sc.nextInt();
            
            new solve().kthLargest(arr, n, k);
            
        }
    }
}
}
/*This is a function problem.You only need to complete the function given below*/
class solve{
    public static void kthLargest(int arr[], int n, int k){
      PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder()); 
      
      for(int i = 0; i<n;i++){
          pq.add(arr[i]);
      }
      
      for(int i =0;i<k;i++){
          System.out.print(pq.poll()+" ");
      }
      System.out.println();
    }
}