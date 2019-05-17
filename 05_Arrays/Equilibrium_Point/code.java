
import java.io.*;
import java.util.*;
class Equilibrium{
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    int n = Integer.parseInt(br.readLine().trim());
		    long arr[] = new long[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        arr[i]=Long.parseLong(inputLine[i]);
		    }
		    
		    EquilibriumPoint obj = new EquilibriumPoint();
		    
		    System.out.println(obj.equilibriumPoint(arr, n));
		}
	}
}
//Position this line where user code will be pasted.

}

/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/


class EquilibriumPoint{
    
    // Function to find equilibrium point
    // a: input array
    // n: size of array
    public static int equilibriumPoint(long arr[], int n){
        
        int sum=0,sum2=0;
        for(int i=0;i<n;i++)
        sum+=arr[i];
        
         
        for(int i=0;i<n;i++){
        
            if((double)(sum-arr[i])/2==(double)sum2)
                return i+1;
            sum2+=arr[i];
        }
        return -1;
        
    }
    
}