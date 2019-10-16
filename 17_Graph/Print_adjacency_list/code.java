{
//Initial Template for Java
import java.util.*;
import java.io.*;
import java.lang.*;
class DriverClass
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            int nov = sc.nextInt();
            int edg = sc.nextInt();
            
            for(int i = 0; i < nov+1; i++)
                list.add(i, new ArrayList<Integer>());
            for(int i = 1; i <= edg; i++)
            {
                int u = sc.nextInt();
                int v = sc.nextInt();
                list.get(u).add(v);
                list.get(v).add(u);
            }
            new Adjacency().printAdjacencyList(list, nov);
        }
    }
}
}
/*This is a function problem.You only need to complete the function given below*/
//User function Template for Java
/*
ArrayList<ArrayList<Integer>> list: to represent graph containing 'v' vertices
                                      and edges between them
v: represent number of vertices in a graph
*/
class Adjacency 
{
    static void printAdjacencyList(ArrayList<ArrayList<Integer>> list, int v)
	{
	    for(int i=0;i<v;i++){
	        System.out.print(i);
	        for(Integer j : list.get(i))
	            System.out.print("-> "+j);
	           
	       System.out.println();
	    }
	}
}