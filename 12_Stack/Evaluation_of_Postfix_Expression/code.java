{
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    System.out.println(new solve().evaluatePostFix(br.readLine().trim()));
		}
	}
}
}
/*This is a function problem.You only need to complete the function given below*/
class solve{
    public static int evaluatePostFix(String exp){
        Stack<Integer> st = new Stack<Integer>();
        
        for(int i=0;i<exp.length();i++){
            if(Character.isDigit(exp.charAt(i))){
                st.push(Character.getNumericValue(exp.charAt(i)));
            }else{
                int a=st.pop();
                int b=st.pop();
                int res=0;
                if(exp.charAt(i) == '+')
                    res = a+b;
                if(exp.charAt(i) == '-')
                    res = b-a;
                if(exp.charAt(i) == '*')
                    res = a*b;
                if(exp.charAt(i) == '/')
                    res = b/a;
                st.push(res);
            }
            
        }
        return st.peek();
    }
    
}