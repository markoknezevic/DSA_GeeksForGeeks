/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws IOException{
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		for(int k=0;k<t;k++){
		    String str = br.readLine();
		    for(int i=0;i<str.length();i++){
		        char c = str.charAt(i);
		        
		         if(c>=97 && c<=99)
        	   System.out.print(2);
    	    else
    	    if(c>=100 && c<=102)
    	        System.out.print(3);
    	    else
    	    if(c>=103 && c<=105)
    	        System.out.print(4);
    	    else
    	    if(c>=106 && c<=108)
    	        System.out.print(5);
    	    else
    	    if(c>=109 && c<=111)
    	        System.out.print(6);
    	    else
    	    if(c>=112 && c<=115)
    	        System.out.print(7);
    	    else
    	    if(c>=116 && c<=118)
    	        System.out.print(8);
    	    else
    	    if(c>=119 && c<=122)
    	        System.out.print(9);
		        
		    }
		 System.out.println("");   
		}
		
	}
}