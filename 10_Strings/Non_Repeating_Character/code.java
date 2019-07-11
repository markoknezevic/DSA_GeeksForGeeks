{
//Initial Template for Java
import java.io.*;
import java.lang.*;
import java.util.*;
class Driverclass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String st = sc.next();
            
            char ans=new Repeatation().nonrepeatingCharacter(st);
            
            if(ans!='$')
            System.out.println(ans);
            else
            System.out.println(-1);
        }
    }
}

}
/*This is a function problem.You only need to complete the function given below*/
//User function Template for Java
class Repeatation
{
    static char nonrepeatingCharacter(String S)
    {
        char pom1[] = new char[256];
        
        for(int i=0;i<S.length();i++){
            pom1[S.charAt(i)]++;
        }
        
        for(int i=0;i<S.length();i++){
            if(pom1[S.charAt(i)] == 1)
                return S.charAt(i);
        }
        return '$';
    }
}