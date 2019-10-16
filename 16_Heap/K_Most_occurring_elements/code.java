{
import java.io.*;
import java.util.*;
import java.lang.*;
class GfG {
    
    
    public static void main (String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    String inputLine[] = br.readLine().trim().split(" ");
		    int n = Integer.parseInt(inputLine[0]);
		    inputLine = br.readLine().trim().split(" ");
		    int[] arr = new int[n];
		    for(int i=0; i<n; i++){
		        arr[i]=Integer.parseInt(inputLine[i]);
		    }
		    int k = Integer.parseInt(br.readLine().trim());
		    new solve().kMostOccuring(arr, n, k);
		}
	}
}
}
/*This is a function problem.You only need to complete the function given below*/
class solve{
    void kMostOccuring(int arr[], int n, int k){
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        PriorityQueue <Integer> pq = new PriorityQueue <Integer>(Collections.reverseOrder());
        
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i]) == true){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }
        
        for(Integer i : map.values()){
            pq.add(i);
        }
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=pq.poll();
        }
        System.out.println(sum);
        
    }
}