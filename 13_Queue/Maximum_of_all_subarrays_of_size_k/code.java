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
            for(int i = 0; i <n; i++)
            {
                arr[i] =sc.nextInt();
            }
            
            new solve().max_of_subarrays(arr, n, k);
        }
    }
}
}
/*This is a function problem.You only need to complete the function given below*/

class solve{
    static void max_of_subarrays(int arr[], int n, int k)
    {
      Deque<Integer> deq = new LinkedList<Integer>(); 
  
       int i;
        for (i = 0; i < k; ++i) { 
            
            while ((deq.isEmpty() == false) && arr[i] >= arr[deq.peekLast()]) 
                deq.removeLast(); 
           erherherh
            deq.addLast(i);

         
        } 
  
        
        for (; i < n; ++i) { 
            System.out.print(arr[deq.peek()] + " "); 
  
  
            while ((deq.isEmpty() == false) && deq.peek() <= i - k) 
                deq.removeFirst(); 
  
            
            
            while ((deq.isEmpty() == false) && arr[i] >= arr[deq.peekLast()]) 
                deq.removeLast(); 
  
          
            deq.addLast(i); 
        } 
  
       
        System.out.println(arr[deq.peek()]); 
    }
}