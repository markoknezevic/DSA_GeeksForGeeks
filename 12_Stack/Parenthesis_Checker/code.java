{
import java.util.*;
import java.io.*;
import java.lang.*;
class Driverclass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        
        while(t-- >0)
        {
            String st = sc.next();
            if(new Parenthesis().ispar(st) == true)
                System.out.println("balanced");
            else
                System.out.println("not balanced");
        
        }
    }
}
}
/*This is a function problem.You only need to complete the function given below*/

class Parenthesis
{
    // Function to return if the paranthesis are balanced or not
    static boolean ispar(String x)
    {
        Stack<Character> st = new Stack<Character>();
        
        for(int i =0;i<x.length();i++){
            if(x.charAt(i) =='(' || x.charAt(i) =='[' || x.charAt(i) =='{'){
                st.push(x.charAt(i));
            }else{
                if(st.empty()==true)
                    return false;
                if(x.charAt(i) == (char)(st.peek()+1) || x.charAt(i) == (char)(st.peek()+2)){
                    st.pop();
                }else{
                    return false;
                }
            }
        }
        //char a = '(';
        //System.out.println((char)(a+1));
        if(st.empty()==true){
        return true;
        }else{
            return false;
        }
    }
}
