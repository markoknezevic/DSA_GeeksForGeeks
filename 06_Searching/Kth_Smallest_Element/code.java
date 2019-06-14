/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		
		for(int i=0;i<t;i++){
		    long count=0;
		    long num=0;
		    int n = sc.nextInt();
		    
		    long arr[] = new long[n];
		    for(int j=0;j<n;j++){
		        arr[j]=sc.nextLong();
		    }
		    
		    int k = sc.nextInt();
		    Arrays.sort(arr);
		    
		    System.out.println(arr[k-1]);
		    
		}
	}
}