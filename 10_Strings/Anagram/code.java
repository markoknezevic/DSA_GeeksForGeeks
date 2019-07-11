{
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    
	public static void main (String[] args)throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    String str = br.readLine();
		    String s1 = str.split(" ")[0];
		    String s2 = str.split(" ")[1];
		    
		    Anagram obj = new Anagram();
		    
		    if(obj.isAnagram(s1,s2))
		    {
		        System.out.println("YES");
		    }
		    else
		    {
		         System.out.println("NO");
		    }
		    
		    
		    
		}
	}
}
}
/*This is a function problem.You only need to complete the function given below*/

class Anagram{    
    /*  Function to check if two strings are anagram
    *   c, d: input string
    */
    public static boolean isAnagram(String s1,String s2)
    {
        
        if(s1.length() != s2.length() )
            return false;
            
        char pom[] = new char[256]; 
        for(int i=0;i<s1.length();i++){
            pom[s1.charAt(i)]++;
            pom[s2.charAt(i)]--;
        }
        
        boolean fin =true;
        for(int i=0;i<256;i++){
            if(pom[i] != 0)
                fin=false;
        }
        
        return fin;
        
        
    }
}