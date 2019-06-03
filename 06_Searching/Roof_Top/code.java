{
import java.util.*;
import java.io.*;
import java.lang.*;
class gfg
{
    
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine());
            
            int arr[] = new int[n];
            
            String st[] = read.readLine().trim().split("\\s+");
            
            for(int i = 0; i < n; i++)
              arr[(int)i] = Integer.parseInt(st[(int)i]);
              
            
            System.out.println(new Step().maxStep(arr, n));
        }
    }
    
    
}
    
    

}
/*This is a function problem.You only need to complete the function given below*/
class Step{
    
    // Function to find the maximum steps
    // arr[]: input array
    // n: size of the array
    static int maxStep(int arr[], int n){
        
        int max=0;
        int count=0;
        for(int i=1;i<n;i++){
            if(arr[i-1]<arr[i]){
                count++;
                if(max<count)
                    max=count;
            }else{
                count=0;
            }
        }
        return max;
        
    }
    
}