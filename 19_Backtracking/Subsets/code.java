{
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    
    
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		for(int t=0;t<testCases;t++){
		    int n = sc.nextInt();
		    int arr[] = new int[n];
		    for(int i=0;i<n;i++){
		        arr[i] = sc.nextInt();
		    }
		    Arrays.sort(arr);
		    System.out.print("()");
		    new solve().printAllSubsets(arr,n);
		    System.out.println();
		}
	}
}
}
/*This is a function problem.You only need to complete the function given below*/
class solve{
    // printing the output
    public static void printList(List<Integer> list){
        System.out.print("(");
        int x = list.size();
        for(int i=0;i<x;i++){
            if(i==x-1){
                System.out.print(list.get(i));
            } else {
                System.out.print(list.get(i)+" ");
            }
        }
        System.out.print(")");
    }
    
    public static void printAllSubsetsHelper(int arr[],int start, int n, List<Integer> list){
        if(start>=n){
            return;
        }
        
        for(int i=start;i<n;){
            list.add(arr[i]);
            printList(list);
            printAllSubsetsHelper(arr, i+1, n, list);
            int j = i+1;
            while(j<n && arr[j]==arr[i]){
                j++;
            }
            i = j;
            list.remove(list.size()-1);
        }
        
    }
    
    public static void printAllSubsets(int arr[], int n){
        printAllSubsetsHelper(arr,0,n,new ArrayList<Integer>());
    }
    
}