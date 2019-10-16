{

import java.util.*;
import java.lang.*;
import java.io.*;
public class GFG {
    public static int N =0;
	public static void main (String[] args) {
		//code
		Scanner a = new Scanner(System.in);
		int T= a.nextInt();
		for(int z=0;z<T;z++)
		{
		 N = a.nextInt();
		 int[][] arr = new int[N][N];
		 for(int y=0;y<N;y++)
		 {
		     for(int o=0;o<N;o++)
		     arr[y][o]= a.nextInt();
		 }
		 
		 new solve().solveMaze(arr, N);
	    }
	}
	public static void printSolution(int[][] arr)
	{
	    for(int i=0;i<N;i++)
	    {
	       for(int j=0;j<N;j++)
	       {
	         System.out.print(arr[i][j]+" ");
	       }
	       System.out.println();
	    }
	}
	
	
}

}
/*This is a function problem.You only need to complete the function given below*/

class solve{
    public static void solveMaze(int[][] a, int N)
	{
	    int sol[][]= new int [N][N];
	    
	    if(fun(a,N,0,0,sol)){
	        for(int i=0;i<N;i++){
	            for(int j=0;j<N;j++)
	                System.out.print(sol[i][j]+" ");
	           System.out.println();
	        }
	    }else{
	        System.out.println("-1");
	    }
	    //return false;
	}
	public static boolean fun(int[][] a, int N,int x,int y,int sol[][]){
	    
	    if(x == N-1 && y == N-1){
	       sol[x][y]=1;
	        return true;
	    }
	    
	    if(isSafe(a,x,y,N)==true){
	        sol[x][y]=1;
	        
	        for(int i=1;i<=a[x][y] && i < N;i++){
	        
	        
	            if(fun(a,N,x,y+i,sol)==true)
	                return true;
	                
	            if(fun(a,N,x+i,y,sol)==true)
	                return true;
	            
	       
	        }
	        sol[x][y]=0;
	        return false;
	    }
	    return false;
	}
	
	 static boolean isSafe(int maze[][], int x, int y,int N)  
    { 
          
        
        if (x >= 0 && x < N && y >= 0 &&  
             y < N && maze[x][y] != 0) 
        { 
            return true; 
        } 
  
        return false; 
    } 
}
