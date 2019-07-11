{
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t;
		t = sc.nextInt();
		String s12 = sc.nextLine();
		for(int i=0; i<t; i++){
		    String s1 = sc.nextLine();
		    String s2 = sc.nextLine();
		    
		    Rotation obj = new Rotation();
		    
		    boolean flag = obj.isRotated(s1, s2);
		    
		    if(flag == true) System.out.println("1");
		    else System.out.println("0");
		    
		}
	}
}
}
/*This is a function problem.You only need to complete the function given below*/
class Rotation{
    
    /*  Function to check if two strings are rotated
    *   s1, s2: input strings
    */
    public static boolean isRotated(String s1, String s2){
        
        //s1=s1.concat(s2);
        String pom = s1.substring(2,s1.length());
        pom=pom.concat(s1.substring(0,2));
        
        
        if(pom.indexOf(s2)==0)
            return true;
            
            
        pom="";
        pom = s1.substring(s1.length()-2,s1.length());
        pom=pom.concat(s1.substring(0,s1.length()-2));
        
        
        if(pom.indexOf(s2)==0)
            return true;
        
        return false;
        
    }
    
}