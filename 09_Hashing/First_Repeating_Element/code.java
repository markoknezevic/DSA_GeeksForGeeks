/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws IOException {
	     BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in)); 
	     
	     int t=Integer.parseInt(reader.readLine());
	     for(int l=0;l<t;l++){
	         
	         
	         int n = Integer.parseInt(reader.readLine());
	         String str[] = reader.readLine().split(" ");
	         int arr[]=new int [n];
	         int k=0;
	         for(String s:str){
	             arr[k]=Integer.parseInt(s);
	             k++;
	         }
	         
	        LinkedHashMap<Integer,Integer> map =new LinkedHashMap<Integer,Integer>();
	         for(int i=0;i<n;i++){
	             if(map.containsKey(arr[i]) != true){
	                 map.put(arr[i],1);
	             }else{
	                 map.put(arr[i],map.get(arr[i])+1);
	             }
	         }
	         
	         
	         
	         int f=1;
	         for(Integer m: map.keySet()){
	             if(map.get(m)>1){
	                 System.out.println(f);
	                 break;
	             }
	                 f++;
	         }
	         if(f==n+1)
	         System.out.println("-1");
	     }
		
	}
}