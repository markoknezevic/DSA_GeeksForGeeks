
import java.io.*;
import java.util.*;
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
		    
		    Leader obj = new Leader();
		    
		    StringBuffer str = new StringBuffer();
		    ArrayList<Integer> res = new ArrayList<Integer>();
		    res = obj.leaders(arr, n);
		    
		    for(int i=res.size()-1; i>=0; i--){
		        str.append(res.get(i)+" ");
		    }
		    System.out.println(str);
		}
		
	}
}

}

/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/


class Leader{
    
    // This functions find the leaders in the array and returns
    // arraylist containing the leaders
    // arr: input array
    // n: size of array
    static ArrayList<Integer> leaders(int arr[], int n){
        int max=arr[n-1];
        ArrayList<Integer> lst=new ArrayList<Integer>();
        for(int i=n-1;i>=0;i--){
            if(max<=arr[i]){
                max=arr[i];
                lst.add(max);
            }
        }
        return lst;
        
    }
    
}