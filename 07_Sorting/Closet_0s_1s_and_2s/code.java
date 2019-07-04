{
//Initial Template for Java
import java.io.*;
import java.util.*;
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
		    new Sort012().segragate012(arr, n);
		    StringBuffer str = new StringBuffer();
		    for(int i=0; i<n; i++){
		        str.append(arr[i]+" ");
		    }
		    System.out.println(str);
		}
	}
}
}
/*This is a function problem.You only need to complete the function given below*/
//User function Template for Java
class Sort012
{
    // Function to segregate 0s, 1s and 2s
    // A[]: input array
    // n: size of array
    public static void segragate012(int A[], int n){
        int lo=0,hi=n-1,mid=0;
        while(mid <= hi){
        
            switch(A[mid]){
                case 0:{
                    int pom=A[lo];
                    A[lo]=A[mid];
                    A[mid]=pom;
                    lo++;
                    mid++;
                    break;
                }
                case 1:{
                    mid++;
                    break;
                }
                case 2:{
                    int pom=A[mid];
                    A[mid]=A[hi];
                    A[hi]=pom;
                    hi--;
                    break;
                }
            }
        }
    }
}