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
        int t  =Integer.parseInt(read.readLine());
        
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
            for(int i = 0; i< M; i++)
              arr2[i] = Integer.parseInt(st[i]);
            
            Union obj = new Union();
            obj.findUnion(arr1, arr2, N, M);
            System.out.println();
        }
    }
}

}
/*This is a function problem.You only need to complete the function given below*/
//User function Template for Java
//arr1,arr2 : the arrays
// n, m: size of arrays
class Union
{
    
    static void findUnion(int arr1[], int arr2[], int n, int m)
    {
        int i=0,j=0;
   
        Set<Integer> fin =new LinkedHashSet<Integer>();
          
        while(i<n && j<m){
            
         if(arr1[i] <= arr2[j]){
                fin.add(arr1[i]);
                i++;
            }else{
                fin.add(arr2[j]);
                j++;
                
            }
     
        }
      
        
        while(i<n){
            fin.add(arr1[i]);
            i++;
        }
        
        while(j<m){
            fin.add(arr2[j]);
            j++;
            
         
        }
    
        
  
        for(Integer d : fin){
            System.out.print(d+" ");
        }
       
        
    }
}
