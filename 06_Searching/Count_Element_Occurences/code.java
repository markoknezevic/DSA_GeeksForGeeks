{
/*package whatever //do not write package name here */
import java.io.*;
import java.util.*;
class Driverclass {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    int n = sc.nextInt();
		    int[] arr = new int[n];
		    for(int i=0; i<n; i++){
		        arr[i] = sc.nextInt();
		    }
		    int k = sc.nextInt();
		    
		    System.out.println(new CountElement().countOccurence(arr, n,  k));
		}
	}
}

}
/*This is a function problem.You only need to complete the function given below*/
class CountElement {    
    
    // Function to find element with count more than n/k times
    // arr: input array
    public int countOccurence(int[] arr, int n, int k)
    {
        int elm = n/k;
        int count = 0;
        int fin=0;
        Arrays.sort(arr);
        
        
        for(int i=0;i<n-1;i++){
            if(arr[i] == arr[i+1]){
                count++;
                
            }else{
                if(count+1>elm)
                    fin++;
                count=0;
            }
        }
            
        if(count+1>elm)
            fin++;
            
        return fin;
    }
    
}
