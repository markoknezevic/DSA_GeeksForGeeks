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
            int num = sc.nextInt();
            int k = sc.nextInt();
            
            int arr[] = new int[num];
            for(int i = 0; i < num; i++)
                arr[i] = sc.nextInt();
            
            new solve().nearlySorted(arr, num, k);
            System.out.println();
        }
    }
}

}
/*This is a function problem.You only need to complete the function given below*/
class solve{
    void nearlySorted(int arr[], int num, int k){

              PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for(int i=0;i<num;i++){
            pq.add(arr[i]);
        }
       
      while(pq.isEmpty() == false)
        System.out.print(pq.poll()+" ");
    }
}
