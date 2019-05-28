/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	    
		Scanner sc = new Scanner(System.in);
		
		int n =Integer.parseInt(sc.nextLine());
		for(int i=0;i<n;i++){
		 int a=sc.nextInt();
		 int b=sc.nextInt();
		 int arr[]=new int[a];
		 boolean tr =false;
		 for(int j=0;j<a;j++)
		    arr[j]=sc.nextInt();
		  
		  
	
		 for(int j=0;j<a-1;j++)
		    for(int k=j+1;k<a;k++)
		        if((arr[j]^arr[k])==b){
		            tr=true;
		            k=a;
		            j=a;
		        }
		        
		   
		  if(tr){
		  System.out.println("Yes");
		  }else{
		      System.out.println("No");
		  }
		}
	}
}