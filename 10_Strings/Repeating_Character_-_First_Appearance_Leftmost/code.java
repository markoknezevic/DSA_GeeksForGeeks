{
//Initial Template for Java
import java.io.*;
import java.util.*;
import java.lang.*;
class Driverclass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String str = sc.next();
            int index = new Repeatation().repeatedCharacter(str);
            if(index == -1)
                System.out.println("-1");
            else
                System.out.println(str.charAt(index));
        }
    }
}
}
/*This is a function problem.You only need to complete the function given below*/
//User function Template for Java
class Repeatation
{
    static int repeatedCharacter(String S)
    {
        char pom1[] = new char[256];
        int pom2[] = new int[256];
        
        
        for(int i=0;i<S.length();i++){
            pom1[S.charAt(i)]++;
            
            if(pom1[S.charAt(i)] == 1)
                pom2[S.charAt(i)]=i;
        }
        
        for(int i=0;i<S.length();i++){
            if(pom1[S.charAt(i)] > 1)
                return pom2[S.charAt(i)];
        }
        return -1;
    }
}