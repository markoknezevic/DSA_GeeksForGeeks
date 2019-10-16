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
            String str[] = read.readLine().trim().split(" ");
            int n = Integer.parseInt(str[0]);
            
            int arr[] = new int[n];
            int dep[] = new int[n];
            
            str = read.readLine().trim().split(" ");
            for(int i = 0; i < n; i++)
              arr[i] = Integer.parseInt(str[i]);
            str = read.readLine().trim().split(" ");
            for(int i = 0; i < n; i++)
                dep[i] = Integer.parseInt(str[i]);
                
            System.out.println(new Platform().findPlatform(arr, dep, n));
        }
    }
    
    
}

}
/*This is a function problem.You only need to complete the function given below*/
//User function Template for Java



class pair
{
    int first;
    char second;
    pair(int key1, char key2)
    {
        this.first = key1;
        this.second= key2;
        
    }
}

class Platform
{
    public static int findPlatform(int arr[], int dep[], int n)
    {
        // Insert all the times (arr. and dep.)
        // in the ArrayList of pairs.
        ArrayList<pair> order = new ArrayList<>();
        for(int i = 0; i < n; i++)
        {
            order.add(new pair(arr[i], 'a'));
            order.add(new pair(dep[i], 'd'));
            
        }
        
        // custom sort order ArrayList, first by time than by
        // arrival or departure
        Collections.sort(order, new Comparator<pair>()
        {
            @Override public int compare(pair p1, pair p2) 
            { 
                if(p1.first == p2.first)
                   return new Character(p1.second).compareTo(new Character(p2.second));
                 return p1.first - p2.first;
            } 
        }
        
        );
        int result = 1;
        int plat_needed = 0;
        for(int i = 0; i < order.size(); i++)
        {
            pair p = order.get(i);
            
            // If its 'a' then add 1 to plat_needed
            // else minus 1 from plat_needed.
            if(p.second == 'a')
              plat_needed++;
             else
              plat_needed--;
            if(plat_needed > result)
              result = plat_needed;
        }
        
        return result;
    }
    
    
}