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
	         
	       
	         
	         String str1[] = reader.readLine().split(" ");
	         HashMap<Integer,Integer> map1 =new HashMap<Integer,Integer>();
	         
	         for(String s:str1){
	             int par=Integer.parseInt(s);
	             if(map1.containsKey(par) != true){
	                map1.put(par,1);
	             }else{
	                 map1.put(par,map1.get(par)+1);
	             }

	         }
	         
	         
	       
	         
	          String str2[] = reader.readLine().split(" ");
	         for(String s:str2){
	             int par=Integer.parseInt(s);
	             if(map1.containsKey(par) ==true){
	                 while(map1.get(par) != 0){
	                     System.out.print(par+" ");
	                     map1.put(par,map1.get(par)-1);
	                 }
	                 map1.remove(par);
	             }
	             
	         }
	         ArrayList<Integer> arr=new ArrayList<Integer>();
	         for(Integer i : map1.keySet()){
	             while(map1.get(i) != 0){
	                arr.add(i);
	                map1.put(i,map1.get(i)-1);
	             }
	         }
	         
	         Collections.sort(arr);
	         for(Integer i : arr){
	         System.out.print(i+" ");
	         }
	         
	      
	         System.out.println("");
	     
	     }
	}
}