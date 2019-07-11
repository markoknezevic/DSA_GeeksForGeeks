{

/*package whatever //do not write package name here */
import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	    
	    Scanner sc=new Scanner(System.in);
	    
	    int testcases=sc.nextInt();
	    
	    while(testcases-->0)
	    {
	        int sizeOfStack =sc.nextInt();
	        
	        Stack <Integer> myStack=new Stack<>();
	        
	        for(int i=0;i<sizeOfStack;i++)
	        {
	            int x=sc.nextInt();
	            myStack.push(x);
	            
	        }
	        
	        if(sizeOfStack==1)
	        {
	            System.out.println(myStack.peek());
	        }
	        else
	        {
	            Geeks obj=new Geeks();
	            Stack <Integer> modified=obj.deleteMid(myStack,sizeOfStack,0);
	            
	            while(!modified.isEmpty())
	            {
	                System.out.print(modified.peek()+" ");
	                modified.pop();
	            }
	            System.out.println();
	        }
	    }
	    
	    
	}
}

}
/*This is a function problem.You only need to complete the function given below*/
//User function Template for Java
class Geeks
{
    //Complete this function
    public Stack<Integer> deleteMid(Stack<Integer>s,int sizeOfStack,int current)
    {
       
        if(s.empty() == true){
            return s;
        }
            int a = s.pop();
            s = deleteMid(s,sizeOfStack,current+1);
            
        
        
        if(current != sizeOfStack/2)
            s.push(a);
            
        return s;
      
    } 
}
