{
import java.io.*;
import java.util.*;
class Array {
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    Trap obj = new Trap();
		    
		    System.out.println(obj.trappingWater(arr, n));
		}
	}
}

}

/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

class Trap{
    
    // function to find the trapped water in between buildings
    // arr: input array
    // n: size of array
    static int trappingWater(int arr[], int n) { 
        
        int maxl[] = new int [n];
        int maxd[] = new int [n];
        int max=0;
        for(int i=0;i<n;i++){
                maxl[i]=Math.max(max,arr[i]);
                max=maxl[i];
        }
        max=0;
        for(int i=n-1;i>=0;i--){
            maxd[i]=Math.max(max,arr[i]);
            max=maxd[i];
        }
        
        int sum=0;
        
        for(int i=1;i<n-1;i++){
            
            sum+=Math.min(maxl[i],maxd[i])-arr[i];
           
            
        }
       
        return sum;
    } 
}
