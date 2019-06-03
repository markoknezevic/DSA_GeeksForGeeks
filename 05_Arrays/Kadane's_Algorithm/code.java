{
import java.io.*;
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
		    
		    Kadane obj = new Kadane();
		    
		    System.out.println(obj.maxSubarraySum(arr, n));
		}
	}
}
}
/*This is a function problem.You only need to complete the function given below*/
class Kadane{
    
    // Function to find subarray with maximum sum
    // arr: input array
    // n: size of array
    int maxSubarraySum(int arr[], int n){
        
        int maxe=0,maxf=0;
        
        for(int i=0;i<n;i++){
            maxe+=arr[i];
            if(maxe<0)
                maxe=0;
                
            maxf=Math.max(maxf,maxe);
        }
        int max=arr[0];
        for(int i=0;i<n;i++)
            max=Math.max(max,arr[i]);
        if(maxf==0)
            return max;
        else
            return maxf;
        
    }
    
}