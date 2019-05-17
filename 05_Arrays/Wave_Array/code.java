import java.io.*;
import java.util.*;
class ArrayWave {
    
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
		    
		    Wave obj = new Wave();
		    
		    
		    arr = obj.convertToWave(arr, n);
		    
		    StringBuffer sb = new StringBuffer(); 
            for (int i = 0; i < n; i++) 
                sb.append(arr[i] + " "); 
                
		    System.out.println(sb);
		}
	}
}
//Position this line where user code will be pasted.

}

/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

class Wave{
    
    // Function to convert the given array to wave like array
    // arr: input array
    // n: size of the array
    public static int[] convertToWave(int arr[], int n){
        
        for(int i=1;i<n;i=i+2){
            int pom=arr[i];
            arr[i]=arr[i-1];
            arr[i-1]=pom;
        }
        return arr;
    }
    