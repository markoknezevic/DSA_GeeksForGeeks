{
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
	public static void main (String[] args) throws IOException{
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st=new StringTokenizer(br.readLine());
	    int t=Integer.parseInt(st.nextToken());
	    while(t-->0){
	        String s=br.readLine();
	        
	        SumNumbers obj = new SumNumbers();
	        
	        System.out.println(obj.findSum(s));
	    }
		
	}
}
}
/*This is a function problem.You only need to complete the function given below*/
class SumNumbers{
    
    // Function to find the sum of all
    // the numbers in the given string s
    public static long findSum(String s){
        
        long sum=0;
        String str="";
        for(int i=0;i<s.length();){
            str="0";
            int k=1;
            for(int j=i;j<s.length();j++){
                
                if(Character.isDigit(s.charAt(j))){
                    str+=s.charAt(j);
                    k++;
                }else{
                    break;
                }
            }
            i+=k;
        
            sum += Integer.parseInt(str);
        }
  
        
        return sum;
        
        
    }
    
}