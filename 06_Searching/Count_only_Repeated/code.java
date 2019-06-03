/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		
		for(int i=0;i<t;i++){
		    int count=0;
		    int num=0;
		    int n = sc.nextInt();
		    int arr[] = new int[n];
		    
		    for(int j=0;j<n;j++){
		        arr[j]=sc.nextInt();
		        if(j!=0 && arr[j-1] == arr[j]){
		            count++;
		            num = arr[j];
		        }
		    }
		        
		    
		        System.out.println(num+" "+(count+1));
		    
		}
		
		
	}
}