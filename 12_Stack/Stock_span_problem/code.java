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
            int n =sc.nextInt();
            int a[] = new int[n];
            int s[] = new int[n];
            
            int i = 0;
            for(i = 0; i < n; i++)
              a[i] = sc.nextInt();
              
            new solve().calculateSpan(a, n, s);
            
            for(i = 0; i < n; i++)
            {
                System.out.print(s[i] + " ");
            }
            
            System.out.println();
        }
    }
    
    
    
}
}
/*This is a function problem.You only need to complete the function given below*/
class solve{
    
    // Function to calculate span
    // price[]: input array
    public static void calculateSpan(int price[], int n, int S[])
    {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        Stack<Integer> st = new Stack<Integer>();
        st.push(price[0]);
        S[0]=1;
        map.put(price[0],1);
        
        int c=1;
        for(int i = 1;i<price.length;i++){
            
            while(st.empty() == false && st.peek() <= price[i]){
                
                c+=map.get(st.peek());
                
                
                st.pop();
            }
            st.push(price[i]);
            S[i]=c;
            map.put(price[i],c);
            c=1;
        }
    }
    
}