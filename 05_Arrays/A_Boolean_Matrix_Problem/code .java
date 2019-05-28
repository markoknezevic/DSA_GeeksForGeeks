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
		 int arr[][]=new int[a][b];
		 ArrayList<Integer> niz =new ArrayList<Integer>();
		 for(int j=0;j<a;j++)
		    for(int k=0;k<b;k++){
		    arr[j][k]=sc.nextInt();
		    if(arr[j][k]==1)
		    niz.add(j);
		    }
		    
		  
		    for(int j=0;j<a;j++){
		    for(int k=0;k<b;k++){
		        if(niz.contains(j)){
		            System.out.print("1 ");
		        }else{
		            System.out.print("0 ");
		        }
		    }
		    System.out.println("");
		    }
		  
		 
		}
	}
}