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
            String s[] = read.readLine().trim().split("\\s+");
            
            int n = Integer.parseInt(s[0]);
            int k = Integer.parseInt(s[1]);
            
            int arr[] = new int[n];
            
            String st[] = read.readLine().trim().split("\\s+");
            
            for(int i = 0; i < n; i++)
            {
                arr[i] = Integer.parseInt(st[i]);
            }
            
            SearchElement obj = new SearchElement();
            
            System.out.println(obj.searchInSorted(arr, n, k));
        }
    }
}
}
/*This is a function problem.You only need to complete the function given below*/
class SearchElement{
    static int searchInSorted(int arr[], int n, int x)
    {
        
        int y=Arrays.binarySearch(arr, x);
        if(y<0)
        return -1;
        else
        return 1;
        
    }
}