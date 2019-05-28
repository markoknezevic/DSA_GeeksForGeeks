/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n =Integer.parseInt(sc.nextLine());
		for(int i=0;i<n;i++){
		    int sum=0;
		    
		    String str=sc.nextLine();
		    for(int j=0;j<str.length();j++){
		        sum+=(int)str.charAt(j);
		    }
		    
		    System.out.println(sum/str.length());
		}
	}
}