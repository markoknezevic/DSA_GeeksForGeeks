{
//Initial Template for Java
import java.util.*;
import java.io.*;
import java.lang.*;
class Sorting
{
    public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    long x = Long.parseLong(br.readLine().trim());
		    System.out.println(new Closer_to_sort().closer(arr, n, x));
		}
	}
}
}
/*This is a function problem.You only need to complete the function given below*/
//User function Template for Java
class Closer_to_sort
{
    // Function to find the element x in input array arr[]
    // n: size of array
    // x: element to find
    static long closer(int arr[], int n, long x)
    {
        for(int i=1;i<n;i=i+2){
            if(arr[i-1]==x)
                return i-1;
                
            if(arr[i]==x)
                return i;
                
            if(arr[i+1]==x)
                return i+1;
                
        }
        return 0;
    }
}