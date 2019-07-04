{
//Initial Template for Java
import java.util.*;
import java.io.*;
import java.lang.*;
class Driver_class
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            String st[] = read.readLine().trim().split(" ");
            int N = Integer.parseInt(st[0]);
            int M = Integer.parseInt(st[1]);
            
            int arr1[] = new int[N];
            int arr2[] = new int[M];
            
            st = read.readLine().trim().split(" ");
            for(int i = 0; i < N; i++)
                arr1[i] = Integer.parseInt(st[i]);
            st = read.readLine().trim().split(" ");
            for(int i = 0; i < M; i++)
                arr2[i] = Integer.parseInt(st[i]);
                
           new Intersection().printIntersection(arr1, arr2, N, M);
           System.out.println();
        }
    }
}

}
/*This is a function problem.You only need to complete the function given below*/
//User function Template for Java
class Intersection
{
    /* Function prints Intersection of arr1[] and arr2[] 
    n is the number of elements in arr1[] 
    m is the number of elements in arr2[] */
    static void printIntersection(int arr1[], int arr2[], int n, int m) 
    {
      
      Set<Integer> fin = new LinkedHashSet<Integer>();
      
     
   
      
     for(int i=0;i<m;i++){
   if(Arrays.binarySearch(arr1,arr2[i])>=0){
       fin.add(arr2[i]);
   }
    }
    
    if(fin.isEmpty()){
        System.out.print("-1");
        return;
    }
for(Integer a : fin)
    System.out.print(a+" ");

         
 

    }
}
