{
import java.io.*;
import java.util.*;
import java.lang.*;
class GFG { 
    
    public static void main (String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    int n = Integer.parseInt(br.readLine().trim());
		    String inputLine[] = br.readLine().trim().split(" ");
		    int inputN = inputLine.length;
		    GfgQueue gq = new GfgQueue();
		    try{
    		    for(int i=0, k=0; i<n; i++){
    		        if(inputLine[k].equals("i")){
    		            k++;
    		            gq.enqueue(Integer.parseInt(inputLine[k]));
    		            k++;
    		        }
    		        if(inputLine[k].equals("h")){
    		            k++;
    		            gq.front();
    		        }
    		        if(inputLine[k].equals("r")){
    		            k++;
    		            gq.dequeue();
    		        }
    		        if(inputLine[k].equals("f")){
    		            k++;
    		            gq.find(Integer.parseInt(inputLine[k]));
    		            k++;
    		        }
    		        if(k==inputN)break;
    		    }
		    } catch (ArrayIndexOutOfBoundsException ex){
		        continue;
		    }
		}
	}
}
}
/*This is a function problem.You only need to complete the function given below*/
//User function Template for Java
class GfgQueue {
    Queue<Integer> qu = new LinkedList<Integer>();
    void enqueue(int x){
        qu.add(x);
    }
    void dequeue(){
        qu.poll();
    }
    void front(){
        
        int x=qu.peek();
        System.out.println(x);
    }
    void find(int x){
        boolean elementFound = false;
        int c=0;
       while(c<qu.size()){
           if(qu.peek() == x){
               elementFound = true;
           }
           qu.add(qu.poll());
           c++;
       }
        if(elementFound){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}