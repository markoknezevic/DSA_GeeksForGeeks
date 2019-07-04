/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws IOException {
	    BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in)); 
		  int t=Integer.parseInt(reader.readLine());
	     for(int l=0;l<t;l++){
	         
	         
	         
	         String br[] = reader.readLine().split(" ");
	         int n=Integer.parseInt(br[0]),m=Integer.parseInt(br[1]);
	         //System.out.print(n+" "+m);
	         HashSet<Integer> fin=new HashSet<Integer>();
	         String str1[] = reader.readLine().split(" ");
	         for(String s:str1){
	             fin.add(Integer.parseInt(s));
	             
	         }
	         
	         
	          String str2[] = reader.readLine().split(" ");
	         for(String s:str2){
	             fin.add(Integer.parseInt(s));
	         }

	             System.out.println(fin.size());
	     
	     
	     }
	}
}