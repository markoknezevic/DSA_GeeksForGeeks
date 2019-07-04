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
		    String inputLine[] = br.readLine().trim().split(" ");
		    int n = Integer.parseInt(inputLine[0]);
		    int x = Integer.parseInt(inputLine[1]);
		    int arr[] = new int[n];
		    inputLine = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    System.out.println(new TripletSum().find3Numbers(arr, n, x));
		}
	}
}
}
/*This is a function problem.You only need to complete the function given below*/
//User function Template for Java
class TripletSum
{
    // function to find the triplet which sum to x
    public static int find3Numbers(int A[], int n, int x) { 
    
       Arrays.sort(A);
       for(int i=0;i<n;i++){
           for(int j=i+1;j<n;j++){
               for(int k=j+1;k<n;k++){
                   if(A[i]+A[j]+A[k]==x){
                       return 1;
                   }
                   
                   if(A[i]+A[j]+A[k]>x)
                       break;
                       
                   }
                   
                   
               }
               
           }
       
    return 0;
    }
}
