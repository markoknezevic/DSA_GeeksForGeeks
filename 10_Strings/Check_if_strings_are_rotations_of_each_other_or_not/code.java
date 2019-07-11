{
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    
	public static void main (String[] args)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    String s = br.readLine();
		    String x = br.readLine();
		    
		    Rotate obj = new Rotate();
		    
		    if(obj.areRotations(s,x))
		    {
		        System.out.println("1");
		    }
		    else
		    {
		        System.out.println("0");
		    }
		}
	}
}
}
/*This is a function problem.You only need to complete the function given below*/
class Rotate{
    
    /*  Function to check if two strings are rotations of each other
    *   s1, s2: are the input strings
    */
    public static boolean areRotations(String s, String x )
    {
        if(s.length() != x.length())
            return false;
            
        s=s.concat(s);
        return (s.indexOf(x)>=0);
    }
    
}