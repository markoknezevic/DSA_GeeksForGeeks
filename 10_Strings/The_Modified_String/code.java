{
import java.util.*;
import java.io.*;
import java.lang.*;
class gfg
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        
        while(t-- > 0)
        {
            String a = "";
            a = sc.next();
            System.out.println(new solve().modified(a));
        }
    }
}
}
/*This is a function problem.You only need to complete the function given below*/
class solve{
    public static long modified(String a){
        long c=0;
        int k=1;
        for(int i=1;i<a.length();i++){
            if(a.charAt(i)==a.charAt(i-1)){
                k++;
            }else{
                k=1;
            }
            if(k==3){
                c++;
                k=1;
            }
        }
        return c;
    }
    
}