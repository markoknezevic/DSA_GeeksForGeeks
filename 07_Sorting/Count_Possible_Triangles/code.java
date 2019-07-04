{
//Initial Template for Java
import java.util.*;
import java.io.*;
import java.lang.*;
class Sorting
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i = 0; i < n; i++)
              arr[i] = sc.nextInt();
             System.out.println(new Count_possible_triangle().findNumberOfTriangles(arr, n));
        }
    }
}
}
/*This is a function problem.You only need to complete the function given below*/
//User function Template for Java
class Count_possible_triangle
{
    // Function to find number of triangles that can be formed
    // arr[]: input array
    // n: size of array
    static long findNumberOfTriangles(int arr[], int n)
    {
        long c=0;
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    if(arr[i]+arr[j]>arr[k])
                        c++;
                }
            }
        }
        
        return c;
    }
}