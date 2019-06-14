/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws Exception {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(reader.readLine());
    for(int k=0;k<t;k++){
        String s1[] = reader.readLine().split(" ");
        int n1 = Integer.parseInt(s1[0]);
        int n2 = Integer.parseInt(s1[1]);
        
        String prvi[] = reader.readLine().split(" ");
        String drugi[] = reader.readLine().split(" ");
        
        int arr[]=new int[n1+n2];
        int v=0,b=0,i=0;
        while(i<(n1+n2)){
            if(v<n1){
                arr[i]=Integer.parseInt(prvi[v]);
                i++;
            }
            if(v<n2){
                arr[i]=Integer.parseInt(drugi[b]);
                i++;
            }
            v++;
            b++;
            
        }
        Arrays.sort(arr);
        
      
        
        if((n1+n2)%2 == 0){
            int id=(n1+n2)/2;
            int br=(arr[id-1]+arr[id])/2;
            System.out.println(br);
        }else{
            System.out.println(arr[(n1+n2)/2]);
        }
        
    }
   
	}
}