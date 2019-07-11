{
import java.util.*;
import java.io.*;
import java.lang.*;
class gfg
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String s = "", p = "";
            s = sc.next();
            p = sc.next();
            
            Search obj = new Search();
            
            if(obj.search(p, s) == true)
              System.out.println("Yes");
             else
              System.out.println("No");
            
        }
    }
}
}
/*This is a function problem.You only need to complete the function given below*/
class Search{
    /*  function to search for a pattern with distinct characters
    *   pat: pattern(to be searched in txt) given in the input
    *   txt: string given in the input
    */
    static boolean search(String pat, String txt)
    {
          int n = txt.length(), m = pat.length();
            for(int i=0;i<n;i++){
                int j=0;
                for(j=0;j<m;j++)
                    if(pat.charAt(j) != txt.charAt(i+j))
                        break;
                        
                if(j==m)
                    return true;
                if(j==0){
                    i++;
                }else{
                    i=i+j;
                }
            }
            return false;
            
    }
}
