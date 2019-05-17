
import java.io.*;
import java.util.*;
class ArrayFrequency {
    
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
		    
		    Frequency obj = new Frequency();
		    
		    System.out.println(obj.getFrequencies(arr, n));
		}
	}
}

}

/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/


class Frequency{
    
    // Function to count frequencies of elements in the array
    // arr: input array
    // n: size of array
    public static StringBuffer getFrequencies(int arr[], int n){
        
         for(int i=0;i<n;i++){
            arr[i]--;
        }
       
       
        for(int i=0;i<n;i++){
            arr[arr[i]%n] = arr[arr[i]%n]+n;
        }
        
        
        StringBuffer fin=new StringBuffer("");
       for(int i=0;i<n;i++){
           fin.append((arr[i]-arr[i]%n)/n+" " );
       }
        
        return fin;
        
    }
}