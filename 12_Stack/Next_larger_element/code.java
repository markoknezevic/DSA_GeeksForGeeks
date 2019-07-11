{
/*package whatever //do not write package name here */
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    int n = Integer.parseInt(br.readLine().trim());
		    String inputLine[] = br.readLine().trim().split(" ");
		    long[] arr = new long[n];
		    for(int i=0; i<n; i++)arr[i]=Long.parseLong(inputLine[i]);
		    new solve().printNGE(arr, n);
		    System.out.println();
		}
	}
}

}
/*This is a function problem.You only need to complete the function given below*/
class solve{
    public static void printNGE(long[] arr, int n) { 
       
       Stack<Long> st = new Stack<Long>();
       Stack<Long> fin = new Stack<Long>();
       for(int i=arr.length-1;i>=0;i--){
           
           while(st.empty() == false && st.peek() <= arr[i]){
               
               st.pop();
           }
           if(st.empty() == true){
               
               fin.push((long)-1);
           }else{
               fin.push(st.peek());
           }
           st.push(arr[i]);
           
       }
       
        while(fin.empty() == false)
            System.out.print(fin.pop()+" ");
    } 
}