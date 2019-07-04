{
//Initial Template for Java
import java.util.*;
import java.io.*;
import java.lang.*;
class Sorting 
{
    	public static void main (String[] args) throws Exception
	{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int g = 0;g < t;g++)
        {
            String[] str = (br.readLine()).trim().split(" ");
            int n = Integer.parseInt(str[0]);
            int m = Integer.parseInt(str[1]);
            
            int[] x = new int[n];
            str = (br.readLine()).trim().split(" ");
            for(int i = 0;i< n;i++)
                x[i] = Integer.parseInt(str[i]);
                
            str = (br.readLine()).trim().split(" ");
            int[] y = new int[m];
            for(int i = 0;i< m;i++)
            {
                y[i] = Integer.parseInt(str[i]);
                
            }
            System.out.println(new Num_of_pair().countPairs(x, y, n, m));
           
        }
	}
}

}
/*This is a function problem.You only need to complete the function given below*/
//User function Template for Java
class Num_of_pair
{
    // Function to count number of pairs of x, y
    // x[], y[]: input array elements
    // n, m: size of arrays x[] and y[] respectively
    static long countPairs(int x[], int y[], int n, int m)
    {
        Arrays.sort(x);
        Arrays.sort(y);
        long c=0;
       /* for(int i=0;i<n;i++)
            System.out.print(x[i]+" ");
        System.out.println(" ");
        for(int i=0;i<n;i++)
            System.out.print(y[i]+" ");*/
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(Math.pow(x[i],y[j])>Math.pow(y[j],x[i])){
                    c++;
                }
            }
        }
        return c;
    }
}