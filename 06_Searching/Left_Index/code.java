{
import java.util.*;
import java.lang.*;
import java.io.*;
class gfg
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            int sizeOfArray = Integer.parseInt(read.readLine());
            String st[] = read.readLine().trim().split("\\s+");
            
            int arr[]= new int[sizeOfArray];
            for(int i = 0; i < sizeOfArray; i++)
              arr[i] = Integer.parseInt(st[i]);
            
            int elementToSearch = Integer.parseInt(read.readLine());
            
            System.out.println(new LeftIndex().leftIndex(sizeOfArray, arr, elementToSearch));
        }
    }
}
}
/*This is a function problem.You only need to complete the function given below*/
class LeftIndex{ 
    static int leftIndex(int sizeOfArray, int arr[], int elementToSearch)
    {
       
       int br = Arrays.binarySearch(arr,elementToSearch);
      
       while(br>0)
       {
           if(arr[br]!=arr[br-1])
            return br;
            br--;
       }
       return br;
       
       
    }
}