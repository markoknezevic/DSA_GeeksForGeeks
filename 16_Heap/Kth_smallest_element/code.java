{
import java.util.*;
import java.io.*;
import java.lang.*;
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
            
            System.out.println(new solve().kthSmallest(arr, n, k));
        }
        
    }
}
}
/*This is a function problem.You only need to complete the function given below*/
class solve{
    public static int kthSmallest(int arr[], int n, int k){
          PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        
        for(int i=0;i<n;i++){
            pq.add(arr[i]);
        }
        
        while(k != 1){
            pq.poll();
            k--;
        }
        return pq.poll();
    }
}