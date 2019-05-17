/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        int num = Integer.parseInt(myObj.nextLine());
       
       
         for(int i=0;i<num;i++){
            
            int br = Integer.parseInt(myObj.nextLine());
           int p=br,c=0;
           while(p>0){
               c++;
               p=p>>1;
           }
            
            
            if(c%2!=0){
                br=br^(1<<((c/2)));
            }else{
                br=br^(1<<((c/2)));
                br=br^(1<<((c/2)-1));
            }
           System.out.println(br);
           
            }
            
            
         }
	
}