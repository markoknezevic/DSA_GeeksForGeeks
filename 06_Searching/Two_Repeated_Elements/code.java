{
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args) throws IOException
	 {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int t = Integer.parseInt(br.readLine());
	    for(int i=0;i<t;i++){
	        int n = Integer.parseInt(br.readLine());
	        String l = br.readLine();
    		String[] sarr = l.split(" ");
    		int[] arr = new int[sarr.length];
    		for(int i1=0;i1<arr.length;i1++){
    			arr[i1] = Integer.parseInt(sarr[i1]);
    		}
    		
            Repeated obj = new Repeated();
            
            obj.twoRepeated(arr, n);
            	System.out.println();
    		
    		
	    }
	 }
}
}
/*This is a function problem.You only need to complete the function given below*/
class Repeated{
    // Function to find the repeated element in the array
    // arr[]: input array
    // n: size of array
    static void twoRepeated(int arr[], int n){
        
        int niz[]=new int[n+1];
  
        for(int i=0;i<n+2;i++)
        niz[arr[i]]+=1;
        
      
        int dva[]=new int[2];
        int k=0;
        for(int i=0;i<n+1;i++)
            if(niz[i]==2){
              dva[k]=i;
              k++;
            }
            
            for(int i=n+1;i>=0;i--){
                if(dva[0]==arr[i]){
                    System.out.print(dva[1]+" "+dva[0]);
                    break;
                }
                if(dva[1]==arr[i]){
                    System.out.print(dva[0]+" "+dva[1]);
                    break;
                }
            }
            
        
    }
    
}