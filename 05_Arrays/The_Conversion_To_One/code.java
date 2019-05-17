/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        int num = Integer.parseInt(myObj.nextLine());
       
        int c=0;
         for(int i=0;i<num;i++){
            c=0;
            int br = Integer.parseInt(myObj.nextLine());
           
            while(br!=1){
                if(br%2==0)
                    br=br/2;
                else
                    br=br-1;
                    
                c++;
                
            }
            System.out.println(c);
            
         }
	}
}