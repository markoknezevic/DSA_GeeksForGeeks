{
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
public class Driver {
    
    public static void main(String[] args)throws IOException {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while(tc-->0)
        {
            String s1 = br.readLine();
            String s2 = br.readLine();
            
            Isomorphic obj = new Isomorphic();
            
            boolean a = obj.areIsomorphic(s1,s2);
            if(a)
            System.out.println(1);
            else
            System.out.println(0);
        }
    }
    
}

}
/*This is a function problem.You only need to complete the function given below*/
class Isomorphic{
    // This function returns true if str1 and str2 are ismorphic
    // else returns false
    public static boolean areIsomorphic(String S1,String S2)
    {
        char pom1[]=new char[256];
        char pom2[]=new char[256];
        if(S1.length() != S2.length())
            return false;
            
        for(int i=0;i<S1.length();i++){
            pom1[S1.charAt(i)]++;
            pom2[S2.charAt(i)]++;
        }
        
        for(int i=0;i<S1.length();i++){
            if(pom1[S1.charAt(i)] != pom2[S2.charAt(i)])
                return false;
        }
        return true;
        
    }
}