/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args)throws IOException {
	    BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in)); 
		  int t=Integer.parseInt(reader.readLine());
	     for(int l=0;l<t;l++){
	         
	         
	         
	         String br[] = reader.readLine().split(" ");
	         int n=Integer.parseInt(br[0]),m=Integer.parseInt(br[1]);
	         //System.out.print(n+" "+m);
	         
	         String str1[] = reader.readLine().split(" ");
	         int arr1[]=new int [n];
	         int k=0;
	         for(String s:str1){
	             arr1[k]=Integer.parseInt(s);
	             k++;
	         }
	         
	         
	          String str2[] = reader.readLine().split(" ");
	         int arr2[]=new int [m];
	         k=0;
	         for(String s:str2){
	             arr2[k]=Integer.parseInt(s);
	             k++;
	         }
	         HashMap<Integer,Integer> map =new HashMap<Integer,Integer>();
	         
	         for(int i=0;i<n;i++){
	                 map.put(arr1[i],1);
	         }
	         
	   
	           for(int i=0;i<m;i++){
	                if(map.containsKey(arr2[i]) == true){
	                    map.put(arr2[i],2); 
	             }
	     }
	     int fin = Collections.frequency(map.values(),2);
	     System.out.println(fin);
	     
	     }
	}
}