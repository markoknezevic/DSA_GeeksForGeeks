{
//Initial Template for Java
import java.util.*;
import java.io.*;
import java.lang.*;
class getMin
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
              arr[i] = sc.nextInt();
              
            Stack<Integer>mys = new GetMin()._push(arr,n);
            new GetMin()._getMinAtPop(mys);
            System.out.println();
        }
    }
}
}
/*This is a function problem.You only need to complete the function given below*/
//User function Template for Java
class GetMin
{
    
    /* inserts elements of the array into 
        stack and return the stackn*/
    public static Stack<Integer> _push(int arr[],int n)
    {
        Stack<Integer> st = new Stack<Integer>();
        st.push(arr[0]);
        for(int i=1;i<arr.length;i++){
            if(st.peek()>arr[i]){
                st.push(arr[i]);
            }else{
                st.push(st.peek());
            }
        }

        return st;
    }
    
    /* print minimum element of the stack each time
       after popping*/
    static void _getMinAtPop(Stack<Integer>s)
    {
        while(s.empty() == false){
            System.out.print(s.pop()+" ");
        }
    }
}