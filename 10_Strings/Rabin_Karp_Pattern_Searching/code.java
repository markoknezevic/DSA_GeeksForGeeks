{
//Initial Template for Java
import java.util.*;
import java.lang.*;
import java.io.*;
class gfg
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t  =sc.nextInt();
        
        while(t-- >0)
        {
            String s = "", p = "";
            s = sc.next();
            p = sc.next();
            
            int q = 101;
            
            match obj = new match();
            
            if(obj.search(p, s, q) == true)
             System.out.println("Yes");
            else
              System.out.println("No");
        }
    }
}
}
/*This is a function problem.You only need to complete the function given below*/
//User function Template for Java
class match
{
    static int d= 256;
    
    static boolean search(String pat, String txt, int q)
    {
            return (txt.indexOf(pat)>=0);
    }
}