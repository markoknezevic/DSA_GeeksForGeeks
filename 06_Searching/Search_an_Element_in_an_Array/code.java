{
import java.util.*;
import java.io.*;
import java.lang.*;
class Array
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            int sizeOfArray = Integer.parseInt(read.readLine());
            int arr[] = new int[sizeOfArray];
            
            String st[] = read.readLine().trim().split("\\s+");
            for(int i = 0; i < sizeOfArray; i++)
              arr[i] = Integer.parseInt(st[i]);
              
            int x = Integer.parseInt(read.readLine());
            
            Searching obj = new Searching();
            
            System.out.println(obj.search(arr, sizeOfArray, x));
        }
    }
}
}
/*This is a function problem.You only need to complete the function given below*/
class Searching{
        
    static int search(int arr[], int n, int x)
    {
        
        for(int i=0;i<n;i++){
        if(arr[i]==x)
            return i;
    }
    return -1;
        
    }
    
}
