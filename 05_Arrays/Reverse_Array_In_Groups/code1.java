import java.io.*;
import java.util.*;
//Position this line where user code will be pasted.
class GFG {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    String inputLine1[] = br.readLine().trim().split(" ");
		    int n = Integer.parseInt(inputLine1[0]);
		    int k = Integer.parseInt(inputLine1[1]);
		    int arr[] = new int[n];
		    String inputLine2[] = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        arr[i]=Integer.parseInt(inputLine2[i]);
		    }
		    
		    Reverse obj = new Reverse();
		    
		    arr = obj.reverseInGroup(arr, n, k);
		    
		    StringBuffer str = new StringBuffer();
		    
		    for(int i=0; i<n; i++){
		        str.append(arr[i] + " ");
		    }
		    System.out.println(str);
		}
	}
}
}

/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/


class Reverse{
    
    // Function to reverse array in group of k 
    public static int[] reverseInGroup(int arr[], int n, int k) {
        
        
        for(int l=0;l<n;l=l+k){
            int i=l,j=l+k-1;
            
            if(j>n-1)
                j=n-1;
                
            while(i<j){
                int pom = arr[i];
                arr[i]=arr[j];
                arr[j]=pom;
                i++;
                j--;
                }   
        }
        return arr;
        
    }
}