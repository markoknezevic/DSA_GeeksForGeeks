{
import java.lang.*;
import java.io.*;
class GFG
{
	public static void main (String[] args) throws IOException
	{
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 int tc=Integer.parseInt(br.readLine().trim());
	 
	 while(tc-- >0)
	 {
	     String line=br.readLine().trim();
	     
	     MaxOccur obj = new MaxOccur();
	     
	     System.out.println(obj.getMaxOccuringChar(line));
	     
	 }
	 }
}
}
/*This is a function problem.You only need to complete the function given below*/
class MaxOccur{
    
    // Function to get maximum occuring 
    // character in given string str
    public static char getMaxOccuringChar(String line){
        
        int pom[] = new int[256];
        for(int i=0;i<line.length();i++){
            pom[line.charAt(i)]++;
        }
        int max =0;
        for(int i=0;i<256;i++){
            max = Math.max(max,pom[i]);
        }
        
        for(int i=0;i<256;i++){
            if(pom[i]==max)
                return (char)i;
        }
       
    }
    
}