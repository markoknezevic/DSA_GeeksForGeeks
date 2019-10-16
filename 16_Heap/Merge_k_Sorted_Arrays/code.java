{
import java.util.*;
class Merge{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
			int n = sc.nextInt();
			int[][] a = new int[n][n];
			for(int i = 0; i < n; i++)
				for(int j = 0; j < n; j++)
					a[i][j] = sc.nextInt();
			GfG g = new GfG();
			ArrayList<Integer> arr= g.mergeKArrays(a, n);
			printArray(arr,n*n);
		}
	}
	public static void printArray(ArrayList<Integer> arr, int size){
		for(int i = 0; i < size ; i++)
			System.out.print(arr.get(i)+" ");
		System.out.println();
	}
}
}
/*This is a function problem.You only need to complete the function given below*/
/*Complete the function below*/
class GfG
     {
        public static ArrayList<Integer> mergeKArrays(int[][] arrays,int k) 
          {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
           for(int i=0;i<k;i++){
               for(int j=0;j<k;j++)
                pq.add(arrays[i][j]);
           }
           ArrayList<Integer> a = new ArrayList<Integer>();
           while(pq.isEmpty() == false)
                a.add(pq.poll());
                
                
 
                
                return a;
          }
}