//Initial Template for Java
/*package whatever //do not write package name here */
import java.io.*;
import java.util.*;
//Position this line where user code will be pasted.
// Driver class
class Array {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    int sizeOfArray = Integer.parseInt(br.readLine());
		    
		    int arr[] = new int[sizeOfArray];
		    
		    String line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    
		    for(int index = 0;index < sizeOfArray; index++){
		        arr[index] = Integer.parseInt(elements[index]);
		    }
		    
		    StrongestNeighbour obj = new StrongestNeighbour();
		    obj.maximumAdjacent(sizeOfArray, arr);
		}
	}
}
}

/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

//User function Template for Java
// Solution class to implement function largestAndSecondLargest
class StrongestNeighbour{
    
    // Function to find maximum of all adjacents
    static void maximumAdjacent(int sizeOfArray, int arr[]){
        
        for(int i=0;i<sizeOfArray-1;i++){
            if(arr[i] > arr[i+1])
                System.out.print(arr[i]+" ");
            else
                System.out.print(arr[i+1]+" ");
        }
        System.out.println("");
        
    }
}