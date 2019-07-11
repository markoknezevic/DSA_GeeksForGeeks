{
//Initial Template for Java
import java.util.*;
import java.io.*;
import java.lang.*;
class Driverclass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            String S = sc.next();
            System.out.println(new RankOfString().findRank(S));
        }
    }
}
}
/*This is a function problem.You only need to complete the function given below*/
//User function Template for Java
class RankOfString
{
    static int findRank(String S) 
    {
        int rank=1;
        int mul =1;
        for(int i=2;i<=S.length();i++)
            mul*=i;
            
        int pom[] = new int[256];
        for(int i=0;i<S.length();i++){
            pom[S.charAt(i)]++;
        }
         for(int i=1;i<256;i++){
            if(pom[i]>1)
                return 0;
        }
        
        for(int i=1;i<256;i++){
            pom[i]=pom[i]+pom[i-1];
        }
        
        
        for(int i=0;i<S.length();i++){
            mul=mul/(S.length()-i);
            rank=rank+pom[S.charAt(i)-1]*mul;
            
            for(int j=S.charAt(i);j<256;j++){
                pom[j]--;
            }
        }
        return rank;
    }
}