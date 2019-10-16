{
import java.util.*;
import java.io.*;
import java.lang.*;
class GFG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            long n = sc.nextLong();
            new solve().generate(n);
            System.out.println();
        }
    }
}
}
/*This is a function problem.You only need to complete the function given below*/
class solve{
    static void generate(long n)
    {   
        Queue<String> qu = new LinkedList<String>();
        for(int i=1;i<=n;i++){
           System.out.print(Integer.toBinaryString(i)+" "); 
        }
        
        
    }
    
}