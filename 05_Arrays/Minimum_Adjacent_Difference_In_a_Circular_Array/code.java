import java.io.*;
import java.util.*;
import java.lang.*;
//Position this line where user code will be pasted.
class GFG {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        arr[i]=Integer.parseInt(inputLine[i]);
		    }
		    
		    Difference obj = new Difference();
		    
		    System.out.println(obj.minAdjDiff(arr, n));
		}
	}
}

}

/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

class Difference{
    public static long minAdjDiff(int arr[], int n) {
        long min=Math.abs(arr[n-1]-arr[0]);
        for(int i=1;i<n;i++){
            if(Math.abs((arr[i-1]-arr[i]))<min)
                min=Math.abs(arr[i-1]-arr[i]);
        }
        return min;
        
    }
}