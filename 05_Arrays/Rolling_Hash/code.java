/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		    
		Scanner sc = new Scanner(System.in);
		
		int n =Integer.parseInt(sc.nextLine());
		for(int i=0;i<n;i++){
		 String st=sc.nextLine();
		 String tt=sc.nextLine();
		 int sum=0;
		 int sum2=0;
		 StringBuilder fin=new StringBuilder();
		 for(int j=0;j<tt.length();j++)
		    sum+=(int)tt.charAt(j)-96;

            for(int k=0;k<st.length()-tt.length()+1;k++){
                sum2=0;
                fin.setLength(0);
                for(int j=k;j<k+tt.length();j++){
                    sum2+=(int)st.charAt(j)-96;
                    fin.append(st.charAt(j));
                    
                }
                StringBuilder a=new StringBuilder();
               
                if(sum2==sum){
                    System.out.println(fin+" "+k);
                }
            }
            		 
		}
	}
}