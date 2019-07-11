{
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		   String str = br.readLine().trim();
		   System.out.println(new solve().removeConsecutiveDuplicates(str));
		}
	}
}
}
/*This is a function problem.You only need to complete the function given below*/
class solve
{
    // Function to print string after removing consecutive duplicates
    public static String removeConsecutiveDuplicates(String str){
        Stack<Character> st = new Stack<Character>();
        st.push(str.charAt(str.length()-1));
        for(int i=str.length()-2;i>=0;i--){
            if(st.peek() != str.charAt(i)){
                st.push(str.charAt(i));
            }
        }
        String t = "";
        while(st.empty() == false){
            t+=st.pop();
        }
        return t;
    }
}