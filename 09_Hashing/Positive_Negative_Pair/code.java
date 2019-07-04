/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws IOException {
	   
	   BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in)); 
	     
	     int t=Integer.parseInt(reader.readLine());
	     for(int l=0;l<t;l++){
	         
	         LinkedHashSet<Integer> map =new LinkedHashSet<Integer>();
	         LinkedHashSet<Integer> fin =new LinkedHashSet<Integer>();
	         int n = Integer.parseInt(reader.readLine());
	         String str[] = reader.readLine().split(" ");
	         
	         for(String s:str){
	             int pr = Integer.parseInt(s);
	             
	            
	            
	             if(map.contains((-pr)) != true){
	                 if(pr != 0)
	             map.add(pr);
	             
	             }else{
	              fin.add(Math.abs(pr));
	             
	             }
	         }
	         int arr[]=new int[fin.size()];
	      
	          //System.out.println("Fin "+fin);
	          
	             int f=0;
	             for(Integer j : fin){
	                 arr[f]=j;
	                 f++;
	             }
	             Arrays.sort(arr);
	             for(int j : arr){
	                 System.out.print(j+" ");
	                 System.out.print(-j+" ");
	             }
	             if(fin.size()==0)
	             System.out.println("0");
	      
	        
	         
	     
	     }
		
	}
}