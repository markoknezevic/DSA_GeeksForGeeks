{
import java.lang.*;
import java.io.*;
//Position this line where user code will be pasted.
class GFG
 {
	public static void main (String[] args) throws IOException
	 {
	  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	  int t=Integer.parseInt(br.readLine());
	  while(t-->0)
	  {
	    String s=br.readLine().trim();
	    
	    System.out.println(new solve().checkPanagram (s)==true?1:0);
	  }
	  
	 }
}
}
/*This is a function problem.You only need to complete the function given below*/
class solve
{
    public static boolean checkPanagram  (String s)
    {
        int pom[] = new int[256];
        for(int i=0;i<s.length();i++){
            pom[Character.toLowerCase(s.charAt(i))]++;
        }
       
        
        for(int i=97;i<123;i++){
            if(pom[i] == 0)
                return false;
        }
    
        return true;
    }
}