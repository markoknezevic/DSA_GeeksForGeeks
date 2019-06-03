{
import java.io.*;
import java.lang.*;
import java.util.*;
class Array
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            long n = Long.parseLong(read.readLine());
            String st[] = read.readLine().trim().split("\\s+");
            
            int arr[] = new int[(int)n];
            
            for(long i = 0; i < n; i++)
              arr[(int)i] = Integer.parseInt(st[(int)i]);
              
            System.out.println(new MinimumNumber().minNumber(arr,0,n-1));
            
        }
    }
    
}
}
/*This is a function problem.You only need to complete the function given below*/
class MinimumNumber{
    
    static long minNumber(int arr[], long low, long high)
    {
         
        
        long min = Arrays.stream(arr).min().getAsInt();

        return min;
        
    }
    
}