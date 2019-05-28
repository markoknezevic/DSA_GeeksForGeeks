{

import java.util.*;
import java.lang.*;
import java.io.*;
class Rearrange {
	public static void main (String[] args){
		Scanner in = new Scanner(System.in);
        
		int t = in.nextInt();
		
		while(t-- >0)
		{
		    int n = in.nextInt();
		    int[] temp= new int[n];
		    
		    for(int i=0;i<n;i++)
		        temp[i] = in.nextInt();
		    
		    // StringBuffer sb = new StringBuffer();
		    
		    RearrangeAlternate obj = new RearrangeAlternate();
		    
		    System.out.println(obj.rearrange(temp, n));
		}
	}
}
}

/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/


class RearrangeAlternate{
    
    // This function wants you to rearrange the temp array as required
    // and returns a StringBuffer with all elements of modified temp array
    // appended to it.
    // temp: input array
    // n: size of array
    public static StringBuffer rearrange(int temp[], int n){
        Stack<Integer> min = new Stack<Integer>();
        Stack<Integer> max =new Stack<Integer>();
        
        int i,j;
        
  
        i=n/2-1;
        j=n/2;
        
        
        
        while(i>=0||j<n){
            if(i>=0)
                min.push(temp[i]);
                max.push(temp[j]);
            i--;
            j++;
        }
        StringBuffer fin=new StringBuffer();
        while(!(min.empty())&&!(max.empty())){
            fin.append(max.pop()+" ");
            fin.append(min.pop()+" ");
            
        }
        if(n%2!=0)
            fin.append(max.pop());
        return fin;
    }
    
}