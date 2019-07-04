{
//Initial Template for Java
import java.util.*;
import java.io.*;
import java.lang.*;
class Sorting
{
    static void printSorted(ArrayList<Integer> list)
    {
        for(Integer x : list)
        System.out.print(x + " ");
    }
    public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- >0)
		{
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int c = sc.nextInt();
		    
		    int A[] = new int[a];
		    int B[] = new int[b];
		    int C[] = new int[c];
		    
		    for(int i = 0; i < a; i++)
		      A[i] = sc.nextInt();
		      
		    for(int i = 0; i < b; i++)
		      B[i] = sc.nextInt();
		      
		    for(int i = 0; i < c; i++)
		      C[i] = sc.nextInt();
		    
		    printSorted(new MergeThree().merge3sorted(A, B, C));
		    System.out.println();
		    
		}
	}
}
}
/*This is a function problem.You only need to complete the function given below*/
//User function Template for Java
class MergeThree
{
    // Function to merge three sorted arrays
    // A[], B[], C[]: input arrays
    static ArrayList<Integer> merge3sorted(int A[], int B[], int C[])
    {
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(int i : A){
            list.add(i);
        }
        
        for(int i : B){
            list.add(i);
        }
        
        for(int i : C){
            list.add(i);
        }
        Collections.sort(list);
        
        return list;
    }
}
