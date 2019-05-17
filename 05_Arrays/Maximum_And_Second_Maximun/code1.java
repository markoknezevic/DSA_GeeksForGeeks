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
		    
		    ArrayMax obj = new ArrayMax();
		    obj.largestAndSecondLargest(sizeOfArray, arr);
		}
	}
}
}

/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

        
//User function Template for Java
// Solution class to implement function largestAndSecondLargest
class ArrayMax{
    
    // Function to find largest and second largest element in the array
    static void largestAndSecondLargest(int sizeOfArray, int arr[]){
        
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
       
       max = arr[0];
       for(int i=0;i < sizeOfArray;i++){
           if(max < arr[i]){
               max2 = max;
               max = arr[i];
           }else if(max2< arr[i] && arr[i] != max){
               max2=arr[i];
           }
       }
       if(max2==Integer.MIN_VALUE)
        max2 = -1;
        
       System.out.println(max+" "+max2);
        
    }
}