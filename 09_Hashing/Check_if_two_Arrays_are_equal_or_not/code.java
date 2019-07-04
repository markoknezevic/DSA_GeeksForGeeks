/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws IOException{
		     BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in)); 
	     
	     int t=Integer.parseInt(reader.readLine());
	     for(int l=0;l<t;l++){
	         
	         HashSet<Long> set=new HashSet<Long>();
	         
	         int n = Integer.parseInt(reader.readLine());
	         String str[] = reader.readLine().split(" ");
	   
	         for(String s:str){
	             set.add(Long.parseLong(s));
	             
	         }
	         
	         String str2[] = reader.readLine().split(" ");
	            boolean pr=true;
	         for(String s:str2){
	             if(set.contains(Long.parseLong(s)) == true){
	                set.add(Long.parseLong(s));
	             }else{
	                   System.out.println("0");
	                    pr=false;
	                   break;
	                  
	             }
	             
	         }
	         
	         if(pr){
	            System.out.println("1");    
	         }
	         
	      
	     }
	}
}