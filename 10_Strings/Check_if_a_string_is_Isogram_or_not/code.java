{
/*package whatever //do not write package name here */
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
     //Position this line where user code will be pasted.
	public static void main (String[] args) throws Exception
	 {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        while(testCase-- > 0)
        {
            String data = br.readLine();
            System.out.println(isIsogram(data)?"1":"0");
            
        }
	 }
}
}
/*This is a function problem.You only need to complete the function given below*/
//This is a function problem
static boolean isIsogram(String data){
    
    
    char pom[] = new char[256];
    for(int i=0;i<data.length();i++)
        pom[data.charAt(i)]++;
    
    for(int i =0 ;i<256;i++){
        if(pom[i] > 1)
            return false;
    }