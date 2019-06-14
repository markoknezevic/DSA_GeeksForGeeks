/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		
		int t = Integer.parseInt(reader.readLine());
		
		
		for(int i=0;i<t;i++){
		    int count=0;
		    int num=0;
		    int n = Integer.parseInt(reader.readLine());
		    
		    int arr[] = new int[n];
		    String niz[] = reader.readLine().split(" ");
			
		    for(int j=0;j<n;j++)
		        arr[j]=Integer.parseInt(niz[j]);
		    
		    
		    for(int j=0;j<n;j++){
		        if(j!=0 && arr[j-1] == arr[j]){
		            count++;
		            num = arr[j];
		        }
		    }
		        
		    
		        System.out.println(num+" "+(count+1));
		    
		}
		
		
	}
}