import java.util.*;
import java.io.*;
import java.lang.*;
//Position this line where user code will be pasted.
class Rotate {
    
    public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    int n = Integer.parseInt(br.readLine());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split("\\s+");
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		   
		 SortedRotated obj = new SortedRotated();
        
        if(!(obj.checkRotatedAndSorted(arr, n)))
            System.out.println("No");
        else
            System.out.println("Yes");
		}
	}
}

}
/*This is a function problem.You only need to complete the function given below*/
class SortedRotated{    
    
    // Function to check if array is sorted and rotated
    // arr[]: input array
    // num: size of array
    public static boolean checkRotatedAndSorted(int arr[], int num){
        int max=0,min=arr[0];
        boolean inc=false,ans=true,dec=false;
        
     for(int i=0;i<num;i++){
         min = Math.min(min,arr[i]);
         max = Math.max(max,arr[i]);
     }
     
     for(int i=0;i<num-1;i++){
        if(arr[i]==max&&arr[i+1]==min)
            inc=true;
     }
     for(int i=0;i<num-1;i++){
        if(arr[i]==min&&arr[i+1]==max)
            dec=true;
     }
     
     
     if(inc){
         for(int i=0;i<num-1;i++){
             if(!((arr[i]<arr[i+1]&&arr[0]>arr[num-1])||(arr[i]==max&&arr[i+1]==min))){
                 
                ans=false;
             }
         }
          
     }else if(dec){
             for(int i=0;i<num-1;i++){
                 if(!((arr[i]>arr[i+1]&&arr[0]<arr[num-1])||(arr[i]==min&&arr[i+1]==max))){
                     
                    ans=false;
                 }
             }
         }else{
         ans=false;
     }
     
     
    
        return ans;
    }
    
}
