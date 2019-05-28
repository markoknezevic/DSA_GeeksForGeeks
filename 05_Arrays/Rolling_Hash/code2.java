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
		 int suma[];
		 if(st.length()>tt.length()){
		    suma=new int[st.length()-tt.length()+1];
		 
		  suma=new int[1];
		 for(int j=0;j<tt.length();j++)
		    sum+=(int)tt.charAt(j)-96;
		    
		    
		    boolean ef=false;
		    boolean ikad=false;
            int br=0;
            int s=0;
            
            for(int k=0;k<st.length();k++){
            fin.append(st.charAt(k));
            s+=(int)st.charAt(k)-96;
         //System.out.println("Radi");
            if(ef){
                s-=(int)fin.charAt(0)-96;
                fin.deleteCharAt(0);
            }
            if((k+1)%tt.length()==0){
                ef=true;
            }
           
            if(sum==s&&ef){
                    System.out.println(fin+" "+(k-tt.length()+1));
                    ikad=true;
                }
		}
		if(!ikad)
		  System.out.println("-1");
		}else{
		    System.out.println("-1");
		}
	}
}
    
}