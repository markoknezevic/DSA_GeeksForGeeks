{
import java.io.*;
import java.util.*;
class GFG {
    
   //Position this line where user code will be pasted.
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    int hashSize = Integer.parseInt(br.readLine().trim());
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>(hashSize);
		    for(int i=0; i<hashSize; i++){
		        res.add(new ArrayList<Integer>());
		    }
		    separateChaining(arr, n, res, hashSize);
		    for(int i=0;i<res.size();i++) {
	            if(res.get(i).size()>0) {
	                System.out.print(i+"->");
	                for(int j=0; j<res.get(i).size()-1; j++) {
	                    System.out.print(res.get(i).get(j) + "->");
	                }
	                System.out.print(res.get(i).get(res.get(i).size()-1));
	                System.out.println();
	            }
	        }
		}
	}
}
}
/*This is a function problem.You only need to complete the function given below*/
//Complete this function
public static void separateChaining(int arr[], int n, ArrayList<ArrayList<Integer>> hashTable, int hashSize)
{
    for(int i=0;i<n;i++){
        int k=(arr[i]%hashSize);
        hashTable.get(k).add(arr[i]);
    }
}